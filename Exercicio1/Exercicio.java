package Exercicio1;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            clearScreen();
            System.out.println("Escolha o exercício: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Exercício 1");
            System.out.println("2 - Exercício 2");
            System.out.println("3 - Exercício 3");
            System.out.println("4 - Exercício 4");
            System.out.println("5 - Exercício 5");
            System.out.println("6 - Exercício 6");
            System.out.println("7 - Exercício 7");
            System.out.println("8 - Exercício 8");
            System.out.println("9 - Exercício 9");
            System.out.println("10 - Exercício 10");
            System.out.println("11 - Exercício 11");
            System.out.println("12 - Desafio");
            try {
                opcao = sc.nextInt();
            } catch (Exception e) {

                System.out.println("Digite um número inteiro");
                sc.next();
            }
            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    clearScreen();
                    Exercicio1.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 2:
                    clearScreen();
                    Exercicio2.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 3:
                    clearScreen();
                    Exercicio3.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 4:
                    clearScreen();
                    Exercicio4.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 5:
                    clearScreen();
                    Exercicio5.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 6:
                    clearScreen();
                    Exercicio6.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 7:
                    clearScreen();
                    Exercicio7.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 8:
                    clearScreen();
                    Exercicio8.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 9:
                    clearScreen();
                    Exercicio9.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 10:
                    clearScreen();
                    Exercicio10.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 11:
                    clearScreen();
                    Exercicio11.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 12:
                    clearScreen();
                    Desafio.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.in.read();
                    break;
            }
        } while (opcao != 0);
        sc.close();
    }

    public static void clearScreen() throws InterruptedException, IOException {
        if (System.getProperty("os.name").contains("Windows")){
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        

    }
}