package DesafioJava;

import java.util.Scanner;

public class AbrindoContas {
	public static void main(String[] args) {
		// Lendo os dados de Entrada:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número da conta:");
		int numeroConta = scanner.nextInt();
		scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
		System.out.println("Digite o nome do Titular:");
		String nomeTitular = scanner.nextLine();
		System.out.println("Digite o saldo:");
		double saldo = scanner.nextDouble();

		// TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
		ContaBancaria cb = new ContaBancaria(numeroConta, nomeTitular, saldo);

		System.out.println("Informacoes:");
		// TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
		
		System.out.println("Conta: "+ cb.numero);
		System.out.println("Titular: " + cb.titular);
		System.out.println("Saldo: R$ " + cb.saldo);
	}
}

class ContaBancaria {
	int numero;
	String titular;
	double saldo;

	public ContaBancaria(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

}