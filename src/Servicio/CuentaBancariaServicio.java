/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.ArrayList;
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
    //Crear el Administrador para ver el arrayDelasCuentas del Banco
    // Crearlo en una clase/Constructor 
    // que pueda Eliminar / Modifcar  / los Datos de la cuenta del array en el que estamos 
    
    Scanner leer = new Scanner(System.in);
    ArrayList<CuentaBancaria> misCuentas = new ArrayList<>() ;

    
    //Crea una Cuenta a Cero
    public CuentaBancaria crearCuenta(){
        
        System.out.println("Ingrese Su Numero de Dni");
        long dni = leer.nextLong();
        
        CuentaBancaria cx = new CuentaBancaria(dni);
        misCuentas.add(cx);
        
        return cx;
    }
    
    // USAR ESTA PARA EM MENU DE OPCIONES DEL ADMINISTRADOR
    public void mostrarEstadoCuenta(CuentaBancaria px){
        System.out.println("DNI : "+ px.getDniCliente()+ "\nNumero de Cuenta : "+px.getNumeroCuenta()+ "\nSaldo Actual: "+ px.getSaldoActual()+ "\nestado cuenta: "+ px.isActiva());
    }
    
    //ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public void ingresar(CuentaBancaria cx){
        System.out.println("Ingrese Monto a Depositar :");
        double monto = leer.nextDouble();
        
        cx.setSaldoActual(cx.getSaldoActual() + monto);
        consultarSaldo(cx);
    }
    
    //  recibe una cantidad de dinero a retirar y se le restara al saldo actual
    public void retirar(CuentaBancaria cx){
        if(cx.getSaldoActual() <= 0){
            System.out.println("No Tiene Saldo suficiente para retirar \n Saldo Actual"+ cx.getSaldoActual() );
        }else{
            
            System.out.println("Ingrese la Cantidad de dinero a Retirar:");
            double montoRetiro = leer.nextDouble();
            if(cx.getSaldoActual()> montoRetiro){
            cx.setSaldoActual(cx.getSaldoActual()- montoRetiro);
            consultarSaldo(cx);
            }else{
                System.out.println("Usted no Dispone del dinero Suficienta , su saldo es de:"+ cx.getSaldoActual());
            }
        }
        
    }
    
    
    //extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public void extraccionRapida(CuentaBancaria cx){
        System.out.println("Seguro que desea una Extraccion Rapida S/N");
        String valor = leer.next();
        if("s".equalsIgnoreCase(valor)){
            double montoRetirado = cx.getSaldoActual()*0.2;
            cx.setSaldoActual(cx.getSaldoActual()*0.8);
            System.out.println("Extraccion Realizada con exito, le quedan"+ cx.getSaldoActual());
            System.out.println("Extraccion fue de : $"+montoRetirado);
        }else{
            System.out.println("Regresando al Menu");
        }
    }
    
    //consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaBancaria cx){
        System.out.println("Su Saldo Actual Es "+ cx.getSaldoActual() );
    }
    
    // consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultaDatos(CuentaBancaria cx){
       mostrarEstadoCuenta(cx);
    }
    
    public void Cajero(){
        
        //si tengo 1 cuenta registrada se repetira este bucle,sino se repetira hasta que se cree una
        boolean on = true;
        do{
            System.out.println("================= Bienvenido al Cajero Denis de Egg =========================");
        System.out.println("Tiene una Cuenta en el banco? S/N");
        String cuenta = leer.next();
        if("s".equalsIgnoreCase(cuenta)){
            System.out.println("Ingrese su DNI:");
            long dni = leer.nextLong();
            for (int i = 0; i < misCuentas.size(); i++) {
                CuentaBancaria cuentaComprobar = misCuentas.get(i);
                if(dni == cuentaComprobar.getDniCliente()){
                    System.out.println("Ingreso con Exito");
                    cuentaComprobar.setActiva(true);
                    do{
                    int opcion = menu(cuentaComprobar);
                    eleccion(opcion,cuentaComprobar);
                }while(cuentaComprobar.isActiva()== true);
                }
            }
        }else{
            System.out.println("Desea crear una Cuenta? S/N");
            String respuesta = leer.next();
            if("s".equalsIgnoreCase(respuesta)){
                CuentaBancaria cuentaX = crearCuenta();
                cuentaX.setActiva(true);
                do{
                    int opcion = menu(cuentaX);
                    eleccion(opcion,cuentaX);
                }while(cuentaX.isActiva() == true);
            }
        }
        }while(on);
    
    }
    
    public int menu(CuentaBancaria cx){
        System.out.println("=============================");
        System.out.println(" 1.Ingresar \n 2.Retirar \n 3.Extraccion Rapida \n 4.Consultar Saldo \n 5.Consultar Datos \n 6.Mostrar Estado Cuenta \n 7.Salir");
        int opcion = leer.nextInt();
        return opcion;
    }
    
    
    public void salir(CuentaBancaria cx){
        cx.setActiva(false);
        
    }
    
    
    public void eleccion(int electa,CuentaBancaria cx){
        switch(electa){
            case 1 :
                ingresar(cx);
                break;
            case 2 :
                retirar(cx);
                break;
            case 3 :
                extraccionRapida(cx);
                break;
            case 4 :
                consultarSaldo(cx);
                break;
            case 5 :
                consultaDatos(cx);
                break;
            case 6 :
                mostrarEstadoCuenta(cx);
                break;
            case 7 :
                salir(cx);
                break;
            default :
                System.out.println("No Existe esa Opcion, Ingrese denuevo");
                break;
                
        }
    }
}
