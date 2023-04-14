
package Servicio;

import Entidad.Cafetera;
import Entidad.Taza;
import java.util.Scanner;

/**Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos
 * capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
    Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño 
    * de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad
    * actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará
    * al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe 
    * y se añade a la cafetera la cantidad de café indicada. 
 *
 * @author denis
 */
public class CafeteraServicio {
       Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera cx){
        cx.setCantidadActual(cx.getCapacidadMaxima());
        System.out.println("Cafetera llena");
        System.out.println(cx.getCantidadActual()+" de "+cx.getCapacidadMaxima()+" centilitros");
    }
    
    public void servirTaza(Cafetera cx){
        System.out.println("Tamano de Taza s/m/l :");
        Taza tazax = new Taza(leer.next());
        if(cx.getCantidadActual()<tazax.getCapacidad()){
            System.out.println("No queda mucho Cafe , se llenara la taza hasta donde pueda");
            tazax.setCantidadActual(cx.getCantidadActual());
            cx.setCantidadActual(cx.getCantidadActual()-tazax.getCantidadActual());
            System.out.println("Taza de tamano "+tazax.getTamanoTaza()+ " llena con sus "+ tazax.getCantidadActual()+" centilitros de "+tazax.getCapacidad()+" centilitros");
            }else{
            System.out.println("Llenando taza de Tamano "+tazax.getTamanoTaza());
            servir(cx,tazax);
            System.out.println("Quedan "+cx.getCantidadActual()+" centilitros en cafetera.");
            System.out.println("Taza "+tazax.getTamanoTaza()+ " llena con sus "+ tazax.getCantidadActual()+" centilitros de "+tazax.getCapacidad()+" centilitros");
        }
        }
    
    
    public void servir(Cafetera cafe , Taza taza){
            taza.setCantidadActual(taza.getCapacidad());
            cafe.setCantidadActual(cafe.getCantidadActual()-taza.getCantidadActual());
    }
    
    //vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(Cafetera recipiente){
        recipiente.setCantidadActual(0);
        System.out.println("Cafetera con :"+recipiente.getCantidadActual()+" centilitros" );
    }
    
    //agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe 
    public void agregarCafe(Cafetera recipiente){
        System.out.println("Cuenta Cafe desea llenar");
        double litrosCafe = leer.nextDouble();
        if((recipiente.getCantidadActual()+litrosCafe)>recipiente.getCapacidadMaxima()){
            litrosCafe = (recipiente.getCantidadActual()+litrosCafe)- recipiente.getCapacidadMaxima();
            recipiente.setCantidadActual(recipiente.getCapacidadMaxima());
            System.out.println("Se Lleno el Recipiente hasta su Capacidad maxima");
            System.out.println(recipiente.getCantidadActual()+" de "+recipiente.getCapacidadMaxima()+" centilitros");
            System.out.println("Desperdicio por desbordamiento "+litrosCafe+" centilitros");
        }else{
            System.out.println("Llenando recipiente");
            recipiente.setCantidadActual(recipiente.getCantidadActual()+litrosCafe);
            System.out.println(recipiente.getCantidadActual()+" de "+recipiente.getCapacidadMaxima()+" de la Cafetera");
        }
    }
    
    public void nessPreso(){
        boolean on = true;
        Cafetera cafetera = new Cafetera();
        do{
            
            System.out.println(" 1.Llenar Cafetera \n 2.Servir Taza \n 3.Vaciar Cafetera\n 4.Agregar Cafe \n 5.Apagar");
            int button = leer.nextInt();
            switch(button){
                case 1 :
                    llenarCafetera(cafetera);
                    break;
                case 2 :
                    servirTaza(cafetera);
                    break;
                case 3 :
                    vaciarCafetera(cafetera);
                    break;
                case 4 :
                    agregarCafe(cafetera);
                    break;
                case 5 :
                    on = false;
                    break;
                default :
                    System.out.println("Opcion ingresa es Incorrecta, Vuelva a Intentarlo");
                break;
            }
        }while(on == true);
    }
    
    
    }
    

