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
    String[] Liberado = new String[100];
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
            texto += nomeEdificio[i]
                    + "     -     Edificio do sr(a)     -     "
                    + nomeDono[i] + "      -       "
                    + Liberado[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null, "Nome: " + nomeEdificio[posicao]
                + "     -     " + Liberado[posicao]);
    }

    public void solicitarInformacao(int posicao) {
        nomeEdificio[posicao] = JOptionPane.showInputDialog("Informe o nome do edificio: ");
        nomeDono[posicao] = JOptionPane.showInputDialog("Informe o nome do proprietario do edificio: ");
        int resultado = JOptionPane.showConfirmDialog(null, "O edificio tem para-raio?", "", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            pararaio[posicao] = true;
        } else {
            pararaio[posicao] = false;
        }
        resultado = JOptionPane.showConfirmDialog(null, "A instalação de gás está funcionando de acordo?", "", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            gas[posicao] = true;
        } else {
            gas[posicao] = false;
        }
        resultado = JOptionPane.showConfirmDialog(null, "A equipe de brigada de incendio tem capacitação?", "", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            brigadaIncendio[posicao] = true;
        } else {
            brigadaIncendio[posicao] = false;
        }
        resultado = JOptionPane.showConfirmDialog(null, "Contém escada pressurizada?", "", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            escada[posicao] = true;
        } else {
            escada[posicao] = false;
        }
        resultado = JOptionPane.showConfirmDialog(null, "A intalação elétrica atesta boas condições?", "", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            eletrica[posicao] = true;
        } else {
            eletrica[posicao] = false;
        }
        resultado = JOptionPane.showConfirmDialog(null, "O edificio contém todos equipamentos para o combate a um incêndio?", "", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            incendio[posicao] = true;
        } else {
            incendio[posicao] = false;
        }
        resultado = JOptionPane.showConfirmDialog(null, "O edificio fez o controle de materiais de acabamentos e revestimento?", "", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            cmar[posicao] = true;
        } else {
            cmar[posicao] = false;
        }
        if (pararaio[posicao] == true
                && gas[posicao] == true
                && brigadaIncendio[posicao] == true
                && escada[posicao] == true
                && eletrica[posicao] == true
                && incendio[posicao] == true
                && cmar[posicao] == true) {
            JOptionPane.showMessageDialog(null, "Este edificio está liberado para funcionamento, continue o processo na prefeitura!");
            Liberado[posicao] = "Este edificio está liberado para funcionamento!";
        } else {
            JOptionPane.showMessageDialog(null, "Corrija os defeitos e retorne para outra avaliaçao!");
            Liberado[posicao] = "Este edificio não passou na avaliação!";
        }

    }
}
