package sistema;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        MenuRegistroBombeiro aux = new MenuRegistroBombeiro();
        sistema.apresentarMenu();
        aux.menuRegistroBombeiro();
        ;
    }
    
}