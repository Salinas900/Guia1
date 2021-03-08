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
public class Empresa {

private String cif;
private Direccion direccion;
    
public Direccion getDireccion() {
        return direccion;
}
public void setDireccion(Direccion direccion){
    this.direccion = direccion;
}
public String getCif(){
    return cif;
}
public void setCif(String cif){
    this.cif = cif;
}


}
