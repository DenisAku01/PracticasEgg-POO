/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un 
 * libro pidiendo los datos al usuario y luego informar mediante otro método el 
 * número de ISBN, el título, el autor del libro y el número de páginas.
 *
 * @author denis
 */
public class Libro {
    public int isbn;
    public String Titulo;
    public String Autor;
    public int NumDePag;

    public Libro() {
    }
    
    public Libro(int isbn, String Titulo, String Autor, int numDePag) {
        this.isbn = isbn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumDePag = numDePag;
    }
    
    public void PedirLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBN");
        int ISBN = leer.nextInt();
        System.out.println("Ingrese Titulo");
        String titulo = leer.next();
        System.out.println("Nombre del Autor");
        String autor = leer.next();
        System.out.println("Ingrese la Cantidad de Paginas del libro");
        int numDePag = leer.nextInt();
        this.isbn = ISBN;
        this.Titulo = titulo;
        this.Autor = autor;
        this.NumDePag = numDePag;
    }
    public void Mostrarlibro(){
        System.out.println("El Libro "+Titulo+" Del Autor "+Autor+" de "+ NumDePag+" pagina/s y el ISBN es "+ isbn );
    
    }
    
    
}
