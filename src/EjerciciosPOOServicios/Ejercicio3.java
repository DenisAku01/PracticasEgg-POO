/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPOOServicios;


import Entidad.Persona3;
import Servicio.PersonaServicio3;

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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio3 planilla = new PersonaServicio3();
        Persona3 p1 = planilla.CrearPersona();
        Persona3 p2 = planilla.CrearPersona();
        Persona3 p3 = planilla.CrearPersona();
        Persona3 p4 = planilla.CrearPersona();
        
        planilla.comprobarEstado(p1);
        planilla.comprobarEstado(p2);
        planilla.comprobarEstado(p3);
        planilla.comprobarEstado(p4);
        
       planilla.EstadisticasGenerales();
       
        
        
    }
    
}
