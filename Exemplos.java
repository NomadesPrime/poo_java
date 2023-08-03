import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("Digite a idade: ");
        try {
            int idade = scanner.nextInt();
            System.out.println("a idade é: " + idade);
            break;
        } catch (Exception e) {
            System.out.println("Digite um número inteiro");
            scanner.next();
        }
    } while (true);
        scanner.close();
    }
}
