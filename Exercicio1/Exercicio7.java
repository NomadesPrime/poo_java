package Exercicio1;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite o valor do faturamento");
            double faturamento = sc.nextDouble();
            System.out.println("Digite a quantidade de imposto");
            double imposto = sc.nextDouble();
            double calculo = imposto/faturamento;
            System.out.println("Digite a quantidade de imposto"+calculo*100+"%");
            
        }catch(Exception e){
            System.out.println("Digite um valor valido");
            sc.next();
        }
    }
}
