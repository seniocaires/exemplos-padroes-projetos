package br.com.seniocaires.composite;

public abstract class ElementoEmpresaImpl implements ElementoEmpresa {

	private String nome;
	
	public ElementoEmpresaImpl(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}