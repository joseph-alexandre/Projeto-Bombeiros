package sistema;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class About {

    public void Sobre() {

        JOptionPane.showMessageDialog(null, "VIDA ALHEIA E RIQUEZAS Á SALVAR!\n\n"
                + "193 - Bombeiros", "CORPO DE BOMBEIROS MILITAR DE SANTA CATARINA",
                0,
                new ImageIcon(Sistema.class.getResource("emergency-call.png")));

    }
}
