/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**Definir una clase llamada Puntos que contendrá las coordenadas
 * de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada
 * x e y un punto. Generar un objeto puntos usando un método crearPuntos()
 * que le pide al usuario los dos números y los ingresa en los atributos
 * del objeto. Después, a través de otro método calcular y devolver la
 * distancia que existe entre los dos puntos que existen en la clase Punto
 *
 * @author denis
 */
public class Punto {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Punto() {
    }

    public Punto(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese del primer punto coordenada X");
        this.x1 = leer.nextFloat();
        System.out.println("Ingrese del primer punto coordenada y");
        this.y1 = leer.nextFloat();
        System.out.println("Ingrese del segundo punto coordenada x");
        this.x2 = leer.nextFloat();
        System.out.println("Ingrese del segundo punto coordenada y");
        this.y2 = leer.nextFloat();
    }
    
    
    // través de otro método calcular y devolver la
    //  distancia que existe entre los dos puntos que existen en la clase Punto
    public double calcularDistancia(){
        double distancia = (float) Math.sqrt( (Math.pow(x2-x1,2))+ (Math.pow(y2-y1,2)));
        return distancia;
    }
    
}
