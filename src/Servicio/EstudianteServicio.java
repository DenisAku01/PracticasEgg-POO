/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Estudiante;

/**Una escuela ha terminado su ciclo lectivo y todos sus alumnos 
 * ya rindieron el examen final. La escuela nos ha pedido que calculemos
 * el promedio de notas final de todos sus alumnos y saber qué alumnos han
 * recibido una nota por encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
* van a ser nombre y nota (representando la nota obtenida en el final). 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los
* 8 estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo
* de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las dos
* tareas que nos ha pedido la escuela.
Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombre de los alumnos que recibieron una nota 
* mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

 *
 * @author denis
 */
public class EstudianteServicio {
    
    
    public Estudiante[] Crear8Estudiantes(){
        Estudiante  e1 = new Estudiante("juan",7);
        Estudiante  e2 = new Estudiante("Demian",8);
        Estudiante  e3 = new Estudiante("Miguel",6);
        Estudiante  e4 = new Estudiante("Pancracio",3);
        Estudiante  e5 = new Estudiante("Anonimo",10);
        Estudiante  e6 = new Estudiante("Carlos",9);
        Estudiante  e7 = new Estudiante("Rasputia",5);
        Estudiante  e8 = new Estudiante("Peyotes",2);
        
        
        
        
    }
    
}
