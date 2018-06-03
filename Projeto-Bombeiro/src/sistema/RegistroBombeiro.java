package sistema;

import javax.swing.JOptionPane;

public class RegistroBombeiro {

    /**
     *
     * @author Joseph
     */
    String[] nomes = new String[100];
    int[] idades = new int[100];
    double[] alturas = new double[100];
    double[] pesos = new double[100];
    String[] batalhoes = new String[100];
    String[] regioes = new String[100];
    String[] cargos = new String[100];
    char[] sexo = new char[100];
    char[] sexos = new char[100];
    String[] buscarBatalhoes = new String[100];
    String[] cpfs = new String[100];
    int atual = 0;

    public void cadastrar() {

        solicitarInformacao(atual);
        atual++;
    }

    public void editar() {
        String busca = JOptionPane.showInputDialog("Digite o nome do bombeiro(a) para editar.");
        for (int i = 0; i < atual; i++) {
            if (nomes[i].equals(busca)) {
                solicitarInformacao(i);
                return;
            }

        }
    }

    public void listar() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomes[i] + "     " + batalhoes[i] + "\n";

        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void contabilizarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial do bombeiro(a) para a busca.");
        int quantidadeRegistros = 0;
        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                quantidadeRegistros++;
            }

        }
        
        JOptionPane.showMessageDialog(null,
                "A quantidade de "
                + busca
                + " cadastrados é: "
                + quantidadeRegistros++);
        }
    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial do bombeiro(a) para a busca.");
        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacao(i);
            }

        }
    }

    public void buscarPorBatalhao() {
        String buscarrBatalhoes = JOptionPane.showInputDialog(null, "Selecione o batalhão pertencente para a busca", "", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"1º BBM - Florianópolis", "2º BBM - Curitibanos", "3º BBM - Blumenau", "4º BBM - Criciuma ", "5º BBM - Lages", "6° BBM - Chapecó", "7º BBM - Itajaí"},
        buscarBatalhoes != null ? buscarBatalhoes : "3º BBM - Blumenau").toString();
        String texto = "";
        for (int i = 0; i < atual; i++) {
            if (batalhoes[i].equals(buscarrBatalhoes)) {
            texto += "Nome: " + nomes[i]
                + "\nIdade: " + idades[i]
                + "\nSexo: " + sexo[i]
                + "\nAltura: " + alturas[i]
                + "\nPeso: " + pesos[i]
                + "\nBatalhão: " + batalhoes[i]
                + "\n";
                
                
            } else if(!batalhoes[i].equals(buscarrBatalhoes)){ 
            JOptionPane.showMessageDialog(null, "Não há nenhum bombeiro(a) registrado neste batalhão.");
            return;
        }
            
        }
 JOptionPane.showMessageDialog(null, texto);
    }
    public void apresentarBuscaPorBatalhao(int posicao){
     
        String texto = "";
        texto += "Nome: " + nomes[posicao]
                + "\nIdade: " + idades[posicao]
                + "\nSexo: " + sexo[posicao]
                + "\nAltura: " + alturas[posicao]
                + "\nPeso: " + pesos[posicao]
                + "\nBatalhão: " + batalhoes[posicao]
                + "\n";
     JOptionPane.showMessageDialog(null, texto);
}

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null, "Nome: " + nomes[posicao]
                + "\nIdade: " + idades[posicao]
                + "\nSexo: " + sexo[posicao]
                + "\nAltura: " + alturas[posicao]
                + "\nPeso: " + pesos[posicao]
                + "\nBatalhão: " + batalhoes[posicao]
        );
                
    }

    public void solicitarInformacao(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog("Informe o nome do bombeiro(a).");
        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do(a) " + nomes[posicao] + ":"));
        while (idades[posicao] < 18 || idades[posicao] > 90) {
            JOptionPane.showMessageDialog(null,
            "A idade deve ser entre 18 a 90 anos.");
            idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite novamente a idade."));
       }
        sexo[posicao] = JOptionPane.showInputDialog("Informe o sexo do(a) " + nomes[posicao] + ":").charAt(0);
       while (sexo[posicao] != 'm' 
                && sexo[posicao] != 'f' && sexo[posicao] != 'M' && sexo[posicao] != 'F') {
            JOptionPane.showMessageDialog(null,
            "O sexo deve ser masculino ou feminino.");
            sexo[posicao] = JOptionPane.showInputDialog(
            "Digite novamente o sexo.").charAt(0);
       }

        alturas[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do(a) " + nomes[posicao] + ":").replace(",", "."));
        pesos[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do(a) " + nomes[posicao] + ":").replace(",", "."));
        batalhoes[posicao] = JOptionPane.showInputDialog(null, "Selecione o batalhão pertencente", "", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"1º BBM - Florianópolis", "2º BBM - Curitibanos", "3º BBM - Blumenau", "4º BBM - Criciuma ", "5º BBM - Lages", "6° BBM - Chapecó", "7º BBM - Itajaí"},
        batalhoes[posicao] != null ? batalhoes[posicao] : "3º BBM - Blumenau").toString();
        
        cpfs[posicao] = (JOptionPane.showInputDialog("Informe o CPF do(a) " + nomes[posicao] + ":",
                cpfs[posicao] != null ? cpfs[posicao] : "")).replace(".", "").replace("-", "");

        while (cpfs[posicao].trim().equals("") 
                || cpfs[posicao].replace(".", "").replace("-", "").length() < 11 || cpfs[posicao].replace(".", "").replace("-", "").length() > 11) {
            JOptionPane.showMessageDialog(null,
            "O CPF deve conter obrigatoriamente 11 dígitos.");
            cpfs[posicao] = JOptionPane.showInputDialog(
            "Digite novamente o CPF.",
            cpfs[posicao] != null ? cpfs[posicao] : "");

        }
        

    }
}
