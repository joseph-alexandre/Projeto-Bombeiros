package sistema;

import javax.swing.JOptionPane;

public class MenuRegistro {

    RegistroBombeiro registroBombeiro = new RegistroBombeiro();
    MenuRegistroEdificio menuRegistroEdificio = new MenuRegistroEdificio();
    MenuRegistroBombeiro menuBombeiro = new MenuRegistroBombeiro();
    MenuOcorrencia menuOcorrencia = new MenuOcorrencia();
    int escolha = 0;
    public void menuRegistro() {
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Registros\n" + "1    -  Registro de Bombeiro\n" + "2    -  Registro de Edifício\n" + "3    -  Registro de Ocorrência\n" + "4    -  Retornar"));
        
        while (escolha != 4) {
            switch (escolha) {
                case 1:
                    menuBombeiro.menuRegistroBombeiro();
                    break;
                case 2:
                    menuRegistroEdificio.menuRegistroEdificio();
                    break;
                case 3: menuOcorrencia.menuOcorrencia();
                

            }
 escolha = Integer.parseInt(JOptionPane.showInputDialog("Registros\n" + "1    -  Registro de Bombeiro\n" + "2    -  Registro de Edifício\n" + "3    -  Registro de Ocorrência\n" + "4    -  Retornar"));           
        }


    }}

