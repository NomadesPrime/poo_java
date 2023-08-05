package Exercicio1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Digite o salario recebido");
        double salario = sc.nextDouble();
    if(salario <= 1903.98){
        System.out.println("Isento");
    }
    if(salario > 1903.98 && salario <= 2826.65){
        System.out.println("7,5% de imposto");
    }
    if(salario > 2826.65 && salario <= 3751.05){
        System.out.println("15% de imposto");
    }
    if(salario > 3751.05 && salario <= 4664.68){
        System.out.println("22,5% de imposto");
    }
    if(salario > 4664.68){
        System.out.println("27,5% de imposto");
    }
}catch(Exception e){
    System.out.println("Digite um valor valido");

}
}
    
}
