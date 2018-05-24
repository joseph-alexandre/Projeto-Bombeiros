
package sistema;
import javax.swing.JOptionPane;
public class RegistroBombeiro {
 
       //int quantidadeRegistros = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de bombeiro(a) que deseja cadastrar."));
       String[] nomes = new String[1];
       int[] idades = new int[1];
       double[] alturas = new double[1];
       double[] pesos = new double[1];
       String[] batalhoes = new String [1];
       String[] regioes = new String [1];
       String[] cargos = new String [1];
       char[] sexo = new char [1];
       int atual = 0;
       
       public void cadastrar(){
           solicitarInformacao(atual);
           atual++;
       }
       public void editar(){
           String busca = JOptionPane.showInputDialog("Digite o nome do bombeiro(a) para editar.");
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
               texto += nomes[i] + "     " + cargos[i] + "\n"; 
               
           }
            JOptionPane.showMessageDialog(null, texto);
       }
       public void contabilizarPeloNome(){
           String busca = JOptionPane.showInputDialog("Digite o nome parcial do bombeiro(a) para a busca.");
           int quantidadeRegistros = 0;
           for (int i = 0; i < quantidadeRegistros; i++) {
               if(nomes[i].contains(busca)){
               quantidadeRegistros++;
           }
               
           }
           JOptionPane.showMessageDialog(null, "A quantidade de " + busca + "cadastrados é: " +quantidadeRegistros);
       }
       public void buscarPeloNome(){
           String busca = JOptionPane.showInputDialog("Digite o nome parcial do bombeiro(a) para a busca.");
           for (int i = 0; i < atual; i++) {
               if(nomes[i].contains(busca)){
                   apresentarInformacao(i);
               }
               
           }
       }
       public void buscarPorBatalhao(){
           String batalhaoBuscado = JOptionPane.showInputDialog("Digite o batalhão pertencente do bombeiro(a).");
           for (int i = 0; i < atual; i++) {
               if(batalhoes[i].equals(batalhaoBuscado)){
                   apresentarInformacao(i);
                   return;
               }
               
           }
           JOptionPane.showMessageDialog(null, "Batalhão não encontrado.");


       }

       
        public void apresentarInformacao(int posicao){
            JOptionPane.showMessageDialog(null, "Nome: " + nomes[posicao] +
                                          "\nIdade: " + idades[posicao] +
                                          "\nSexo: " + sexo[posicao]+
                                          "\nAltura: " + alturas[posicao] +
                                          "\nPeso: " + pesos[posicao] +
                                          "\nBatalhão: " + batalhoes[posicao] +
                                          "\nRegião: " + regioes[posicao] +
                                          "\nCargo: " + cargos[posicao]);
        }
        public void solicitarInformacao(int posicao){
        nomes[posicao] = JOptionPane.showInputDialog("Informe o nome do bombeiro(a).");
        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do(a) " + nomes[posicao] + ":"));
        sexo[posicao] = JOptionPane.showInputDialog("Informe o sexo do(a) " + nomes[posicao] + ":").toUpperCase().charAt(0);
        alturas[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do(a) " + nomes[posicao] + ":"));
        pesos[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do(a) " + nomes[posicao] + ":"));
        batalhoes[posicao] =  JOptionPane.showInputDialog("Informe o batalhão do(a) " + nomes[posicao] + ":");
        regioes[posicao] = JOptionPane.showInputDialog("Informe a região do(a) " + nomes[posicao] + ":");
        cargos[posicao] = JOptionPane.showInputDialog("Informe o cargo do(a) " + nomes[posicao] + ":");
        
            
        }
}
