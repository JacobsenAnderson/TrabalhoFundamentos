/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbershop;

/**
 *
 * @author ajacobsen
 */
public class BarberShop {

    public static void main(String[] args) {
        Espera listaEspera = new Espera();
        Cliente c1 = new Cliente(listaEspera, "Cliente ");
        Barbeiro b1 = new Barbeiro(listaEspera, "Anderson");
        Barbeiro b2 = new Barbeiro(listaEspera, "Renan");
              
        
        b1.start(); //Inicio Thread
        b2.start();        
        c1.start();
           
        
        }
    
}
