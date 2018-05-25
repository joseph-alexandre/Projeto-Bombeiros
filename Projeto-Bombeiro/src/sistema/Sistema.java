package sistema;

import javax.swing.JOptionPane;

public class Sistema {
 /**
 *
 * @author Joseph
 */

    MenuRegistro menus = new MenuRegistro();
    RegistroBombeiro registroBombeiro = new RegistroBombeiro();
    RegistroEdificio cadastroEdificio = new RegistroEdificio();
    MenuAVCB menusAvcb = new MenuAVCB();
    MenuOcorrencia menuOcorrencia = new MenuOcorrencia();
    

    


    public void apresentarMenu() {

        JOptionPane.showMessageDialog(null, "Bem-vindo ao painel administrativo do Corpo de Bombeiros Militar de Santa Catarina.");

        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" + "1    -  Registros\n" + "2    -  Solicitação do AVCB\n" + "3    -  Sobre\n" + "4    -  Sair"));  
   while (escolha != 4){
       switch(escolha){
           case 1: menus.menuRegistro();
           break;
           case 2: menusAvcb.RegistroAvcb();
           break;
           default: JOptionPane.showMessageDialog(null, "Opção inválida.");
       }
       
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" + "1    -  Registros\n" + "2    -  Solicitação do AVCB\n" + "3    -  Sobre\n" + "4    -  Sair"));  
        
      
      

      


   }}}

