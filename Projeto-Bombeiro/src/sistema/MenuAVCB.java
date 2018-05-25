    
package sistema;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class MenuAVCB {
    
    RegistroAvcb menuAvcb = new RegistroAvcb();
    
    public void RegistroAvcb(){
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog("Auto de Vistoria do corpo de Bombeiros de Santa Catarina\n" 
                + "1    -  Cadastrar AVCB\n" 
                + "2    -  Listar AVCB\n"
                + "3    -  Editar AVCB\n"
                + "4    -  Sair"));
        
        while(menu != 4){
            switch (menu) {
                case 1:
                    menuAvcb.cadastrar();
                    break;
                case 2:
                    menuAvcb.listar();
                    break;
                case 3:
                    menuAvcb.editar();
                    break;
                    default: JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("Auto de Vistoria do corpo de Bombeiros de Santa Catarina\n" 
                + "1    -  Cadastrar AVCB\n" 
                + "2    -  Listar AVCB\n"
                + "3    -  Editar AVCB\n"
                + "4    -  Sair"));
        }
    }
    
}
