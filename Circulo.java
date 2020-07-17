/**
 * Este código es para la tarea individual #5
 * @author Kevin Archaga
 * @version 0.1
 */
package helpersmod5;

/**
 * Clase hija de la clase Formas en la que describimos parámetros de un círculo
 * @author Kevin Archaga
 * @version 0.1
 */
public class Circulo extends Formas {
    
    private double radio; //Definimos un atributo propio de un circulo 
    
    /**
     * Declaración del constructor de la clase
     */
     public Circulo (){
        establecerColor("Amarillo"); //Método heredado de la superclase Formas
    
    }
     
     /**
      * Método Set, el cual recibe el atributo radio de tipo double
      * @param radio
      */
     public void establecerRadio(double radio){
         this.radio = radio;
     }
     /**
      * Método Get, con el cual obtendremos el valor de radio de tipo double
      * @return radio tipo double
      */
     public double obtenerRadio(){
         return this.radio;
     }

   /**
    * Método heredado por la superclase Formas
    * Implementación de polimorfismo en el comportamiento del método
    * @return Cadena de texto con el nombre de la forma
    */ 
   @Override
    public String Dibujar() {
    return "Forma: Círculo";    
    }
    
    /**
     * Método que realiza el cálculo del radio de un círculo
     * @param diametro
     * @return radio tipo double
     */
    public double calcularRadio(double diametro){
        this.radio = diametro/2;
    return this.radio;
    
    }
}
