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
public class Mascota {
    private String nombre, tipo_alimentacion;
    private int edad;
    
    public Mascota(String nombre, String tipo_alimentacion, int edad){
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public String getTipo_alimentacion(){
        return tipo_alimentacion;
    }
    public void setTipo_alimentacion(String tipo_alimentacion){
        this.tipo_alimentacion = tipo_alimentacion;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }    
}
