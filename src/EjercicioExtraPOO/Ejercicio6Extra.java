
package EjercicioExtraPOO;

import Entidad.RectanguloExtra;

/**Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
 * y un método "calcular_area" que calcule y devuelva el área del rectángulo.
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 
 * 4 y 6 y imprime el área del rectángulo.
 *
 * @author denis
 */
public class Ejercicio6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloExtra rectangulo1 = new RectanguloExtra();
        rectangulo1.calcular_area();
    }
    
}
