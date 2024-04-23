package clculattt;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo � Calculadora!");
        System.out.print("Digite o nome da calculadora: ");
        String nomeCalculadora = scanner.nextLine();

        // Criando uma inst�ncia da Calculadora
        Calculadoiira minhaCalculadora = new Calculadoiira(nomeCalculadora);

        // Menu de opera��es
        while (true) {
            System.out.println("\nEscolha a opera��o:");
            System.out.println("1. Soma");
            System.out.println("2. Subtra��o");
            System.out.println("0. Sair");
            System.out.print("Op��o: ");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo da calculadora "+nomeCalculadora+". At� mais!");
                break;
            }

            double resultado = 0.0;

            switch (opcao) {
                case 1:
                    // Opera��o de soma
                    System.out.println("Opera��o de Soma");
                    System.out.print("Digite o primeiro n�mero: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo n�mero: ");
                    double num2 = scanner.nextDouble();
                    resultado = minhaCalculadora.soma(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    // Opera��o de subtra��o
                    System.out.println("Opera��o de Subtra��o");
                    System.out.print("Digite o primeiro n�mero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo n�mero: ");
                    num2 = scanner.nextDouble();
                    resultado = minhaCalculadora.subtracao(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;

                default:
                    System.out.println("Op��o inv�lida. Tente novamente.");
            }
        }

        scanner.close(); // Fechando o scanner ap�s o uso
    }

	}

