package Exercicio1;

public class Exercicio10 {
    public static void main(String[] args){
        try {
            String str = "123";
            int numero = Integer.parseInt(str);
            System.out.println(numero);
        } catch (Exception e) {
            System.out.println("Digite um valor valido");
        }
}
}