package Exercicio5.Atividade3e4;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        int opcao;
        float valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta");
        int numeroDaConta = sc.nextInt();
        System.out.println("Digite sua agencia");
        int agencia = sc.nextInt();
        System.out.println("Digite seu saldo");
        float saldo = sc.nextFloat();
        System.out.println("Digite seu nome");
        String nomeDoTitular = sc.nextLine();
        sc.next();
        ContaCorrente conta = new ContaCorrente(numeroDaConta, agencia, saldo, nomeDoTitular);
    do{
        System.out.println("Escolha a ação:");
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Sair");
        opcao = sc.nextInt();
        switch(opcao){
            case 1:
            System.out.println("Digite o valor a ser depositado");
            valor = sc.nextFloat();
            conta.deposito(valor);
            break;
            case 2:
            System.out.println("Digite o valor a ser sacado");
            valor = sc.nextFloat();
            conta.saque(valor);
            break;
            case 3:
            System.out.println("Seu saldo é "+ conta.saldoTotal());
            break;
            case 4:
            System.out.println("Até mais");
            break;
        }
        
        }while(opcao != 4);
    }
}
