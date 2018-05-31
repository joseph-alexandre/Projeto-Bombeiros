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

        int menu = JOptionPane.showOptionDialog(null, "Auto de Vistoria do Corpo de Bombeiros de Santa Catarina\n"
                + "Selecione uma opção: ", "MENU AVCB", 0,
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Sistema.class.getResource("fire-station.png")),
                new Object[]{
                    "Cadastro",
                    "Listar",
                    "Editar",
                    "RETORNAR"
                }, null);

        while (menu != 3) {
            switch (menu) {
                case 0:
                    menuAvcb.cadastrar();
                    break;
                case 1:
                    menuAvcb.listar();
                    break;
                case 2:
                    menuAvcb.editar();
                    break;
                
            }
            menu = JOptionPane.showOptionDialog(null, "Auto de Vistoria do Corpo de Bombeiros de Santa Catarina\n"
                + "Selecione uma opção: ", "MENU AVCB", 0,
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Sistema.class.getResource("fire-station.png")),
                new Object[]{
                    "Cadastro",
                    "Listar",
                    "Editar",
                    "RETORNAR"
                }, null);

        }
    }

}
