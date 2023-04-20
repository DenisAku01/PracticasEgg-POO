/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona3;
import java.util.ArrayList;
import java.util.Scanner;

/**Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad,
 * sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo,
 * puede hacerlo. Agregar constructores, getters y setters.
    En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después
    * se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo 
    * introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
    * Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo
    * de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
    * (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente,
    * si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y 
    * la función devuelve un 1.
    * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto,
    * deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar
    * para cada objeto si la persona es mayor de edad.
        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), 
    * para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y 
    * cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, 
    * podemos crear unos métodos adicionales.
 *
 * @author denis
 */
public class PersonaServicio3 {
    
    // 
    ArrayList<Persona3> pesoPersonas = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    
    
    
    public Persona3 CrearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese el edad de la persona");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo de la persona");
        char s = leer.next().charAt(0);
        char p = comprobarSexo(s);
        System.out.println("Ingrese el peso de la persona");
        double peso = leer.nextDouble();
        System.out.println("Ingrese el Altura de la persona");
        double altura = leer.nextDouble();
        Persona3 personax = new Persona3(nombre,edad,p,peso,altura);
        pesoPersonas.add(personax);
        return personax;
    }
    
    public char comprobarSexo(char s){
        do{
            if(s == 'M'|| s == 'F'|| s == 'O'){
                return s;
            } else {
                System.out.println("El sexo Ingresado es Incorrecto  M/F/O");
                s = leer.next().charAt(0);
                        
            }
            
        }while(s != 'M'|| s != 'F'|| s != 'O');
        return s;
    }
    
    
    
    public boolean esMayorDeEdad(Persona3 px){
        boolean esMayor = 18 <=  px.getEdad();
        px.setMayorDeEdad(esMayor);
        return esMayor;
    }
    
//    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
//    * Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo
//    * de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
//    * (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente,
//    * si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y 
//    * la función devuelve un 1.
    public int calcularIMC(Persona3 px){
        double imc = px.getPeso()/(Math.pow(px.getAltura(), 2));
        px.setImc(imc);
        if(imc < 20 ){
            return -1;
        }else if( imc > 25){
            return 1;
        }
        return 0 ;
    }
    
//    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos 
   // todos los métodos para cada objeto,
//    * deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por
         //   debajo de su peso ideal e indicar
//    * para cada objeto si la persona es mayor de edad.
//        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
                   // en distintas variables(arrays), 
//    * para después calcular un porcentaje de esas 4 personas cuantas están por debajo de
             //               su peso, cuantas en su peso ideal y 
//    * cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores
                            //de edad y cuantos menores. Para esto, 
//    * podemos crear unos métodos adicionales.
    
    public void  comprobarEstado(Persona3 px){
        //deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por
         //   debajo de su peso ideal e indicar
         System.out.println(" NOMBRE :"+ px.getNombre());
         int peso = calcularIMC(px);
        switch (peso) {
            case -1:
                System.out.println("ESTADO DE PESO : POR DEBAJO DE LA MEDIA ");
                System.out.println("IMC : "+ px.getImc());
                break;
            case 1:
                System.out.println("ESTADO DE PESO : SOBREPESO ");
                System.out.println("IMC : "+ px.getImc());
                break;
            default:
                System.out.println("ESTADO DE PESO : PESO IDEAL ");
                System.out.println("IMC : "+ px.getImc());
                break;
        }
        //para cada objeto si la persona es mayor de edad
        boolean mayorDeEdad = esMayorDeEdad(px);
        if(mayorDeEdad){
            System.out.println("Mayoria de Edad : Verdadero");
            System.out.println("Edad :"+ px.getEdad());
        }else{
            System.out.println("Mayoria de Edad : falso");
            System.out.println("Edad :"+ px.getEdad());
            }
    }
    
    
    public void EstadisticasGenerales(){
//para después calcular un porcentaje de esas 4 personas cuantas están por debajo de
// su peso, cuantas en su peso ideal y 
//  cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores
//de edad y cuantos menores.
    double mayores = 0;
    double menor = 0;
    double delgados = 0 ;
    double normales = 0;
    double gordosTetones= 0;
        for (Persona3 pesoPersona : pesoPersonas) {
            if(pesoPersona.isMayorDeEdad()){
                mayores++;
                System.out.println("Mayores++ :"+ mayores );
            }else{
                menor++;
                 System.out.println("menores++ :"+ menor);
            }
            int peso = calcularIMC(pesoPersona);
        switch (peso) {
            case 1:
                gordosTetones++;
                break;
            case -1:
                delgados++;
                break;
            default:
                normales++;
                 System.out.println("normales++ :"+ normales );
                break;
        }
            
        }
        
        
     double porcentajeMayores = (mayores/pesoPersonas.size())*100;
     double porcentajeMenores = (menor/pesoPersonas.size())*100;
     double porcentajedelgadis = (delgados/pesoPersonas.size())*100;
     double porcentajeNorm = (normales/pesoPersonas.size())*100;
     double porcentajeTetas = (gordosTetones/pesoPersonas.size())*100;
     
        System.out.println("PORCENTAJE DE MAYORES:" + porcentajeMayores+ "%");
        System.out.println("PORCENTAJE DE MENORES:" + porcentajeMenores+ "%");
        System.out.println("PORCENTAJE DE DELGADOS:" + porcentajedelgadis+ "%");
        System.out.println("PORCENTAJE DE NORMALES:" + porcentajeNorm+ "%");
        System.out.println("PORCENTAJE DE SOBREPESO:" + porcentajeTetas+ "%");
     
        
        
    }
    
    
    
    
    
}
