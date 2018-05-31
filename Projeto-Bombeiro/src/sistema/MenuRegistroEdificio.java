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

        int menu = JOptionPane.showOptionDialog(null, "Selecione uma opção: ", "MENU EDIFICIOS",
                0, JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Sistema.class.getResource("burning-building.png")),
                new Object[]{
                    "Cadastro",
                    "Listar",
                    "Editar Cadastro",
                    "Buscar pelo nome fantasia",
                    "RETORNAR"},null);
                
        while (menu != 4) {
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
                case 3:
                    menuEdificio.buscarPeloEdificio();
                    break;
               

            }
            menu = JOptionPane.showOptionDialog(null, "Selecione uma opção: ", "MENU EDIFICIOS",
                0, JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Sistema.class.getResource("burning-building.png")),
                new Object[]{
                    "Cadastro",
                    "Listar",
                    "Editar Cadastro",
                    "Buscar pelo nome fantasia",
                    "RETORNAR"},null);

        }
    }

}
