/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Hecho por Mauro
 * @author Mauro
 */
public class Empleado {
    
    private String nombre ;
    private int edad ;
    private double salario ;
    
    Scanner leer = new Scanner ( System.in ) ;
    
    public void Registro (){
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = leer.nextLine() ;
        System.out.print("Ingrese la edad del empleado: ");
        edad = leer.nextInt();
        System.out.print("Ingrese el salario actual del empleado: ");
        salario = leer.nextDouble() ;
    }
    
    public void calcular_aumento(){
        if (edad > 30){
            salario = Math.round(salario * 1.1) ;
            System.out.println("Su salario aumentado es de " + salario) ;
        }
        else {
            salario = Math.round(salario *1.05) ;
            System.out.println("Su salario aumentado es de " + salario) ;
        }
    }
    
    
    
    
}
