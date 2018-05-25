
package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Joseph
 */
public class MenuOcorrencia {
    RegistroOcorrencia menu = new RegistroOcorrencia();
    public void menuOcorrencia(){
    
    
    
         int escolha = Integer.parseInt(JOptionPane.showInputDialog("Registro de Ocorrência\n" + "1    -  Cadastrar ocorrência\n" + "2    -  Editar\n" + "3    -  Listar\n" + "4    -  Contabilizar pelo tipo de incidente\n" + "5    -  Buscar pelo nome cadastrado\n" + "6    -  Buscar por grau de gravidade\n" + "7    -  Retornar"));
       while(escolha != 7){
           switch(escolha){
               case 1: menu.cadastrar();
           break;
               case 2: menu.editar();
           break;
               case 3: menu.listar();
           break;
               case 4: menu.contabilizarPeloTipo();
           break;
               case 5: menu.buscarPeloNome();
           break;
               case 6: menu.buscarPorGravidade();
           break;
               default: JOptionPane.showMessageDialog(null, 
                       "Escolha outra opção!", 
                       "Opção inválida", 
                       JOptionPane.ERROR_MESSAGE);
               
               
               
    }
           
escolha = Integer.parseInt(JOptionPane.showInputDialog("Registro de Ocorrência\n" + "1    -  Cadastrar ocorrência\n" + "2    -  Editar\n" + "3    -  Listar\n" + "4    -  Contabilizar pelo tipo de incidente\n" + "5    -  Buscar pelo nome cadastrado\n" + "6    -  Buscar por grau de gravidade\n" + "7    -  Retornar"));
           

    
}
    }

    }

