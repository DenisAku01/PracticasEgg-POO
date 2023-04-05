/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
    Método constructor que inicialice el radio pasado como parámetro.
    Métodos get y set para el atributo radio de la clase Circunferencia.
    Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
    Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 * @author denis
 */
public class Circunferencia {
    private double Radio = 4.0;
    
    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    public void crearCircuferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        this.Radio = leer.nextDouble();
        
    }
    public double area(){
        double area = Math.PI * Radio * Radio;
        return area;
    }
    public double perimetro(){
    double perimeter = 2 * Math.PI * Radio;
    return perimeter;
    }
    
    
    
    
    
    
    
    
    
}
