/**
 * Este código es para la tarea individual #5
 * @author Kevin Archaga
 * @version 0.1
 */
package helpersmod5;

/**
 * Clase hija de la clase Formas en la que describimos parámetros de un cuadrado
 * @author Kevin Archaga
 * @version 0.1
 */
public class Cuadrado extends Formas {
    
    private double area; //Definimos un atributo propio de un cuadrado
    
   /**
     * Declaración del constructor de la clase
     */
    public Cuadrado(){
        establecerColor("Morado"); //Método heredado de la superclase Formas
    }
    
     /**
      * Método Set, el cual recibe el atributo area de tipo double
      * @param area
      */
    
    public void establecerArea(double area){
        this.area = area;
    }
    
    /**
      * Método Get, con el cual obtendremos el valor de area de tipo double
      * @return radio tipo double
      */
    public double obtenerArea(){
        return this.area;
    }

    /**
    * Método heredado por la superclase Formas
    * Implementación de polimorfismo en el comportamiento del método
    * @return Cadena de texto con el nombre de la forma
    */ 
    @Override
    public String Dibujar() { 
        return "Forma: Cuadrado";
    }
    
    /**
     * Método que realiza el cálculo del área de un cuadrado
     * @param lado
     * @return area
     */
    public double calcularArea(double lado){
        this.area = lado * lado;
        return this.area;
    }
    
}
