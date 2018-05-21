
import javax.swing.JOptionPane;


public class CadastroBombeiro {
    
   public void cadastroDoBombeiro(){
       Object[] botões2 = {"Bombeiro", "Ocorrência", "Sair"};
        
   JOptionPane.showOptionDialog(null, "Selecione o procedimento desejado.", "Corpo de Bombeiros Militar de Santa Catarina", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, botões2, botões2[0]);
   
    
}
    
}
