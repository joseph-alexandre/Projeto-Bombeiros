
package sistema;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class MenuRegistroBombeiro {
    RegistroBombeiro menuBombeiro = new RegistroBombeiro();
    
    
    public void menuRegistroBombeiro(){
         int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
                 "Registro de Bombeiro\n" 
                 + "1    -  Registrar Bombeiro\n" 
                 + "2    -  Editar\n" 
                 + "3    -  Listar\n" 
                 + "4    -  Contabilizar pelo nome\n" 
                 + "5    -  Buscar pelo nome\n" 
                 + "6    -  Buscar pelo batalhão\n" 
                 + "7    -  Buscar por cargo\n" 
                 + "8    -  Retornar",
                 "MENU BOMBEIROS", 0,
                 new ImageIcon(Sistema.class.getResource("fireman.png")),
                 null, null).toString());
       while(escolha != 8){
           switch(escolha){
               case 1: menuBombeiro.cadastrar();
           break;
               case 2: menuBombeiro.editar();
           break;
               case 3: menuBombeiro.listar();
           break;
               case 4: menuBombeiro.contabilizarPeloNome();
           break;
               case 5: menuBombeiro.buscarPeloNome();
           break;
               case 6: menuBombeiro.buscarPorBatalhao();
           break;
               case 7: menuBombeiro.buscarPorCargo();
           break;
               default: JOptionPane.showMessageDialog(null, 
                       "Escolha outra opção!", 
                       "Opção inválida", 
                       JOptionPane.ERROR_MESSAGE);
               
               
    }
           

           


  escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
                 "Registro de Bombeiro\n" 
                 + "1    -  Registrar Bombeiro\n" 
                 + "2    -  Editar\n" 
                 + "3    -  Listar\n" 
                 + "4    -  Contabilizar pelo nome\n" 
                 + "5    -  Buscar pelo nome\n" 
                 + "6    -  Buscar pelo batalhão\n" 
                 + "7    -  Buscar por cargo\n" 
                 + "8    -  Retornar",
                 "MENU BOMBEIROS", 0,
                 new ImageIcon(Sistema.class.getResource("fireman.png")),
                 null, null).toString());
                
       }
       
    }
}
