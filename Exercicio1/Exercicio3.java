package Exercicio1;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite o valor da largura");
            double largura = scanner.nextDouble();
            System.out.println("Digite o valor da altura");
            double altura = scanner.nextDouble();
            System.out.println("Digite o valor da profundidade");
            double profundidade = scanner.nextDouble();
            System.out.println("o valor do volume é: " + largura * altura * profundidade);
        }
        catch (Exception e){
            System.out.println("Digite um número");
            scanner.next();
        }
    }
    
}
