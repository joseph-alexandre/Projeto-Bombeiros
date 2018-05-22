
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Sistema {
    CadastroBombeiro registroBombeiro = new CadastroBombeiro();
    public void apresentarMenu(){
       
        JOptionPane.showMessageDialog(null, "Bem-vindo ao painel administrativo do Corpo de Bombeiros Militar de Santa Catarina.");
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" + "1    -  Registros\n" + "2    -  Logística\n" + "3    -  Sobre\n" + "4    -  Sair"));  
   while (escolha != 4){
       switch(escolha){
           case 1: registroBombeiro.quantidadeCadastroBombeiro();
           break;
       }
       
            
        }
      
      
    }
    
    
    
}
