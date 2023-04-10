/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtraPOO;

import Entidad.Empleado;

/**
 *
 * @author denis
 */
public class EjercicioExtra5 {

    /**Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
     * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un
     * empleado en función de su edad y salario actual. El aumento salarial debe ser
     * del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado em1 = new Empleado();
        em1.Registro();
        em1.calcular_aumento();
        
        
    }
    
}
