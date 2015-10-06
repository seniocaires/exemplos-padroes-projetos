package br.com.seniocaires.iterator;

import java.util.ArrayList;

public class CestaFrutas {

	private ArrayList<Produto> frutas;
	
	public CestaFrutas() {
		
		frutas = new ArrayList<Produto>();
		
		adicionarProduto("Laranja", "Uma boa laranja", 12.50);
		adicionarProduto("Ma��", "Muito boa", 10);
		adicionarProduto("Lim�o", "Lim�o azedo", 12.20);
	}
	
	public void adicionarProduto(String nome, String descricao, double preco) {
		
		Produto produto = new Produto(nome, descricao, preco);
		
		frutas.add(produto);
	}

	public ArrayList<Produto> getProdutos() {
		return frutas;
	}
	
	public Iterator getProdutosIterator() {
		return new FrutasIterator(frutas);
	}
}