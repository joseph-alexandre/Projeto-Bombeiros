package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class RegistroEdificio {

    String[] nome = new String[100];
    String[] cpf = new String[100];
    String[] cidade = new String[100];
    String[] rua = new String[100];
    String[] cep = new String[100];
    String[] cnpj = new String[100];
    String[] edificio = new String[100];
    String[] nomeEdificio = new String[100];
    int atual = 0;

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void editarEdificio() {
        String busca = JOptionPane.showInputDialog("Digite o nome fantasia do edifício para modificações: ");
        for (int i = 0; i < atual; i++) {
            if (nomeEdificio[i].equalsIgnoreCase(busca)) {
                apresentarInformacao(i);
                return;
            }
        }
    }

    public void listarEdificios() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += edificio[i] + ",  " + nome[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void solicitarInformacao(int posicao) {
        nome[posicao] = JOptionPane.showInputDialog("Digite o nome do proprietario do edifício: ");
        cpf[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite seu CPF: ")
                .replace(".", "").replace("-", "");
        cidade[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite a cidade do edifício: ");
        rua[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite a rua do edifício: ");
        cep[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite o CEP do edifício: ")
                .replace(".", "").replace("-", "");
        cnpj[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite o CNPJ do edifício: ")
                .replace(".", "").replace("-", "");
        edificio[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite o tipo de edifício: ");

    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Nome do proprietario: " + nome[posicao]
                + "CPF do proprio: " + cpf[posicao]
                + "Cidade do edificio: " + cidade[posicao]
                + "Rua do edificio: " + rua[posicao]
                + "CEP do edificio: " + cep[posicao]
                + "CNPJ do registro: " + cnpj[posicao]
                + "Tipo de edificio: " + edificio[posicao]);

    }

}
