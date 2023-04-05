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
public class Puntos {
    private float x1;
    private float x2;
    private float y1;
    private float y2;

    public Puntos() {
    }

    public Puntos(float x1, float x2, float y1, float y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getY2() {
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
    public float calcularDistancia(){
        float distancia = (float) Math.sqrt( (Math.pow(x2-x1,2))+ (Math.pow(y2-y1,2)));
        return distancia;
    }
    
}
