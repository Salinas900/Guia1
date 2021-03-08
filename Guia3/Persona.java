/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

/**
 *
 * @author luife
 */
public class Persona {
    private String nombre;
    private int edad;
    
    private Direccion direccion;
    
    public Persona (String nombre, int edad){
        super();
        this.nombre = nombre;
        this.edad = edad;
    }
    public Direccion getDireccion(){
        return direccion;
    }
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
       return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
}
