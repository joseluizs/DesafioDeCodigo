package DesafioJava;

import java.util.Scanner;

public class HerancaBancaria {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o titular:");
        String titular = scanner.next();
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();
        System.out.println("Taxa de juros:");
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
        scanner.close();
    }
}


