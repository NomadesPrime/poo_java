package poo;
public class Carro {
    String placa;
    String modelo;
    String cor;
    int ano;
    int velocimetro;

   public Carro(String placa) {
        this.placa = placa;
    }


    public void acelerar() {
      this.velocimetro++;
    }
    
}
