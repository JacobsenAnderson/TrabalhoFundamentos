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
public class Barbeiro extends Thread {
    
    private Espera vagas;
    
    public Barbeiro(Espera vaga, String nome) {
        super(nome);
        this.vagas = vaga;
    }
    
    public void atender() {
         synchronized (vagas){
             if (vagas.getQtdEspera() > 0){
                int valor = (int)vagas.getVagasLivres();
                System.out.println("|Barbeiro| - " + this.getName() + " - está atendendo cliente: " + valor);                
            }
            else {
                try {
                    System.out.println("|Barbeiro| - " + this.getName() + " - durmindo");
                    vagas.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void run(){
        while(true){
            this.atender();
            try{
                Thread.sleep((int) (Math.random() * 1000));
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
    
}
