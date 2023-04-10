/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
 * y un método "calcular_area" que calcule y devuelva el área del rectángulo.
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 
 * 4 y 6 y imprime el área del rectángulo.
 *
 * @author denis
 */
public class RectanguloExtra {
    private double lado1;
    private double lado2;

    public RectanguloExtra() {
    }
    
    public void calcular_area(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el lado 1 del rectangulo:");
    this.lado1 = leer.nextDouble();
        System.out.println("Ingrese el lado 2 del rectangulo");
    this.lado2 = leer.nextDouble();
    double area = lado1*lado2;
        System.out.println("el Area del Rectangulo es "+ area+  " al cuadrado");
    
    }
    
    
    
}
