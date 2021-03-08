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
public class Extends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perro = new Perro ("Teddy","Croquetas" , 10, "Chihuahua");
        Gato gato = new Gato("Pelusa" , "Especial" , 8, "Siames");
        
        System.out.println("--------------------");
        perro.mostrar();
        System.out.println("--------------------");
        gato.mostrar();
        System.out.println("--------------------");
    }
    
}
