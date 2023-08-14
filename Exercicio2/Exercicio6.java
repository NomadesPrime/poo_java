package Exercicio2;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int valor = 0;
        for (int i = 1; i < 500; i++)
        if (i % 2 != 0 && i % 7 == 0){
            valor += i;

        }
        System.out.println(valor);
            
        }
    }

