/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class RegistroOcorrencia {
           
       String[] tipos = new String[100];
       String[] ruas = new String[100];
       String[] numeroLocal = new String[100];
       String[] PontoRefs = new String[100];
       String[] gravidades = new String [100];
       String[] nomes = new String [100];
       String[] telefones = new String [100];
       int atual = 0;
       
       public void cadastrar(){
       
       
           solicitarInformacao(atual);
           atual++;
       }
       public void editar(){
           String busca = JOptionPane.showInputDialog("Digite o nome cadastrado na ocorrência para editar.");
           for (int i = 0; i < atual; i++) {
               if(nomes[i].equals(busca)){
                   solicitarInformacao(i);
                   return;
               }
               
           }
       }
       public void listar(){
           String texto = "";
           for (int i = 0; i < atual; i++) {
               texto += tipos[i] + "         " + "na rua " +  ruas[i] + "\n"; 
               
           }
            JOptionPane.showMessageDialog(null, texto);
       }
       public void contabilizarPeloTipo(){
           String busca = JOptionPane.showInputDialog("Digite o tipo de incidente para a busca.");
           int quantidadeRegistros = 0;
           
           for (int i = 0; i < atual; i++) {
               if(tipos[i].contains(busca)){
                   quantidadeRegistros++;
                   
               
           }
               
           }
           JOptionPane.showMessageDialog(null, "A quantidade de incidentes do tipo " + busca + " registrados é: " + quantidadeRegistros);
       }
       public void buscarPeloNome(){
           String busca = JOptionPane.showInputDialog("Digite o nome parcial registrado na ocorrência.");
           for (int i = 0; i < atual; i++) {
               if(nomes[i].contains(busca)){
                   apresentarInformacao(i);
               }
               
           }
       }
       public void buscarPorGravidade(){
           String gravidadeBuscada = JOptionPane.showInputDialog("Informe o grau de gravidade do incidente.");
           
           for (int i = 0; i < atual; i++) {
               if(gravidades[i].equals(gravidadeBuscada)){
                   apresentarInformacao(i);
                   return;
               }
               
           }
           JOptionPane.showMessageDialog(null, "Informação não especificada.");


       }

       
       
       
        public void apresentarInformacao(int posicao){
            JOptionPane.showMessageDialog(null, "Tipo de incidência: " + tipos[posicao] +
                                          "\nRua: " + ruas[posicao] +
                                          "\nNúmero do local: " + numeroLocal[posicao]+
                                          "\nPonto de referência: " + PontoRefs[posicao] +
                                          "\nGrau de Gravidade: " + gravidades[posicao] +
                                          "\nNome: " + nomes[posicao] +
                                          "\nTelefone para contato: " + telefones[posicao]);
                    }        
                    
    public void solicitarInformacao(int posicao){
        
            
            tipos[posicao] = JOptionPane.showInputDialog("Selecione o tipo de incidente.");
        ruas[posicao] = JOptionPane.showInputDialog("Informe a rua do local. ");
        numeroLocal[posicao] = JOptionPane.showInputDialog("Informe o número do local.");
        PontoRefs[posicao] = JOptionPane.showInputDialog("Informe o ponto de referência. ");
        gravidades[posicao] =  JOptionPane.showInputDialog("Informe o grau de gravidade.");
        nomes[posicao] = JOptionPane.showInputDialog("Informe o seu nome.");
        telefones[posicao] = JOptionPane.showInputDialog("Informe o telefone para contato.");
        
    
        }}
