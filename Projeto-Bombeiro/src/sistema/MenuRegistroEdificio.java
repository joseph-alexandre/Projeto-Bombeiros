package sistema;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class MenuRegistroEdificio {

    RegistroEdificio menuEdificio = new RegistroEdificio();

    public void menuRegistroEdificio() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu do registro de Edifício\n"
                + "1    -  Cadastrar o Edifício\n"
                + "2    -  Listar cadastros\n"
                + "3    -  Editar cadastros\n"
                + "4    -  Buscar pelo Edifício"
                + "\n5    -  Retornar",
                "MENU EDIFICIOS",
                0,
                new ImageIcon(Sistema.class.getResource("burning-building.png")),
                null, null).toString());
        while (menu != 5) {
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
                case 4:
                    menuEdificio.buscarPeloEdificio();

                default:
                    JOptionPane.showMessageDialog(null,
                            "Escolha outra opção!",
                            "Opção inválida",
                            JOptionPane.ERROR_MESSAGE);

            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu do registro de Edifício\n"
                    + "1    -  Cadastrar o Edifício\n"
                    + "2    -  Listar cadastros\n"
                    + "3    -  Editar cadastros\n"
                    + "4    -  Buscar pelo Edifício"
                    + "\n5    -  Retornar",
                    "MENU EDIFICIOS",
                    0,
                    new ImageIcon(Sistema.class.getResource("burning-building.png")),
                    null, null).toString());

        }
    }

}
