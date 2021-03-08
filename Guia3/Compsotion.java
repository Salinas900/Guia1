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
public class Compsotion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion d1 = new Direccion("calle A", 3);
        Direccion d2 = new Direccion("calle B", 7);
        Persona p = new Persona("Pepe", 20);
        p.setDireccion(d1);
        Empresa e = new Empresa();
        e.setCif("1A");
        e.setDireccion(d2);
        
        System.out.println(p.getDireccion().getCalle());
        System.out.println(e.getDireccion().getCalle());
        
        // TODO code application logic here
    }
    
}
