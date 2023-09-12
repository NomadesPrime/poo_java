package Exercicio5.Atividade1e2;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite seu peso");
        float peso = scanner.nextFloat();
        System.out.println("Digite sua altura");
        float altura = scanner.nextFloat();
        System.out.println("Digite sua data de nascimento");
        String dataNascimento = scanner.nextLine();
        dataNascimento = scanner.nextLine();
        Pessoa pessoa = new Pessoa(nome, peso, altura, dataNascimento);
        if(pessoa.IMC() < 18.5) {
            System.out.println("Abaixo do peso");
        } else if(pessoa.IMC() > 18.5 && pessoa.IMC() < 24.9) {
            System.out.println("Peso ideal");
        } else if(pessoa.IMC() > 25 && pessoa.IMC() < 29.9) {
            System.out.println("Levemente acima do peso");
        } else if(pessoa.IMC() > 30 && pessoa.IMC() < 34.9) {
            System.out.println("Obesidade I");
        } else if(pessoa.IMC() > 35 && pessoa.IMC() < 39.9) {
            System.out.println("Obesidade II");
        } else if(pessoa.IMC() > 40) {
            System.out.println("Obesidade III");
        }
        scanner.close();
    }

}
