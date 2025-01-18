import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opc;

        do {
            System.out.println("\n== MENU INICIAL ==");
            System.out.println(" 0 - Sair.");
            System.out.print("Escolha um opção: ");
            opc = input.nextInt();

            switch (opc){
                case 0: 
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opc != 0);
    }
}