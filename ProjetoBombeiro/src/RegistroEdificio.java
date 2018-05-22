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

    public void quantidadeEdificios() {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Registros\n" + "1    -  Registro de Bombeiro\n" + "2    -  Registro de Edifício\n" + "3    -  Registro de Ocorrência\n" + "4    -  Editar\n" + "5    -  Sair"));
        while (escolha != 5) {
            switch (escolha) {
                case 2:
                    int qnt = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de solicitações: "));

                    String[] nome = new String[qnt];
                    String[] cpf = new String[qnt];
                    String[] cidade = new String[qnt];
                    String[] rua = new String[qnt];
                    String[] cep = new String[qnt];
                    String[] cnpj = new String[qnt];
                    String[] captcha = new String[qnt];

                    for (int i = 0; i < qnt; i++) {
                        nome[i] = JOptionPane.showInputDialog("Digite o nome do proprietario do edificil: ");
                        cpf[i] = JOptionPane.showInputDialog(nome[i] + " digite seu CPF: ")
                                .replace(".", "").replace("-", "");
                        cidade[i] = JOptionPane.showInputDialog(nome[i] + " digite a cidade do edificio: ");
                        rua[i] = JOptionPane.showInputDialog(nome[i] + " digite a rua do edificio: ");
                        cep[i] = JOptionPane.showInputDialog(nome[i] + " digite o CEP do edificio: ");
                        cnpj[i] = JOptionPane.showInputDialog(nome[i] + " digite o CNPJ do edificio: ");
                        captcha[i] = JOptionPane.showInputDialog(nome[i] + " você é um robo? ");
                        break;
                    }
            }

        }

    }
}
