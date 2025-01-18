import java.util.Scanner;

public class Secao4 {

    public void menu(){
        Scanner input = new Scanner(System.in);

        int opc;

        do {
            System.out.println("\n== MENU SEÇÃO 04 ==");
            System.out.println(" 0 - Sair.");
            System.out.print("Escolha uma opção: ");
            opc = input.nextInt();

            switch (opc) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opc != 0);
    }
    
}
