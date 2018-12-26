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
public class Cliente extends Thread {
    private Espera cliente;
    private int num;
    public Cliente() { }
    public Cliente (Espera vaga, String nome){
        super(nome);
        this.cliente = vaga;
    }
    
    public void entrar() {
        synchronized (cliente){
            if(cliente.getEsperaLotado()){
                System.out.println("|Cliente| - " + this.getName() + "\t - Não há  vagas");
            }else{
                int valor = (int)(Math.random() * 1000);
                this.cliente.setAddEspera(valor);
                System.out.println("|Cliente| - " + this.getName() +valor + " na fila de espera");
                cliente.notifyAll();
            }
        }
        
    }
    
    public void run() {
        while (true) {
            this.entrar();
            try{
                Thread.sleep((int) (Math.random() * 500));
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
