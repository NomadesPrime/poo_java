package Exercicio5.Atividade6;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha");
        String senha = sc.nextLine();
        System.out.println("Digite o valor constante");
        int constante = sc.nextInt();
        CrifaCesar crifaCesar = new CrifaCesar(senha, constante);
        crifaCesar.criptografar();
    }
}
