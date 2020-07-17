/**
 * Este código es para la tarea individual #5
 * @author Kevin Archaga
 * @version 0.1
 */
package helpersmod5;

/**
 * Clase hija de la clase Formas en la que describimos parámetros del Triangulo
 * @author Kevin Archaga
 * @version 0.1
 */
public class Triangulo extends Formas {
    
    
    private double angulo = 90; //Definimos un atributo propio de un triangulo
    
    /**
     * Declaración del constructor de la clase
     */
    public Triangulo() {
        establecerColor("Rojo"); //Método heredado de la superclase Formas
    }
    
     /**
      * Método Set, el cual recibe el atributo angulo de tipo double
      * @param angulo
      */
    public void establecerAngulo(double angulo){
        this.angulo = angulo;
    }
    
    /**
      * Método Get, con el cual obtendremos el valor de angulo de tipo double
      * @return radio tipo double
      */
    public double obtenerAngulo(){
        return this.angulo;
    }

    /**
    * Método heredado por la superclase Formas
    * Implementación de polimorfismo en el comportamiento del método
    * @return Cadena de texto con el nombre de la forma
    */ 
    @Override
    public String Dibujar() {
        return "Forma: Triángulo";
    }
    
    /**
     * Método que realiza el cálculo del área de un triángulo
     * @param base
     * @param altura
     * @return area
     */
    public double calcularArea(double base, double altura){
        double area;
        area = (base * altura)/2;
      return area;  
    }
}
