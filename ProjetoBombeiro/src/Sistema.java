
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
<<<<<<< HEAD
    MenuRegistro menus = new MenuRegistro();
    public void apresentarMenu(){
=======
    CadastroBombeiro registroBombeiro = new CadastroBombeiro();
    RegistroEdificio cadastroEdificio = new RegistroEdificio();
        public void apresentarMenu(){
>>>>>>> 5fb6bec04df090bb895e5acfc7d284598d0c8a26
       
        JOptionPane.showMessageDialog(null, "Bem-vindo ao painel administrativo do Corpo de Bombeiros Militar de Santa Catarina.");
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" + "1    -  Registros\n" + "2    -  Logística\n" + "3    -  Sobre\n" + "4    -  Sair"));  
   while (escolha != 4){
       switch(escolha){
           case 1: menus.menuRegistro();
           break;
           case 2: cadastroEdificio.quantidadeEdificios();
           break;
       }
       
            
        }
      
      
    }
    
    
    
}
