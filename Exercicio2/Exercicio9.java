package Exercicio2;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua altura (em metros e com virgula)");
        double altura = sc.nextDouble();
        System.out.println("Digite o seu peso (em kilos)");
        double peso = sc.nextDouble();
        double altura2 = altura * altura;
        double imc = peso / altura2;    
        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso ideal");
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau 1");
        } else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau 2");
        } else if(imc >= 40){
            System.out.println("Obesidade grau 3 (mórbida)");
        }
    }
    
}
