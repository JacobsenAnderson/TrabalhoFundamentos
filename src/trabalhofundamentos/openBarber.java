/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofundamentos;

/**
 *
 * @author 0150363
 */
public class openBarber extends Thread{

    
    public openBarber() {
        //String nome = null;
        System.out.println(" Barbearia está Aberta");
        
    }
    
//    def openShop(self):
//		print 'A barbearia esta aberta'
//		workingThread = Thread(target = self.barberGoToWork)
//		workingThread.start()

    public static void main(String[] args) {
        
//         Estoque listaProdutos = new Estoque();
            openBarber Status = new openBarber();
            Status.start();
            System.out.println(" Oiii");
    }
}
