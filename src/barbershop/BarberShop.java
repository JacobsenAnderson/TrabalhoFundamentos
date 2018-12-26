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
int qtdMax = 8;
    public static void main(String[] args) {
        Espera listaEspera = new Espera();
        Cliente c1 = new Cliente(listaEspera, "Cliente novo ");
        Barbeiro b1 = new Barbeiro(listaEspera, "Anderson");
        Barbeiro b2 = new Barbeiro(listaEspera, "Renan");
              
 
        b1.start();
        b2.start();        
        c1.start();
           
        
        }
    
}
