
package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Joseph
 */
public class RegistroOcorrencia {
           
       String[] tipos = new String[100];
       String[] ruas = new String[100];
       int[] numeroLocal = new int[100];
       String[] PontoRefs = new String[100];
       String[] gravidades = new String [100];
       String[] nomes = new String [100];
       String[] telefones = new String [100];
       String buscarGravidades = "";
       String contabilizarTipo = "";
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
       JOptionPane.showMessageDialog(null, "Não há nenhuma ocorrência cadastrada neste nome.");
       }
       public void listar(){
           String texto = "";
           for (int i = 0; i < atual; i++) {
               texto += tipos[i] + "         " + "na rua " +  ruas[i] + "\n"; 
               
           }
            JOptionPane.showMessageDialog(null, texto);
       }
       public void contabilizarPeloTipo(){
           String contabilizarrTipos = JOptionPane.showInputDialog(null, "Selecione o tipo de incidente", "", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Afogamento", "Incêndio", "Animal Peçonhento", "Inundação", "Elevadores", "Fogos de Artifício", "Instalações de Gás"},
        contabilizarTipo != null ? contabilizarTipo : "Incêndio").toString();
           int quantidadeRegistros = 0;
           
           for (int i = 0; i < atual; i++) {
               if(tipos[i].contains(contabilizarrTipos)){
                   quantidadeRegistros++;
                   
               
           }
               
           }
           JOptionPane.showMessageDialog(null, "A quantidade de incidentes do tipo " + contabilizarrTipos + " registrados é: " + quantidadeRegistros);
       }
       public void buscarPeloNome(){
           String busca = JOptionPane.showInputDialog("Digite o nome parcial registrado na ocorrência.");
           for (int i = 0; i < atual; i++) {
               if(nomes[i].toLowerCase().contains(busca)){
                   apresentarInformacao(i);
               }
               
           }
       }
       public void buscarPorGravidade(){
           String buscarrGravidades = JOptionPane.showInputDialog(null, "Selecione o grau de gravidade.", "", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Baixa", "Média", "Alta"},
        buscarGravidades != null ? buscarGravidades : "Baixa").toString();
           String texto = "";
           for (int i = 0; i < atual; i++) {
               if(gravidades[i].equals(buscarrGravidades)){
                   texto += "Tipo de incidência: " + tipos[i] +
                                          "\nRua: " + ruas[i] +
                                          "\nNúmero do local: " + numeroLocal[i]+
                                          "\nPonto de referência: " + PontoRefs[i] +
                                          "\nGrau de Gravidade: " + gravidades[i] +
                                          "\nNome: " + nomes[i] +
                                          "\nTelefone para contato: " + telefones[i] +
                                          "\n\n";
                   
               } else if(!gravidades[i].equals(buscarrGravidades)){
                   JOptionPane.showMessageDialog(null, "Não há nenhuma ocorrência registrada com esse grau de gravidade.");
                   return;
               }
               
           }
           JOptionPane.showMessageDialog(null, texto);


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
        
            
            tipos[posicao] = JOptionPane.showInputDialog(null, "Selecione o tipo de incidente", "", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Afogamento", "Incêndio", "Animal Peçonhento", "Inundação", "Elevadores", "Fogos de Artifício", "Instalações de Gás"},
        tipos[posicao] != null ? tipos[posicao] : "Incêndio").toString();
            
        ruas[posicao] = JOptionPane.showInputDialog("Informe a rua do local. ");
        numeroLocal[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do local.").trim());
        PontoRefs[posicao] = JOptionPane.showInputDialog("Informe o ponto de referência. ");
        
        gravidades[posicao] = JOptionPane.showInputDialog(null, "Selecione o grau de gravidade.", "", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Baixa", "Média", "Alta"},
        gravidades[posicao] != null ? gravidades[posicao] : "Baixa").toString();
        nomes[posicao] = JOptionPane.showInputDialog("Informe o seu nome.");
        telefones[posicao] = JOptionPane.showInputDialog("Informe o telefone para contato.").trim().replace("(","").replace(")", "");
        
    
        }}
