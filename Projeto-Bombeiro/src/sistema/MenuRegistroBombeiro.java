/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import javax.swing.JOptionPane;
public class MenuRegistroBombeiro {
    RegistroBombeiro menuBombeiro = new RegistroBombeiro();
    
    public void menuRegistroBombeiro(){
         int escolha = Integer.parseInt(JOptionPane.showInputDialog("Registro de Bombeiro\n" + "1    -  Registrar Bombeiro\n" + "2    -  Editar\n" + "3    -  Listar\n" + "4    -  Contabilizar pelo nome\n" + "5    -  Buscar pelo nome\n" + "6    -  Buscar pelo batalhão\n" + "7    -  Retornar" ));
       while(escolha != 7){
           switch(escolha){
               case 1: menuBombeiro.cadastrar();
           break;
               case 2: menuBombeiro.editar();
           break;
               case 3: menuBombeiro.listar();
           break;
               case 4: menuBombeiro.contabilizarPeloNome();
           break;
               case 5: menuBombeiro.buscarPeloNome();
           break;
               case 6: menuBombeiro.buscarPorBatalhao();
           break;
               
    }
           escolha = Integer.parseInt(JOptionPane.showInputDialog("Registro de Bombeiro\n" + "1    -  Registrar Bombeiro\n" + "2    -  Editar\n" + "3    -  Listar\n" + "4    -  Contabilizar pelo nome\n" + "5    -  Buscar pelo nome\n" + "6    -  Buscar pelo batalhão\n" + "7    -  Retornar" ));

    
}
    }
}