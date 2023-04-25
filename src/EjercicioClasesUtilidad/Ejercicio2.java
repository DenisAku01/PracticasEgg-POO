/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioClasesUtilidad;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosService;

/**Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales 
 * con los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un
 * constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random
 * para generar los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios,
 * que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado 
* al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes
* de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 *
 * @author denis
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosService h = new ParDeNumerosService();
        ParDeNumeros nums = h.llenarNums();
        h.MostrarValores(nums);
        double mayor = h.devolverMayor(nums);
        double menor = h.devolverMenor(nums);
        System.out.println("EL MAYOR ES :"+ mayor);
        System.out.println("EL MENOR ES :"+ menor);
        double resultado = h.CalcularPotencia(nums);
        double resultado1 = h.calcularRauz(nums);
        System.out.println("La raiz del menor numero es "+ resultado1);
    }
    
}
