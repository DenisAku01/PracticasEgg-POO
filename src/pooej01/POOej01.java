/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author denis
 */
public class POOej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //   Persona primeraPersona = new Persona("Denis", 41977439, 23);
     //   int dni = primeraPersona.getDni();
     //   System.out.println("dni "+dni);
      //  primeraPersona.setDni(23431);
      //  System.out.println(primeraPersona.nombre);
      //  int dn2 = primeraPersona.getDni();
      //  System.out.println("dni "+dn2);
      PersonaServicio sp = new PersonaServicio();
      Persona primerPersona = sp.crearPersona();
      sp.mostrarPersona(primerPersona);
    }
    
}
