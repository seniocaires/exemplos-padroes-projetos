package br.com.seniocaires.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeElementoEmpresa extends ElementoEmpresaImpl {

	private List<ElementoEmpresa> elementos = new ArrayList<ElementoEmpresa>();
	
	public CompositeElementoEmpresa(String nome) {
		super(nome);
	}
	
	public void adicionar(ElementoEmpresa elementoEmpresa) {
		elementos.add(elementoEmpresa);
	}

	public void remover(ElementoEmpresa elementoEmpresa) {
		elementoEmpresa.remover(elementoEmpresa);
	}

	public void mostrar(String identacao) {
		
		System.out.println(identacao + this);
		
		identacao += "-";
		
		for (ElementoEmpresa elemento : elementos)
			elemento.mostrar(identacao);
	}
}