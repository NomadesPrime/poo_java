package Exercicio1;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite o valor de a");
            double a = sc.nextDouble();
            System.out.println("Digite o valor de b");
            double b = sc.nextDouble();
            System.out.println("Digite o valor de c");
            double c = sc.nextDouble();
            double delta = (b * b) - (4 * a * c);
            double x1 = (-b + delta) / (2 * a);
            double x2 = (-b - delta) / (2 * a);
            System.out.println("O valor de x1 é: " + x1);
            System.out.println("O valor de x2 é: " + x2);       
        }
        catch (Exception e){
            System.out.println("Digite um número");
            sc.next();
        }

    }
    
}
//16
// 40
// 16 - 40 = -24
// -4 - 24 = -28
// -28 / 4 = -7

