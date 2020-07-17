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
public class Ingeniero {
    
    //PROPIEDADES
    private String identidad;
    private String nombre;
    private String especialidad;
    
    //CONSTRUCTOR POR DEFECTO
    public Ingeniero(){
        
    }
    
    //CONSTRUCTOR CON PARÁMETROS
    public Ingeniero(String identidad, String nombre, String especialidad){
        this.setIdentidad(identidad);
        this.setNombre(nombre);
        this.setEspecialidad(especialidad);
    }
    
    //MÉTODOS PARA OBTENER INFORMACIÓN
    public String getIdentidad(){
        return identidad;
    }
    
    public String getNombre(){
     return nombre;   
    }
    
    public String getEspecialidad(){
     return especialidad;   
    }
    
    //MÉTODOS PARA ESTABLECER LA INFORMACIÓN
    public void setIdentidad(String _identidad){
     this.identidad = _identidad;   
    }
    
    public void setNombre(String _nombre){
     this.nombre = _nombre;   
    }
    
    public void setEspecialidad(String _especialidad){
     this.especialidad = _especialidad;   
    }
    

   
}
