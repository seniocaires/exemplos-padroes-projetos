package br.com.seniocaires.composite;

public interface ElementoEmpresa {

	abstract public void adicionar(ElementoEmpresa elementoEmpresa);
	
	abstract public void remover(ElementoEmpresa elementoEmpresa);
	
	abstract public void mostrar(String identacao);
}