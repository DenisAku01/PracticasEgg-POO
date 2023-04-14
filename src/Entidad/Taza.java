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
public class Taza {
    private String tamanoTaza;
    private double capacidad;
    private double cantidadActual;

    public Taza(String tamanoTaza) {
        if("s".equalsIgnoreCase(tamanoTaza)){
            this.tamanoTaza= "s";
            this.capacidad = 75;
            this.cantidadActual = 0;
            }else if("l".equalsIgnoreCase(tamanoTaza)){
                this.tamanoTaza= "l";
                this.capacidad = 500;
                this.cantidadActual = 0;
            }else{
                this.tamanoTaza= "m";
                this.capacidad = 250;
                this.cantidadActual = 0;
            }
    }
    
    public String getTamanoTaza() {
        return tamanoTaza;
    }

    public void setTamanoTaza(String tamanoTaza) {
        this.tamanoTaza = tamanoTaza;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
        
    }
    
    
    

