
package Entidad;

/**Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
     * base y un atributo privado altura. La clase incluirá un método para crear el 
     * rectángulo con los datos del Rectángulo dados por el usuario. También incluirá 
     * un método para calcular la superficie del rectángulo y un método para calcular 
     * el perímetro del rectángulo. Por último, tendremos un método que dibujará el 
     * rectángulo mediante asteriscos usando la base y la altura. Se deberán además
     * definir los métodos getters, setters y constructores correspondientes.
        Superficie = base * altura / Perímetro = (base + altura) * 2.
 *
 * @author denis
 */
public class Rectangulo {
    private double base;
    private double altura;
    private boolean rectanguloHecho;
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.rectanguloHecho = false;
    }
    
    public  void crearRectangulo(double base,double altura){
        this.base= base;
        this.altura= altura;
        this.rectanguloHecho = true;
        
    }
    public  double superficie(double base , double altura){
        if(rectanguloHecho){
        double superficie = base * altura ;
        return superficie;
        }else{
            System.out.println("ERROR, EL RECTANGULO NUNCA FUE FORMADO");
        return 0;
        }
    }
    public double perimetro(double base, double altura){
        if(rectanguloHecho){
        double perimetro = (base +altura) *2;
        return perimetro ;
        }else{
            System.out.println("ERROR, NO SE PUEDE HACER EL PERIMETRO SIN EL RECTANGULO HECHO");
            return 0;
        }
    }
    //tendremos un método que dibujará el 
     // rectángulo mediante asteriscos usando la base y la altura.
    public  void dibujar(double base,double altura){
        int base1 = (int) base;
    int altura1 = (int) altura;
     for (int i = 0; i < altura1; i++) {
            for (int j = 0; j < base1; j++) {
             System.out.print("*");
            }
            System.out.println();
     }
    }

    public boolean isRectanguloHecho() {
        return rectanguloHecho;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
}
