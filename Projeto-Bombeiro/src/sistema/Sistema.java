package sistema;

import javax.swing.JOptionPane;

public class Sistema {

    MenuRegistro menus = new MenuRegistro();
    RegistroBombeiro registroBombeiro = new RegistroBombeiro();
    RegistroEdificio cadastroEdificio = new RegistroEdificio();
    MenuRegistroBombeiro aux = new MenuRegistroBombeiro();

    public void apresentarMenu() {

        JOptionPane.showMessageDialog(null, "Bem-vindo ao painel administrativo do Corpo de Bombeiros Militar de Santa Catarina.");
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" + "1    -  Registros\n" + "2    -  Logística\n" + "3    -  Sobre\n" + "4    -  Sair"));
        while (escolha != 4) {
            switch (escolha) {
                case 1:
                    menus.menuRegistro();
                    break;
                case 2:
                    break;
            }

            escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" + "1    -  Registros\n" + "2    -  Logística\n" + "3    -  Sobre\n" + "4    -  Sair"));

        }

    }
}
