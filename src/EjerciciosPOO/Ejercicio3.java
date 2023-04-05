/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPOO;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author denis
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operacion operacion = new Operacion(); 
        
        System.out.println("Ingrese el primer");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo");
        int num2 = leer.nextInt();
        
        //asignarle al objeto los nuevo valores num1 y num2
        operacion.crearOperacion(num1, num2);
        
        
        //asignando el valor que devuelve a una variable llamada r1 y lo muestro por pantalla
        int r1 = operacion.sumar();
        System.out.println(r1);
        
        int r2 = operacion.resta();
        System.out.println(r2);
        
        
        //mostrar directamente por pantalla el objet.metodo que devuelve el resultado
        System.out.println(operacion.multiplicar());
        System.out.println(operacion.dividir());
        
        
        
        
        
    }

    

    
    
}
