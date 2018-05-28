package sistema;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class MenuAVCB {

    RegistroAvcb menuAvcb = new RegistroAvcb();

    public void RegistroAvcb() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Auto de Vistoria do Corpo de Bombeiros de Santa Catarina\n"
                + "1    -  Cadastrar AVCB\n"
                + "2    -  Listar AVCB\n"
                + "3    -  Editar AVCB\n"
                + "4    -  Retornar",
                "MENU AVCB", 0,
                new ImageIcon(Sistema.class.getResource("fire-station.png")),
                null, null).toString());

        while (menu != 4) {
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
                default:
                    JOptionPane.showMessageDialog(null,
                            "Escolha outra opção!",
                            "Opção inválida",
                            JOptionPane.ERROR_MESSAGE);
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("Auto de Vistoria do corpo de Bombeiros de Santa Catarina\n"
                    + "1    -  Cadastrar AVCB\n"
                    + "2    -  Listar AVCB\n"
                    + "3    -  Editar AVCB\n"
                    + "4    -  Sair"));
        }
    }

}
