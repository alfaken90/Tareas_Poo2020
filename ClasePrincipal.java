/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uth.tareaindividualmod3;

/**
 *
 * @author user
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicio del programa \n");
        
        //INSTANCIAR LA CLASE INGENIERO
        Ingeniero ingeniero = new Ingeniero();
        
        //ESTABLECER INFORMACION A LAS PROPIEDADES PARA EL OBJETO INGENIERO
        ingeniero.setIdentidad("0801199017387");
        ingeniero.setNombre("Kevin Archaga");
        ingeniero.setEspecialidad("Ingenieria en Sistemas");
        
        //OBTENER LOS VALORES
        ingeniero.getIdentidad();
        ingeniero.getNombre();
        ingeniero.getEspecialidad();
        
        //IMPRESION DE LA INFORMACIÓN
        System.out.println("Nº de identidad del ingeniero: " + ingeniero.getIdentidad());
        System.out.println("Nombre del ingeniero: " + ingeniero.getNombre());
        System.out.println("Especialidad del ingeniero: " + ingeniero.getEspecialidad());
    }
    
}
