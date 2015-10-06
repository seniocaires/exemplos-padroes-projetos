package br.com.seniocaires.iterator;

import java.util.ArrayList;

public class FrutasIterator implements Iterator {

	private ArrayList<Produto> produtos;
	private int indice = 0;
	
	public FrutasIterator(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public boolean existeProximo() {
		return indice < produtos.size() && produtos.get(indice) != null;
	}

	public Object proximo() {
		return produtos.get(indice++);
	}
}