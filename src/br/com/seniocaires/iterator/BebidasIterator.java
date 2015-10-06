package br.com.seniocaires.iterator;

public class BebidasIterator implements Iterator {

	private Produto[] produtos;
	private int indice = 0;
	
	public BebidasIterator(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	public boolean existeProximo() {
		return indice < produtos.length && produtos[indice] != null;
	}

	public Object proximo() {
		return produtos[indice++];
	}
}