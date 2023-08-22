package Exercicio2;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
       // jogo da forca
         Scanner scanner = new Scanner(System.in);
            String palavra1 = "_ _ _ _";
            int tentativas = 7;
            boolean acertou = false;
            String[] palavra = {"c", "a", "s", "a"};
            int[] acertos = new int[4];
            System.out.println("Jogo da forca");
            System.out.println("Você tem 7 tentativas");
            System.out.println("A palavra é: " + palavra1);
          do{
            try{
                acertou = false;
                System.out.println("Digite uma letra");
                String letraDigitada = scanner.next();
                for (int i = 0; i < palavra.length; i++){
                    if (letraDigitada.equals(palavra[i])){
                        acertos[i] = 1;
                        acertou = true;
                        System.out.println("Você acertou");
                        System.out.println("Você tem " + tentativas + " tentativas");
                        
                    }
                }
                if (acertou == false){
                    tentativas--;
                    Erro(tentativas);
                }
            
            }
            catch (Exception e){
                System.out.println("Digite uma letra");
                scanner.next();
            }
          }while(tentativas > 0 && acertos[0] != 1 && acertos[1] != 1 && acertos[2] != 1 && acertos[3] != 1);
            if (acertos[0] == 1 && acertos[1] == 1 && acertos[2] == 1 && acertos[3] == 1){
                System.out.println("Você ganhou");
                System.out.println("A palavra é: casa");
            }
            else{
                System.out.println("Você perdeu");
                System.out.println("A palavra é: casa");
            }
    }

    public static void Erro(int tentativas){
        if (tentativas == 0){
            System.out.println("Você foi enforcado");
        }
        if (tentativas == 1){
            System.out.println("Você tem 1 tentativa");
            System.out.println("Você perdeu o braço esquerdo");
        }
        if (tentativas == 2){
            System.out.println("Você tem 2 tentativas");
            System.out.println("Você perdeu o braço direito");
        }
        if (tentativas == 3){
            System.out.println("Você tem 3 tentativas");
            System.out.println("Você perdeu a perna esquerda");
        }
        if (tentativas == 4){
            System.out.println("Você tem 4 tentativas");
            System.out.println("Você perdeu a perna direita");
        }
        if (tentativas == 5){
            System.out.println("Você tem 5 tentativas");
            System.out.println("Você perdeu a cabeça");
        }
        if (tentativas == 6){
            System.out.println("Você tem 6 tentativas");
            System.out.println("Você perdeu o corpo");
        }
    }

    
}