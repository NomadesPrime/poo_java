package Exercicio1;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um valor");
            int numero = sc.nextInt();
            if(numero % 2 == 0){
                System.out.println("o valor é par");
            } else{
                System.out.println("o valor é impar");
            }
        } catch (Exception e) {
            
        }
    }
}
