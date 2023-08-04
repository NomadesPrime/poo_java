package Exercicio1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um valor");
            int valor = sc.nextInt();
            System.out.println("Digite outro valor");
            int valor2 = sc.nextInt();
            if (valor > (valor2 * 2)) {
                System.out.println("O primeiro valor é maior que o dobro do segundo");
            } else if (valor2 > (valor * 2)) {
                System.out.println("O segundo valor é maior que o dobro do primeiro");
            } else {
                System.out.println("Nenhum dos valores é maior que o dobro do outro");
            }
        } catch (Exception e) {
            System.out.println("Digite um número");
            sc.next();
        }

    }

}
