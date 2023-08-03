package Exercicio1;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
        try{
            System.out.println("Digite a 1ª nota: ");
            double nota1 = scanner.nextDouble();
            System.out.println("Digite a 2ª nota: ");
            double nota2 = scanner.nextDouble();
            System.out.println("Digite a 3ª nota: ");
            double nota3 = scanner.nextDouble();
            double media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média é: " + media);
            break;
        }
        catch (Exception e){
            System.out.println("Digite um número");
            scanner.next();
        }   
       

    }
    while(true);
    }
}
