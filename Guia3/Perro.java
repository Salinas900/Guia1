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
public class Perro extends Mascota {
    private String raza;
    
    public Perro(String nombre, String tipo_alimentacion, int edad, String raza){
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public void mostrar(){
        System.out.println(getNombre() + "-" + getTipo_alimentacion() + "-" + getEdad() + "-" + getRaza() );
    }
    
}
