package br.com.seniocaires.decorator;

public abstract class Componente {

	protected String nome;

	public String getNome() {
		return nome;
	}
	
	public abstract String getHTML();
}