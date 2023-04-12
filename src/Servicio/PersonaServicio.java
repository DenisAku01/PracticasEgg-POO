
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author denis
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona px = new Persona();
        System.out.println("Ingrese nombre de Persona");
        px.setNombre(leer.next());
        System.out.println("Ingrese su Edad");
        px.setEdad(leer.nextInt());
        System.out.println("Ingrese su DNI:");
        px.setDni(leer.nextInt());
        return px;
    }
    
    
    public void mostrarPersona(Persona px){
        System.out.println("Nombre: "+ px.getNombre());
        System.out.println("DNI :" + px.getDni());
        System.out.println("Edad :"+ px.getEdad());
        
    }
    
    
    
    
}
