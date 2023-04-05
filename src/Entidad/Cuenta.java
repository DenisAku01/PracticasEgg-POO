/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
 * de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
 * negativo después de realizar una transacción de retiro.
 *
 * @author denis
 */
public class Cuenta {
    private double saldo;
    private String titular;
    Scanner leer = new Scanner(System.in);
    public void registro(){
        
        System.out.println("Ingrese su nombre senor titular uwu");
        this.titular = leer.nextLine();
        System.out.println("Ingrese su salgo actual, aunque usted no deberia ingresar eso");
        this.saldo= leer.nextDouble();
        System.out.println("CUENTA CREADA DE MANERA EXITOSA");
    }
    
    public void retirar_dinero(){
        System.out.println("Cuanto dinero quiere retirar don "+titular+" el dia de hoy?");
        double monto = leer.nextDouble();
        if(saldo<monto){
            System.out.println("No tiene suficiente dinero , pobre de mierda");
        }else{
            System.out.println("Extraccion Exitosa");
            saldo= saldo - monto;
            System.out.println("Su saldo Actual Ahora es de $"+saldo);
        }
    }
    
}
