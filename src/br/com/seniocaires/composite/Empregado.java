package br.com.seniocaires.composite;

public class Empregado extends ElementoEmpresaImpl {

	public Empregado(String nome) {
		super(nome);
	}
	
	public void adicionar(ElementoEmpresa elementoEmpresa) {
		System.out.println("N�o pode adicionar.");
	}

	public void remover(ElementoEmpresa elementoEmpresa) {
		System.out.println("N�o pode remover.");
	}

	public void mostrar(String identacao) {
		System.out.println(identacao + this);
	}
}