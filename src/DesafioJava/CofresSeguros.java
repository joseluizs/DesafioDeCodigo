package DesafioJava;

abstract class CofresSeguros {
	protected String tipo;
	protected String metodoAbertura;

	public CofresSeguros(String tipo, String metodoAbertura) {
		this.tipo = tipo;
		this.metodoAbertura = metodoAbertura;
	}

	public void imprimirInformacoes() {
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Metodo de abertura: " + this.metodoAbertura);
	}
}


