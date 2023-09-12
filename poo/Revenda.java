package poo;

import java.util.Scanner;

public class Revenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro objetCarro = new Carro("ABC-1234");
        objetCarro.placa = "ABC-1234";
        objetCarro.modelo = "Fusca";
        objetCarro.cor = "Azul";
        objetCarro.ano = 1970;
        objetCarro.velocimetro = 0;
        objetCarro.acelerar();
        System.out.println(objetCarro.velocimetro);
            
    }
    
}
