package sistema;

import javax.swing.JOptionPane;

public class MenuRegistro {

    RegistroBombeiro registroBombeiro = new RegistroBombeiro();
    MenuRegistroEdificio menuRegistroEdificio = new MenuRegistroEdificio();
    MenuRegistroBombeiro menuBombeiro = new MenuRegistroBombeiro();

    public void menuRegistro() {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Registros\n" + "1    -  Registro de Bombeiro\n" + "2    -  Registro de Edifício\n" + "3    -  Registro de Ocorrência\n" + "4    -  Editar\n" + "5    -  Retornar"));
        while (escolha != 5) {
            switch (escolha) {
                case 1:
                    menuBombeiro.menuRegistroBombeiro();
                    break;
                case 2:
                    menuRegistroEdificio.gerirMenu();
                    break;

            }
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Registros\n" + "1    -  Registro de Bombeiro\n" + "2    -  Registro de Edifício\n" + "3    -  Registro de Ocorrência\n" + "4    -  Editar\n" + "5    -  Retornar"));
        }

    }
}
