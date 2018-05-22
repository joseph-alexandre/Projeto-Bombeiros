
import javax.swing.JOptionPane;


public class CadastroBombeiro {
    
    
   public void quantidadeCadastroBombeiro(){
       int escolha = Integer.parseInt(JOptionPane.showInputDialog("Registros\n" + "1    -  Registro de Bombeiro\n" + "2    -  Registro de Edifício\n" + "3    -  Registro de Ocorrência\n" + "4    -  Editar"));
    
}
    
   public void solicitarCadastroBombeiro(){
       int quantidadeBombeiro = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de bombeiros que deseja cadastrar."));
       String[] nomes = new String[quantidadeBombeiro];
       int[] idades = new int[quantidadeBombeiro];
       double[] alturas = new double[quantidadeBombeiro];
       double[] pesos = new double[quantidadeBombeiro];
       String[] batalhoes = new String [quantidadeBombeiro];
       String[] regioes = new String [quantidadeBombeiro];
       String[] cargos = new String [quantidadeBombeiro];
       char[] sexo = new char [quantidadeBombeiro];
       
       for (int i = 0; i < quantidadeBombeiro; i++) {
           nomes[i] = JOptionPane.showInputDialog("Informe o nome do" + (i + 1) + "° bombeiro(a).");
           idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do" + (i + 1) + "° bombeiro(a)."));
           sexo[i] = JOptionPane.showInputDialog("Informe o sexo do" + (i + 1) + "° bombeiro(a).").toUpperCase().charAt(0);
           alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do" + (i + 1) + "° bombeiro(a)."));
           pesos[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do" + (i + 1) + "° bombeiro(a)."));
           batalhoes[i] = JOptionPane.showInputDialog(null, "Informe o batalhão pertencente do" + (i + 1) + "° bombeiro(a).");
           regioes[i] = JOptionPane.showInputDialog(null, "Informe a região pertencente do" + (i + 1) + "° bombeiro(a).");
           cargos[i] = JOptionPane.showInputDialog(null, "Informe o cargo pertencente do" + (i + 1) + "° bombeiro(a).");
           
           
           
       }
   }
}
