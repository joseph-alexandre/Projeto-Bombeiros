package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class MenuRegistroEdificio {

    RegistroEdificio menuEdificio = new RegistroEdificio();

    public void menuRegistroEdificio() {

        int escolha = JOptionPane.showOptionDialog(null, "MENU DAS SOLICITAÇÕES PARA AUTO DE VISTORIA DO CORPO DE BOMBEIROS", "", 0, 0, null,
                new Object[]{
                    "Cadastrar", "Listar Solicitações", "Editar Solicitações", "Sair"
                }, "Listar Solicitações");
        return;
    }

    public void gerirMenu() {
        int menu = JOptionPane.showOptionDialog(null, "MENU DAS SOLICITAÇÕES PARA AUTO DE VISTORIA DO CORPO DE BOMBEIROS", "",0, JOptionPane.INFORMATION_MESSAGE, null,
                new Object[]{
                    "Cadastrar", "Listar Solicitações", "Editar Solicitações", "Sair"
                }, "Listar Solicitações");;

            switch (menu) {
                case 0:
                    menuEdificio.cadastrar();
                    break;
                case 1:
                    menuEdificio.listarEdificios();
                    break;
                case 2:
                    menuEdificio.editarEdificio();
                    break;
              
                //return menuRegistroBombeiro.class;

        }
    }

}

