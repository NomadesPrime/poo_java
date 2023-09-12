package Exercicio5.Ativade5;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio");
        float raio = sc.nextFloat();
        Circunferencia circunferencia = new Circunferencia(raio);
        System.out.println("Area: " + circunferencia.calcularArea());
        sc.close();
    }
}
