/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author denis
 */
public class Persona {
    
    //ATRIBUTOS
    public String nombre;
    public int dni;
    public int edad;
    
    
    //CONSTRUCTOR ,HACE QUE LOS PARAMETROS RECIBIDOS SE CONVIERTAN EN ATRIBUTOS DEL OBJETO
    public Persona(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    
    
   
}
