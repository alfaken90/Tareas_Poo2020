/**
 * Este código es para la tarea individual #5
 * @author Kevin Archaga
 * @version 0.1
 */
package helpersmod5;

/**
 * Clase hija de la clase Formas en la que describimos parámetros de una línea
 * @author Kevin Archaga
 * @version 0.1
 */
public class Linea extends Formas {
    
    private double largo = 5.6 ; //Definimos un atributo propio de una línea
    
   /**
     * Declaración del constructor de la clase
     */
    public Linea(){
        establecerColor("Azul"); //Método heredado de la superclase Formas
        
    }
    
    /**
      * Método Set, el cual recibe el atributo largo de tipo double
      * @param largo
      */
    public void establecerLargo(double largo){
        this.largo = largo;
    }
    
     /**
      * Método Get, con el cual obtendremos el valor de largo de tipo double
      * @return largo tipo double
      */
    public double obtenerLargo(){
        return this.largo;
    }

    /**
    * Método heredado por la superclase Formas
    * Implementación de polimorfismo en el comportamiento del método
    * @return Cadena de texto con el nombre de la forma
    */ 
    @Override
    public String Dibujar() {
        return "Forma: Línea";
    }
    
    
}
