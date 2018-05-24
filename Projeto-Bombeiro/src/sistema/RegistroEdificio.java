package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class RegistroEdificio {

    String[] nome = new String[1];
    String[] cpf = new String[1];
    String[] cidade = new String[1];
    String[] rua = new String[1];
    String[] cep = new String[1];
    String[] cnpj = new String[1];
        String[] edificio = new String[1];
    int atual = 0;

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void editarEdificio() {
        String busca = JOptionPane.showInputDialog("Digite o nome do edificio para solicitação: ");
        for (int i = 0; i < atual; i++) {
            if (edificio[i].equalsIgnoreCase(busca)) {
                solicitarInformacao(i);
                return;
            }
        }
    }

    public void listarEdificios() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += edificio[i] + "      -       " + nome[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void solicitarInformacao(int posicao) {
        nome[posicao] = JOptionPane.showInputDialog("Digite o nome do proprietario do edificio: ");
        cpf[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite seu CPF: ")
                .replace(".", "").replace("-", "");
        cidade[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite a cidade do edificio: ");
        rua[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite a rua do edificio: ");
        cep[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite o CEP do edificio: ");
        cnpj[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite o CNPJ do edificio: ");
        edificio[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite o tipo de edificio: ");

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
