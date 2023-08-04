package Exercicio1;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor de String");
        String str = sc.next();
        System.out.println("Digite outra String");
        String str1 = sc.next();
        if(str.equals(str1)){
            System.out.println("os valores são iguais");
        }
        else{
            System.out.println("os valores não são iguais");
        }
    }
    
}
