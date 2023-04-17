/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad,
 * sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo,
 * puede hacerlo. Agregar constructores, getters y setters.
    En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después
    * se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo 
    * introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
    * Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo
    * de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
    * (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente,
    * si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y 
    * la función devuelve un 1.
 *
 * @author denis
 */
public class Persona3 {
    private String nombre ;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private double imc ;
    private boolean mayorDeEdad;

    public Persona3(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona3() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public boolean isMayorDeEdad() {
        return mayorDeEdad;
    }

    public void setMayorDeEdad(boolean mayorDeEdad) {
        this.mayorDeEdad = mayorDeEdad;
    }
    
    
    
}
