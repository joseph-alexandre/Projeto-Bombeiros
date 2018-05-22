import javax.swing.JOptionPane;

public class MenuRegistro {
     
RegistroBombeiro registroBombeiro = new RegistroBombeiro();

public void menuRegistro() {
       int escolha = Integer.parseInt(JOptionPane.showInputDialog("Registros\n" + "1    -  Registro de Bombeiro\n" + "2    -  Registro de Edifício\n" + "3    -  Registro de Ocorrência\n" + "4    -  Editar\n" + "5    -  Sair"));
       while(escolha != 5){
           switch(escolha){
               case 1: registroBombeiro.cadastroBombeiro();
           break;
   
   }}
       
   
       

}}




    

