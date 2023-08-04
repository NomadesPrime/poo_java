package Exercicio1;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite a distancia em km:");
            double km = sc.nextDouble();
            System.out.println("Digite o tempo levado para percorrer em horas:");
            double h = sc.nextDouble();
            System.out.println("A velocidade utilizada em media foi de "+ km / h);
        }
        catch(Exception e){
            System.out.println("Digite um numero valido");
            sc.next();
        }
    }
}
