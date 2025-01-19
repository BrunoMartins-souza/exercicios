import java.util.Scanner;

public class Secao4 {

    public void menu(){
        Scanner input = new Scanner(System.in);

        int opc;

        do {
            System.out.println("\n== MENU SEÇÃO 04 ==");
            System.out.println(" 1 - Exercício 01: Informe dois valores para saber a soma.");
            System.out.println(" 0 - Sair.");
            System.out.print("Escolha uma opção: ");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    exercicio1();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opc != 0);
    }

    public void exercicio1(){
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
        mensagem explicativa, conforme exemplos
         */
        Scanner input = new Scanner(System.in);

        int valor1, valor2, soma;

        valor1 = input.nextInt();
        valor2 = input.nextInt();

        soma = valor1 + valor2;

        System.out.printf("Soma = %d%n", soma);
    }
    
}
