package Exercicio2;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um numero");
            int numero = sc.nextInt();
            for(int i = 0; i < 10; i++){
                System.out.println(numero + " x " + (i + 1) + " = " + numero * (i + 1));
            }
            
        } catch (Exception e) {
            System.out.println("Digite um valor inteiro");
        }
    }
}
