package Exercicio5.Atividade6;


public class CrifaCesar {
    String mensagem;
    int valor;
    String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","w","y","z"};
    int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 ,16,17,18,19,20,21,22,23,24,25,26};
    int[] numerosCriptografados = new int[mensagem.length()];

    public CrifaCesar(String mensagem, int valor){
        this.mensagem = mensagem;
        this.valor = valor;
    }
    
    public void criptografar(){
        for(int i = 0; i < mensagem.length(); i++){
            for(int j = 0; j < alfabeto.length; j++){
                if(mensagem.charAt(i) == alfabeto[j].charAt(0)){
                    numerosCriptografados[i] = numeros[j];
                }
            }
        }
        System.out.println("Mensagem criptografada: ");
        for(int i = 0; i < numerosCriptografados.length; i++){
            System.out.print(numerosCriptografados[i] + " ");
        }
    }





}
