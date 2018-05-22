/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class RegistroEdificio {

    int qnt = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de solicitações: "));
    String[] nome = new String[qnt];
    String[] cpf = new String[qnt];
    String[] cidade = new String[qnt];
    String[] rua = new String[qnt];
    String[] cep = new String[qnt];
    String[] cnpj = new String[qnt];
    String[] edificio = new String[qnt];
    int atual = 0;

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void solicitarInformacao(int posicao) {
        nome[posicao] = JOptionPane.showInputDialog("Digite o nome do proprietario do edificil: ");
        cpf[posicao] = JOptionPane.showInputDialog(nome[posicao] + " digite seu CPF: ")
                .replace(".", "").replace("-", "");
        cidade[posicao] = JOptionPane.showInputDialog(nome[posicao] + " digite a cidade do edificio: ");
        rua[posicao] = JOptionPane.showInputDialog(nome[posicao] + " digite a rua do edificio: ");
        cep[posicao] = JOptionPane.showInputDialog(nome[posicao] + " digite o CEP do edificio: ");
        cnpj[posicao] = JOptionPane.showInputDialog(nome[posicao] + " digite o CNPJ do edificio: ");
        edificio[posicao] = JOptionPane.showInputDialog(nome[posicao] + " digite o tipo de edificio: ");
        

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
}
