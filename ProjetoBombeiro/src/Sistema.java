
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
       
        Object []botões = {"Registros", "Vistoria de Manutenção", "Logística", "Sobre", "Sair"};
        
   JOptionPane.showOptionDialog(null, "Selecione o procedimento desejado.", "Corpo de Bombeiros Militar de Santa Catarina", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, botões, botões[0]);
   int resultado = Integer.parseInt(botões.toString());     
   while (resultado != 4){
       switch(resultado){
           case 0: registroBombeiro.cadastroDoBombeiro();
           break;
       }
       
            
        }
      
      
    }
    
    
    
}
