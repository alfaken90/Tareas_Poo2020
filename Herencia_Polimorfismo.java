/**
 *Este código es para la tarea individual #5
 *@author Kevin Archaga
 *@version 0.1
 */
package herencia_polimorfismo;

import helpersmod5.Circulo;
import helpersmod5.Cuadrado;
import helpersmod5.Linea;
import helpersmod5.Triangulo;

/**
 * Clase que contiene el main para poder visualizar nuestro código
 * @author: Kevin Archaga
 * @version 0.1
 */
public class Herencia_Polimorfismo {

    /** Método principal o Main de la clase
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Instanciar cada una de las clases en objetos para ser utilizados
         */
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        /**
         * Impresión en pantalla de todas las clases creadas 
         */
        System.out.println("Tarea individual 5: Herencia y Polimorfismo");
        System.out.println("-------------------------------------------");
        System.out.println(circulo.Dibujar());
        System.out.println("Color: "+ circulo.obtenerColor());
        System.out.println("Radio: "+ circulo.calcularRadio(7)+" cm");
        System.out.println("-------------------------------------------");
        System.out.println(linea.Dibujar());
        System.out.println("Largo: " + linea.obtenerLargo()+" cm");
        System.out.println("-------------------------------------------");
        System.out.println(triangulo.Dibujar());
        System.out.println("Color: " + triangulo.obtenerColor());
        System.out.println("Ángulo: " + triangulo.obtenerAngulo());
        System.out.println("Área: " + triangulo.calcularArea(4, 12)+" cm²");
        System.out.println("-------------------------------------------");
        System.out.println(cuadrado.Dibujar());
        System.out.println("Color: " + cuadrado.obtenerColor());
        System.out.println("Area:" + cuadrado.calcularArea(5) +" cm²");
        
    }
    
}
