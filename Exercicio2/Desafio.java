package Exercicio2;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor pago: ");
        int valorPago = sc.nextInt();
        int[] notas = { 100, 50, 10, 5, 1 };
        int[] quantidadeNotas = new int[5];
        int i = 0;
        while (valorPago > 0) {
            if (valorPago >= notas[i]) {
                valorPago -= notas[i];
                quantidadeNotas[i]++;
            } else {
                i++;
            }
        }
        System.out.println("Troco que deve ser dado: ");
        for (int j = 0; j < notas.length; j++) {
            if (notas[j] == 1 && quantidadeNotas[j] == 1) {
                System.out.println(quantidadeNotas[j] + " moeda de " + notas[j]);
            } else if (quantidadeNotas[j] > 1 && notas[j] == 1) {
                System.out.println(quantidadeNotas[j] + " moedas de " + notas[j]);

            } else if (quantidadeNotas[j] == 1) {
                System.out.println(quantidadeNotas[j] + " nota de " + notas[j]);
            } else if (quantidadeNotas[j] > 1) {
                System.out.println(quantidadeNotas[j] + " notas de " + notas[j]);

            }
        }

    }

}
