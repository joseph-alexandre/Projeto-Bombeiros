package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class MenuRegistroEdificio {

    RegistroEdificio menuEdificio = new RegistroEdificio();

    public void menuRegistroEdificio() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog("Menu do registro de Edifício\n"
                + "1    -  Cadastrar o Edifício\n"
                + "2    -  Listar cadastros\n"
                + "3    -  Editar cadastros\n"
                + "4    -  Retornar"));
        while (menu != 4) {
            switch (menu) {
                case 1:
                    menuEdificio.cadastrar();
                    break;
                case 2:
                    menuEdificio.listarEdificios();
                    break;
                case 3:
                    menuEdificio.editarEdificio();
                    break;
                    default: JOptionPane.showMessageDialog(null, "Opção inválida.");
                
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu do registro de Edifício\n"
                + "1    -  Cadastrar o Edifício\n"
                + "2    -  Listar cadastros\n"
                + "3    -  Editar cadastros\n"
                + "4    -  Retornar"));
            
        }
    }

}
