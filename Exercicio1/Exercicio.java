package Exercicio1;
import java.io.IOException;
import java.util.Scanner;
public class Exercicio{
    public static void main(String[] args) throws InterruptedException, IOException{
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            clearScreen();
            System.out.println("Escolha o exercício: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Exercício 1");
            System.out.println("2 - Exercício 2");
            System.out.println("3 - Exercício 3");
            try{
                opcao = sc.nextInt();
            }
            catch (Exception e){

                System.out.println("Digite um número inteiro");
                sc.next();
            }
            switch(opcao){
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
        
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.in.read();
                    break;
            }
        } while(opcao != 0);
        sc.close();
    }

   public static void clearScreen() throws InterruptedException, IOException {  
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   }
}