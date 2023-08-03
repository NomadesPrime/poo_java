package Exercicio1;
import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite o valor de um lado");
            double lado = scanner.nextDouble();
            System.out.println("Digite o valor de outro lado");
            double lado2 = scanner.nextDouble();
            System.out.println("o valor da área é: " + lado * lado2);
        }
        catch (Exception e){
            System.out.println("Digite um número");
            scanner.next();
        }
    }
}