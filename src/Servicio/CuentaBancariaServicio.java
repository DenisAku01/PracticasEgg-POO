/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), 
 * dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
    Agregar la clase.
    CuentaBancariaServicio en el paquete Servicios que contenga:
    Método para crear cuenta pidiéndole los datos al usuario.
    Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
    * Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 *
 * @author denis
 */
public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    
    //Crea una Cuenta a Cero
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese el numero de Usuario");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese Su Numero de Dni");
        long dni = leer.nextLong();
        System.out.println();
        CuentaBancaria cx = new CuentaBancaria(numCuenta,dni);
        return cx;
    }
    
    public void mostrarEstadoCuenta(CuentaBancaria px){
        System.out.println("DNI : "+ px.getDniCliente()+ "\n Numero de Cuenta : "+px.getNumeroCuenta()+ "\n Saldo Actual: "+ px.getSaldoActual());
    }
    
    //ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public CuentaBancaria ingresar(CuentaBancaria cx){
        System.out.println("Ingrese Monto a Ingresar :");
        double monto = leer.nextDouble();
        cx.setSaldoActual(cx.getSaldoActual()+ monto);
        return cx;
    }
    
    
    //  recibe una cantidad de dinero a retirar y se le restara al saldo actual
    public CuentaBancaria retirar(CuentaBancaria cx){
        if(cx.getSaldoActual() <= 0 ){
            System.out.println("No Tiene Saldo suficiente para retirar \n Saldo Actual"+ cx.getSaldoActual() );
        }else{
            
            System.out.println("Ingrese la Cantidad de dinero a Retirar:");
            double montoRetiro = leer.nextDouble();
            cx.setSaldoActual(cx.getSaldoActual()- montoRetiro);
            mostrarEstadoCuenta(cx);
            return cx;
        }
    }
    
    
    //extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public void extraccionRapida(CuentaBancaria cx){
        System.out.println("Seguro que desea una Extraccion Rapida S/N");
        String valor = leer.next();
        if("s".equalsIgnoreCase(valor)){
            cx.setSaldoActual(cx.getSaldoActual()*0.8);
        }else{
            System.out.println("Regresando al Menu");
        }
    }
    
}
