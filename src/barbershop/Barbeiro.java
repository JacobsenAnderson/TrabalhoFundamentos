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
public class Barbeiro extends Thread { //Classe execução Barbeiro
    
    private Espera vagas; 
    private String nome;
    
    public Barbeiro(Espera vaga, String nome) {
        super(nome);
        this.vagas = vaga;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
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
        //System.out.println( this.nome + " abriu a barbearia");
        while(true){
            this.atender();
            try{
                Thread.sleep((int) (Math.random() * 5000)); // tempo que o barbeira vai atender o cliente, quanto mais mais chance de não ter vaga
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
    
}
