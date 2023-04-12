/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtraPOO;

import Entidad.Cuenta;

/**Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
 * de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
 * negativo después de realizar una transacción de retiro.
 *
 * @author denis
 */
public class Ejercicio4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta Cuenta1 = new Cuenta();
        //while switch
        Cuenta1.registro();
        Cuenta1.retirar_dinero();
        Cuenta cuenta2 = new Cuenta();
        cuenta2.registro();
        cuenta2.retirar_dinero();
        
    }
    
}
