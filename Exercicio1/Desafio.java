package Exercicio1;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um numero para verificar se é primo");
            int number = sc.nextInt();
            int primo = 0;
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    primo = 1;
                }
            }
            if(primo == 0){
                System.out.println("O numero é primo");
            }else{
                System.out.println("O numero não é primo");
            }
            
            
        } catch (Exception e) {
            System.out.println("Digite um valor inteiro");

        }

    }

}
