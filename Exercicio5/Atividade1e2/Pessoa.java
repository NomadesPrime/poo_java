package Exercicio5.Atividade1e2;

public class Pessoa {
    String nome;
    float peso;
    float altura;
    String dataNascimento;

    public Pessoa(String nome, float peso, float altura, String dataNascimento) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }

    public float IMC() {
        float imc = this.peso / (this.altura * this.altura);
        return imc;
    }

}
