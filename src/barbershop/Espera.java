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
public class Espera { //Classe que controle de vagas dos clientes
    
    int qtdEspera = 8; //Quantidade de Cadeiras / vagas
    
    private int[] vagas = new int[qtdEspera];
    
    public Espera (){        
        for (int i = 0; i < qtdEspera; i++){            
            vagas[i]=0;            
        }        
    }
    
    public int getVagasLivres(){//controle de vagas para barbeiros
        int vaga = 0;
        for (int i = 0; i < qtdEspera; i++){
            if(vagas[i]>0){
                vaga=vagas[i];
                vagas[i]=0;
                break;
            }
        }
        return vaga;
    }
    
    public int setAddEspera(int arg) { // add cliente na vaga liberada
        int vaga=arg;
        for (int i = 0; i < qtdEspera; i++) {
            if(vagas[i]==0){
                vagas[i]=vaga;
                break;
            }
        }
        return vaga;
    }
    
    public boolean getEsperaLotado() {// controle de lotação para cliente
        boolean lotado=true;
        for (int i = 0; i < qtdEspera; i++) {
            if(vagas[i]==0){
                lotado=false;
                break;
            }
        }
        return lotado;
    }
    public int getQtdEspera() { //controle de vagas utilizadas
        int qtd=0;
        for (int i = 0; i < qtdEspera; i++) {
            if(vagas[i]>0){
                qtd++;
            }
        }
        return qtd;
    }
        
    
}
