package Exercicio2;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        int exercicios = 10;
        do{
        clearScreen();
        System.out.println("Escolha o exercicio");
        System.out.println("0 - Sair");
        for(int i = 1; i <= exercicios; i++){
            System.out.println(i + " - Exercicio " + i);
        }
        int exercicio = sc.nextInt();
        switch(exercicio){
            case 0:
                System.out.println("Saindo...");
                return;
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
                System.in.read();;
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
            default:
                System.out.println("Exercicio inválido");
                break;
        }
        }while(true);
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
