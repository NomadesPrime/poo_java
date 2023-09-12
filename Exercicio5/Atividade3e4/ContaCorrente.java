package Exercicio5.Atividade3e4;

public class ContaCorrente {
    int numeroDaConta;
    int agencia;
    float saldo;
    String nomeDoTitular;

    public ContaCorrente(int numeroDaConta, int agencia, float saldo, String nomeDoTitular){
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nomeDoTitular = nomeDoTitular;
    }

    public void deposito(float valor){
        this.saldo += valor;
    }

    public void saque(float valor){
        this.saldo -= valor;
    }

    public float saldoTotal(){
        return this.saldo;
    }
}
