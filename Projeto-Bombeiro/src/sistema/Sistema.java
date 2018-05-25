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
    About sobre = new About();
    

    


    public void apresentarMenu() {

        JOptionPane.showMessageDialog(null, "Bem-vindo ao painel administrativo do Corpo de Bombeiros Militar de Santa Catarina.");

        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" + "1    -  Registros\n" + "2    -  Solicitação do AVCB\n" + "3    -  Sobre\n" + "4    -  Sair"));  
   while (escolha != 4){
       switch(escolha){
           case 1: menus.menuRegistro();
           break;
           case 2: menusAvcb.RegistroAvcb();
           break;
           case 3: sobre.Sobre();
           break;
           default: JOptionPane.showMessageDialog(null, 
                   "Escolha outra opção!", 
                   "Opção inválida", 
                   JOptionPane.ERROR_MESSAGE);
       }
       
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" + "1    -  Registros\n" + "2    -  Solicitação do AVCB\n" + "3    -  Sobre\n" + "4    -  Sair"));  
        
      
      

      


   }}}

