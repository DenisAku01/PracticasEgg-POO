/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: 
* "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces 
* se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con
* otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase
* ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase,
* por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario
* y devuelve verdadero si la contiene y falso si no.
 *
 * @author denis
 */
public class CadenaServicio {
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena frase){
        int contador = 0;
        for (int i = 0; i < frase.getLongitud() ; i++) {
            String letra = frase.getFrase().substring(i,i+1);
            if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u") ){
            contador ++;
            }
        }
        System.out.println("La cantidad de Vocales de la frase es: "+ contador);
    }
    
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo:
    //Entrada: 
    //  * "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena frase){
        String fraseInvertida = "";
        for (int i = frase.getLongitud()-1; i > -1; i--) {
            //System.out.println(" i" + i);
            String letra = frase.getFrase().substring(i,i+1);
            //System.out.println("Letra "+ letra);
            fraseInvertida += letra;
            //System.out.println("FraseInvertida "+ fraseInvertida);
        }
        System.out.println(fraseInvertida);
    }
    
    //    Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
    //usuario y contabilizar cuántas veces 
    //* se repite el carácter en la frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(Cadena frase, String letra){
        int contador = 0;
        for (int i = 0; i < frase.getLongitud() ; i++) {
            String letraComparar = frase.getFrase().substring(i,i+1);
            if(letra.equalsIgnoreCase(letraComparar)){
            contador ++;
            }
        }
        System.out.println("La cantidad de veces que aparece su letra '"+letra+"' es de "+ contador+ " veces.");
    }
    
    //Método compararLongitud(String frase), deberá comparar la longitud
    //de la frase que compone la clase con
    // otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena frase, String frase2){
        if(frase.getFrase().length() == frase2.length()){
            System.out.println("Sus Frases son Iguales en Longitud");
        }else{
            System.out.println("Su Frase no tiene la misma longitud");
        }
    }
    
    //Método unirFrases(String frase), deberá unir la frase
    //contenida en la clase Cadena con una nueva frase
    //ingresada por el usuario y mostrar la frase resultante.
    public void unirFrase(Cadena frase){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase para concatenar a la primera ya escrita");
        String frase2 = leer.nextLine();
        frase.setFrase(frase.getFrase()+" "+frase2);
        System.out.println(frase.getFrase());
    }
    
   // Método reemplazar(String letra), deberá reemplazar todas las 
    //letras “a” que se encuentren en la frase,
   // por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    public void reemplazar(Cadena frase,String letra){
        String nuevaFrase = "";
        for (int i = 0; i < frase.getLongitud(); i++) {
            String letraFrase = frase.getFrase().substring(i,i+1);
            
            if(letraFrase.equalsIgnoreCase("a")){
                nuevaFrase += letra;
                
            }else{
                nuevaFrase+=letraFrase;
            }
//            System.out.println("nueva Frase" + nuevaFrase);
        }
        System.out.println("Esta es su nueva Frase con la 'a' Reemplazada :"+ nuevaFrase);
    }
    
    //Método contiene(String letra), deberá comprobar si la frase
    //contiene una letra que ingresa el usuario
    //y devuelve verdadero si la contiene y falso si no.
    public void contiene(Cadena frase,String letra){
        boolean contiene = false;
        for (int i = 0; i < frase.getLongitud(); i++) {
            String letraFrase = frase.getFrase().substring(i,i+1);
            if(letraFrase.equalsIgnoreCase(letra)){
                contiene = true;
                
            }
        }
        if(contiene){
            System.out.println("Su frase si Contiene esa letra");
        }else{
            System.out.println("Su frase no contiene esa letra");}
       
    }
    
}


