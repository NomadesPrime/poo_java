package Exercicio1;

public class Exercicio10 {
    public static void main(String[] args){
        try {
            String str = "10.5";
            float numero = Float.parseFloat(str);
            int numeroInteiro = (int) numero;
            System.out.println(numeroInteiro);
        } catch (Exception e) {
            System.out.println("Digite um valor valido");
        }
}
}