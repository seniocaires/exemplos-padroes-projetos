package br.com.seniocaires.strategy;

public abstract class Documento {

	protected ComportamentoDesenho comportamentoDesenho;
	protected String texto;

	public void desenhar() {
		comportamentoDesenho.desenhar();
	}
	
	public String getTexto() {
		return texto;
	}

	public void addTexto(String texto) {
		this.texto += texto;
	}

	public void setComportamentoDesenho(ComportamentoDesenho comportamentoDesenho) {
		this.comportamentoDesenho = comportamentoDesenho;
	}
}