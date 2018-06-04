package sistema;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Joseph
 */
public class MenuRegistro {

    RegistroBombeiro registroBombeiro = new RegistroBombeiro();
    MenuRegistroEdificio menuRegistroEdificio = new MenuRegistroEdificio();
    MenuRegistroBombeiro menuBombeiro = new MenuRegistroBombeiro();
    MenuOcorrencia menuOcorrencia = new MenuOcorrencia();
    int escolha = 0;

    public void menuRegistro() {
        escolha = JOptionPane.showOptionDialog(null, "Selecione uma opção: ", "MENU - REGISTROS", 0,
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Sistema.class.getResource("fire-extinguisher.png")),
                new Object[]{
                    "Registro de Bombeiro",
                    "Registro de Edifício",
                    "Registro de Ocorrência",
                    "RETORNAR"
                }, null);
        while (escolha != 3) {
            switch (escolha) {
                case 0:
                    menuBombeiro.menuRegistroBombeiro();
                    break;
                case 1:
                    menuRegistroEdificio.menuRegistroEdificio();
                    break;
                case 2:
                    menuOcorrencia.menuOcorrencia();
                    break;
                

            }
            escolha = JOptionPane.showOptionDialog(null, "Selecione uma opção: ", "MENU - REGISTROS", 0,
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Sistema.class.getResource("fire-extinguisher.png")),
                new Object[]{
                    "Registro de Bombeiro",
                    "Registro de Edifício",
                    "Registro de Ocorrência",
                    "RETORNAR"
                }, null);        }

    }
}
