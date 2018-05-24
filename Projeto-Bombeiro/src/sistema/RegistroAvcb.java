package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class RegistroAvcb {

    String[] nomeEdificio = new String[100];
    String[] nomeDono = new String[100];
    boolean[] pararaio = new boolean[100];
    boolean[] brigadaIncendio = new boolean[100];
    boolean[] gas = new boolean[100];
    boolean[] escada = new boolean[100];
    boolean[] eletrica = new boolean[100];
    boolean[] incendio = new boolean[100];
    boolean[] cmar = new boolean[100];
    //Controle de Materiais de Acabamento e Revestimento - se os materiais são anti-fogo
    int atual = 0;

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void editar() {
        String busca = JOptionPane.showInputDialog("Digite o nome do edificio desejado: ");
        for (int i = 0; i < atual; i++) {
            if (nomeEdificio[i].equals(busca)) {
                solicitarInformacao(i);
                return;
            }
        }
    }

    public void listar() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomeEdificio[i];
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null, "Nome: " + nomeEdificio[posicao]
                + "\n");
    }

    public void solicitarInformacao(int posicao) {
        nomeEdificio[posicao] = JOptionPane.showInputDialog("Informe o nome do edificio: ");
        nomeDono[posicao] = JOptionPane.showInputDialog("Informe o nome do proprietario do edificio: ");
        int resultado = JOptionPane.showConfirmDialog(null, "O edificio tem para-raio?", "", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            pararaio[posicao] = true;
        }else{
            pararaio[posicao] = false;
        }
        resultado = JOptionPane.showConfirmDialog(null, "")
    }
}
