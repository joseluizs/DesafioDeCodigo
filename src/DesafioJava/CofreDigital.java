package DesafioJava;

public class CofreDigital extends CofresSeguros{
	
	private int senha;
	private boolean aberto;

	public CofreDigital(int senha) {
		super("Cofre Digital", "Senha");
		this.senha = senha;
		this.aberto = false;
	}

	public boolean validarSenha(int confirmacaoSenha) {
		return confirmacaoSenha == this.senha;
	}

	public void abrirCofre() {
		this.aberto = true;
	}

	public boolean estaAberto() {
		return this.aberto;
	}
}
