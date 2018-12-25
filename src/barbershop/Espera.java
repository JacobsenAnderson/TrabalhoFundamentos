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
public class Espera {
    
    int qtdEspera = 8;
    
    private int[] vagas = new int[qtdEspera];
    
    public Espera (){        
        for (int i = 0; i < qtdEspera; i++){            
            vagas[i]=0;            
        }        
    }
    
    public int getVagasLivres(){
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
    
    public int setAddEspera(int arg) {
        int vaga=arg;
        for (int i = 0; i < qtdEspera; i++) {
            if(vagas[i]==0){
                vagas[i]=vaga;
                break;
            }
        }
        return vaga;
    }
    
    public boolean getEsperaLotado() {
        boolean lotado=true;
        for (int i = 0; i < qtdEspera; i++) {
            if(vagas[i]==0){
                lotado=false;
                break;
            }
        }
        return lotado;
    }
    public int getQtdEspera() {
        int qtd=0;
        for (int i = 0; i < qtdEspera; i++) {
            if(vagas[i]>0){
                qtd++;
            }
        }
        return qtd;
    }
        
    
}
