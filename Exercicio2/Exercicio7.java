package Exercicio2;
import java.util.Scanner;

public class Exercicio7 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas do aluno");
        boolean continuar = true;
        int[] notas = new int[100];
        for (int i = 0; true; i++){
            notas[i] = scanner.nextInt();
            if (notas[i] < 0){
                continuar = false;
            }
            if (continuar == false){
                // remover os zeros do array
                int[] notas2 = new int[i];
                for (int j = 0; j < notas2.length; j++){
                    if(notas[j] != 0 && notas[j] > 0){
                        notas2[j] = notas[j];
                    }
                }
                int soma = 0;
                int media = 0;
                for (int j = 0; j < notas2.length; j++){
                        soma += notas[j];
                    
                }
                System.out.println("A soma das notas é: " + soma);
                media = soma / notas2.length;
                System.out.println("A média do aluno é: " + media);
                break;
            }
        }
    }
}
