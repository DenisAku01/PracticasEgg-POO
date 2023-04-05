
package Entidad;

import java.util.Scanner;

/**Crea una clase "Juego" que tenga un método "iniciar_juego"
 * que permita a dos jugadores jugar un juego de adivinanza de 
 * números. El primer jugador elige un número y el segundo jugador
 * intenta adivinarlo. El segundo jugador tiene un número limitado 
 * de intentos y recibe una pista de "más alto" o "más bajo" después
 * de cada intento. El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos
 * necesarios para adivinar el número y el número de veces que cada
 * jugador ha ganado.
 *
 * @author denis
 */
public class Juego {
    private int numAleatorio;
    private int intentos;
    private int jugador2;
    
    public void iniciar_juego(){
        intentos = 3;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un num aleatorio del 1 al 10");
        
        numAleatorio= leer.nextInt();  
        
        
        for (int i = 0; i < intentos; i++) {
            System.out.println("Jugador 2 ingrese un numero a adivinar");
            jugador2 = leer.nextInt();
            if(jugador2<numAleatorio){
                System.out.println("Mas Alto");
            }else if(jugador2>numAleatorio){
                System.out.println("Mas Bajo");
            }else{
                System.out.println(jugador2 + " es igual a " + numAleatorio + " Has Ganado");
                System.out.println("Los intentos fueron "+i);
                break;
            }
            
        }
        if(numAleatorio != jugador2){
            System.out.println("Se acabaron los intentos , mascapitos");
        }
        
        
    }
    
    
    
    
}
