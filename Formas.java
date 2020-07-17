/**
 * Este código es para la tarea individual #5
 * @author Kevin Archaga
 * @version 0.1
 */
package helpersmod5;

/**
 * Esta clase es abstracta y será la SuperClase para las demás clases dentro
 * del proyecto
 * @author Kevin Archaga
 * @version 0.1 
 */
public abstract class Formas {
    
    
    private String color;//Definimos el Atributo que tendrán las otras clases 

    /**
     * Declaramos el Constructor de la clase en este caso vacío
     */
    public Formas(){
        
    }
    
    /**
     * Método Set, el cual recibe el atributo color de tipo texto
     * @param color 
     */
    public void establecerColor(String color){
        this.color = color;
    }
    /**
     * Método Get con el cual obtendremos el valor de color de tipo texto
     * @return color
     */
    public String obtenerColor(){
        return this.color;
    }
    
    /**
     * Método abstracto con el que aplicaremos polimorfismo en las otras clases
     * @return Cadenas de texto
     */
      public abstract String Dibujar ();
    }
    
   
