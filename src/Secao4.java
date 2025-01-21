import java.util.Scanner;

public class Secao4 {

    public void menu(){
        Scanner input = new Scanner(System.in);

        int opc;

        do {
            System.out.println("\n== MENU SEÇÃO 04 ==");
            System.out.println(" 1 - Exercício 01: Informe dois valores para saber a soma.");
            System.out.println(" 2 - Exercício 02: Informe o raio de um circulo para saber a area do mesmo.");
            System.out.println(" 3 - Exercício 03: Informe quatro valores A, B, C e D para saber a diferença entre A e B para C e D.");
            System.out.println(" 4 - Exercício 04: Informe o número do funcionário, a quantidade de horas trabalhada e o valor da hora de trabalho.");
            System.out.println(" 0 - Sair.");
            System.out.print("Escolha uma opção: ");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2();
                    break;
                case 3:
                    exercicio3();
                    break;
                case 4:
                    exercicio4();
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

    public void exercicio2(){
        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
        */
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double area = 3.14159 * (Math.pow(raio, 2.00));

        System.out.printf("A = %.4f%n", area);
    }

    public void exercicio3(){
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        */
        Scanner input = new Scanner(System.in);

        int a, b, c, d;
        int diferenca;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        diferenca = (a * b) - (c * d);

        System.out.printf("Diferença = %d%n", diferenca);
    }

    public void exercicio4(){
        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.
        */
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        double horasTrabalhada = input.nextDouble();
        double valorPorHora = input.nextDouble();
        double salario;

        salario = horasTrabalhada * valorPorHora;

        System.out.printf("Número = %d%n", numero);
        System.out.printf("Número = U$ %.2f%n", salario);
    }
}
