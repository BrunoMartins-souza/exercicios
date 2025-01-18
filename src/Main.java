import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Secao4 secao4 = new Secao4();


        int opc;

        do {
            System.out.println("\n== MENU INICIAL ==");
            System.out.println(" 1 - Exercício Seção 04: Estrutura sequencial.");
            System.out.println(" 0 - Sair.");
            System.out.print("Escolha um opção: ");
            opc = input.nextInt();

            switch (opc){
                case 1:
                    secao4.menu();
                    break;
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