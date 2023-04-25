/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ParDeNumeros;

/**Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales 
 * con los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un
 * constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random
 * para generar los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios,
 * que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado 
* al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes
* de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 *
 * @author denis
 */
public class ParDeNumerosService {
    
    // Rellena el los numeros del objeto pardenumero y lo devuelve
    public ParDeNumeros llenarNums(){
        ParDeNumeros nums = new ParDeNumeros();
        return nums;
    }
    // Muestra los valores del objeto ParDeNumeros 
    public void MostrarValores(ParDeNumeros n){
        System.out.println("Numero1 :" + n.getNum1());
        System.out.println("Numero2 :"+ n.getNum2());
    }
    // Devuelve el numero mayor del objeto ParDeNumeros
    public double devolverMayor(ParDeNumeros n){
        if(n.getNum1()>n.getNum2()){
            return n.getNum1();
        }else{
            return n.getNum2();
        }
    }
    public double devolverMenor(ParDeNumeros n){
        if(n.getNum1()<n.getNum2()){
            return n.getNum1();
        }else{
            return n.getNum2();
        }
        
    }
    //
    public double CalcularPotencia(ParDeNumeros n){
        double mayor = Math.round(devolverMayor(n));
        double menor = Math.round(devolverMenor(n));
        double resultado = Math.round(Math.pow(mayor, menor));
        System.out.println("la Base es :"+ mayor+" con Exponente :"+ menor+" Resultado :"+ resultado);
        return resultado;
    } 
    
    public double calcularRauz(ParDeNumeros n){
        double resultado = Math.sqrt(Math.abs(devolverMenor(n)));
        return resultado;
    }
    
}
