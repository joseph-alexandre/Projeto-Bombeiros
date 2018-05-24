package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class MenuRegistroEdificio {

    RegistroEdificio menuEdificio = new RegistroEdificio();

    public void menuRegistroEdificio() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog("Menu das Solicitações para Auto Vistoria\n"
                + "1    -  Cadastrar\n"
                + "2    -  Listar Solicitações\n"
                + "3    -  Editar Solicitações\n"
                + "4    -  Listar."));
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
                
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu das Solicitações para Auto Vistoria\n"
                + "1    -  Cadastrar\n"
                + "2    -  Listar Solicitações\n"
                + "3    -  Editar Solicitações\n"
                + "4    -  Retornar"));
            
        }
    }

}
