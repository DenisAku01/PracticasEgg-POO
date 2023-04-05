/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPOO;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author denis
 */
public class Ejercicio4 {

    /**Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
     * base y un atributo privado altura. La clase incluirá un método para crear el 
     * rectángulo con los datos del Rectángulo dados por el usuario. También incluirá 
     * un método para calcular la superficie del rectángulo y un método para calcular 
     * el perímetro del rectángulo. Por último, tendremos un método que dibujará el 
     * rectángulo mediante asteriscos usando la base y la altura. Se deberán además
     * definir los métodos getters, setters y constructores correspondientes.
        Superficie = base * altura / Perímetro = (base + altura) * 2.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Altura");
        double altura = leer.nextDouble();
        System.out.println("Ingrese la base del rectangulo");
        double base = leer.nextDouble();
        Rectangulo primerRectangulo = new Rectangulo(base,altura);
        primerRectangulo.crearRectangulo(base, altura);
        System.out.println("Rectangulo Hecho:" +primerRectangulo.isRectanguloHecho());
        
        
        double superficie = primerRectangulo.superficie(base, altura);
        double perimetro = primerRectangulo.perimetro(base, altura);
        
        
        System.out.println("Superficie: " +superficie+ "Perimetro: "+perimetro);
        primerRectangulo.dibujar(base,altura);
        
        
        
    }
    
}
