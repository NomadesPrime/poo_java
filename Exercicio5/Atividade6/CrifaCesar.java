package Exercicio5.Atividade6;

import java.util.ArrayList;

public class CrifaCesar {
    String mensagem;
    int valor;
    String[] alfabeto = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" , "k", "l", "m", "n", "o", "p", "q", "r", "s", "t" , "u", "v", "w", "x", "y", "z"};
    int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11 ,12 ,13 ,14 ,15 ,16 ,17 ,18 ,19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 };
    ArrayList<Integer> numerosCriptografados = new ArrayList<Integer>();
    String mensagemCriptografada = "";
      ArrayList<Integer> numerosDescriptografados = new ArrayList<Integer>();

    

    public CrifaCesar(String mensagem, int valor) {
        this.mensagem = mensagem;
        this.valor = valor;
    }

    

    public void criptografar() {
        this.mensagem = this.mensagem.toLowerCase();
        for (int i = 0; i < this.mensagem.length(); i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (this.mensagem.charAt(i) == alfabeto[j].charAt(0)) {
                    this.numerosCriptografados.add(numeros[j] + this.valor);
                }
            }
        }
        for(int i = 0; i < this.numerosCriptografados.size(); i++){
            for(int j = 0; j < this.numeros.length; j++){
                if(this.numerosCriptografados.get(i) == this.numeros[j]){
                    this.mensagemCriptografada += this.alfabeto[j];
                }
            }
        }
        System.out.println(mensagemCriptografada);
        
   
    }


}
