package sistema;

import javax.swing.ImageIcon;
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

        JOptionPane.showMessageDialog(null,
                "Bem-vindo ao painel administrativo do Corpo de Bombeiros Militar de Santa Catarina.",
                "SISTEMA DE SUPORTE PARA O CORPO DE BOMBEIROS",
                0,
                new ImageIcon(Sistema.class.getResource("placeholder.png")));

        int escolha = JOptionPane.showOptionDialog(null, "Bem vindo ao Sistema! "
                + "\n\nSelecione uma opção: ", "MENU PRINCIPAL", 0,
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Sistema.class.getResource("axes.png")),
                new Object[]{
                    "Registros",
                    "Solicitação do AVCB",
                    "Sobre",
                    "SAIR",}, null);

        while (escolha < 3) {
            switch (escolha) {
                case 0:
                    menus.menuRegistro();
                    break;
                case 1:
                    menusAvcb.RegistroAvcb();
                    break;
                case 2:
                    sobre.Sobre();
                    break;
               // default:
                 //   JOptionPane.showMessageDialog(null,
                   //         "Escolha outra opção!",
                     //       "Opção inválida",
                       //     JOptionPane.ERROR_MESSAGE);
            }

            escolha = JOptionPane.showOptionDialog(null, "Bem vindo ao Sistema! "
                + "\n\nSelecione uma opção: ", "MENU PRINCIPAL", 0,
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Sistema.class.getResource("axes.png")),
                new Object[]{
                    "Registros",
                    "Solicitação do AVCB",
                    "Sobre",
                    "SAIR",}, null);

        }
    }
}
