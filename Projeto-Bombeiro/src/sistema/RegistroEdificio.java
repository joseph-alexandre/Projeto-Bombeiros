package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class RegistroEdificio {

    String[] nome = new String[100];
    String[] cpf = new String[100];
    int[] numero = new int[100];
    String[] cidade = new String[100];
    String[] rua = new String[100];
    int[] num = new int[100];
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

    public void buscarPeloEdificio() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial do bombeiro(a) para a busca.");
        for (int i = 0; i < atual; i++) {
            if (nomeEdificio[i].contains(busca)) {
                apresentarInformacao(i);
            }

        }
    }

    public void listarEdificios() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomeEdificio[i] + ",  " + rua[i] + ",  " + nome[i] + ", " + numero[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void solicitarInformacao(int posicao) {
        nome[posicao] = JOptionPane.showInputDialog("Digite o nome do proprietario do edifício: ");
        cpf[posicao] = (JOptionPane.showInputDialog("Informe o CPF:",
                cpf[posicao] != null ? cpf[posicao] : "")).replace(".", "").replace("-", "").trim();

        while (cpf[posicao].trim().equals("") 
                || cpf[posicao].replace(".", "").replace("-", "").trim().length() < 11 || cpf[posicao].replace(".", "").replace("-", "").trim().length() > 11) {
            JOptionPane.showMessageDialog(null,
            "O CPF deve conter obrigatoriamente 11 dígitos.");
            cpf[posicao] = JOptionPane.showInputDialog(
            "Digite novamente o CPF.",
            cpf[posicao] != null ? cpf[posicao] : "");

        }
        numero[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de telefone do proprietário: ")
                .replace(".", "").replace("-", "").trim());                
        cidade[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite a cidade do edifício: ");
        rua[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite a rua do edifício: ");
        num[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nome[posicao] + ", digite o numero: "));
        cep[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite o CEP do edifício: ")
                .replace(".", "").replace("-", "").trim();
        cnpj[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite o CNPJ do edifício: ")
                .replace(".", "").replace("-", "").trim();
        edificio[posicao] = JOptionPane.showInputDialog(null, nome[posicao] + "Selecione o tipo de edificio",
                "TIPOS DE EDIFICIO", JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{ "", "Residenciais", "Escritórios", "Comerciais",
                    "Industriais", "Especiais", "Mistos"
                },
                "").toString();
        nomeEdificio[posicao] = JOptionPane.showInputDialog(nome[posicao] + ", digite o nome fantasia do edifício: ");

    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Nome do proprietario: " + nome[posicao]
                + "\nCPF do proprio: " + cpf[posicao]
                + "\nCidade do edificio: " + cidade[posicao]
                + "\nRua do edificio: " + rua[posicao]
                + "\nNumero do edificio: " + num[posicao]
                + "\nCEP do edificio: " + cep[posicao]
                + "\nCNPJ do registro: " + cnpj[posicao]
                + "\nTipo de edificio: " + edificio[posicao]
                + "\nNome fantasia do edificio: " + nomeEdificio[posicao]);

    }

}
