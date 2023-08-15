package Exercicio2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero inteiro");
        int num2 = sc.nextInt();
        System.out.println("Escolha a ação desejada");
        String acao = sc.next();
        switch (acao){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Ação inválida");
                break;
        }
        
    }
    
}
