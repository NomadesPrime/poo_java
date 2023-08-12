package Exercicio2;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       try {
         System.out.println("Digite algo");
            String texto = scanner.nextLine();
            for(int i = 0; i < texto.length(); i++){
                System.out.println(texto.charAt(i));
            }
       } catch (Exception e) {
       }
    }
}
