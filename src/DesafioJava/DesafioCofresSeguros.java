package DesafioJava;

import java.util.Scanner;

public class DesafioCofresSeguros {

	public static void main(String[] args) {
		// Lê o tipo de cofre (primeira linha da entrada)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tipo de cofre!");
		String tipoCofre = scanner.nextLine();

		// Verifica o tipo de cofre e realiza ações apropriadas
		if (tipoCofre.equalsIgnoreCase("digital")) {
			System.out.println("Digite a senha");
			int senha = scanner.nextInt();
			System.out.println("Confirme a senha");
			int confirmacaoSenha = scanner.nextInt();

			CofreDigital cofreDigital = new CofreDigital(senha);

			if (cofreDigital.validarSenha(confirmacaoSenha)) {
				cofreDigital.abrirCofre();
				System.out.println("Tipo: Cofre Digital");
				System.out.println("Metodo de abertura: Senha");
				System.out.println("Cofre aberto!");
			} else {
				System.out.println("Tipo: Cofre Digital");
				System.out.println("Metodo de abertura: Senha");
				System.out.println("Senha incorreta!");
			}
		} else if(tipoCofre.equalsIgnoreCase("fisico")) {
			System.out.println("Tipo: Cofre Fisico");
			System.out.println("Metodo de abertura: Chave");
		}
		scanner.close();
	}
}
