package br.com.seniocaires.iterator;

import java.util.ArrayList;

public class Main {

	public void mostrarProdutos(Iterator iterator) {
		
		while(iterator.existeProximo()) {
			Produto produto = (Produto) iterator.proximo();
			System.out.print(produto.getNome() + ", ");
			System.out.print(produto.getDescricao() + ", ");
			System.out.println(produto.getPreco());
		}
	}
	
	public static void main(String[] args) {

		CestaFrutas cestaFrutas = new CestaFrutas();
		ArrayList<Produto> frutas = cestaFrutas.getProdutos(); 
		
		CestaBebidas cestaBebidas = new CestaBebidas();
		Produto[] bebidas = cestaBebidas.getProdutos();
		
		/*
		 * Lista de frutas
		 */
		for(int indice = 0; indice < frutas.size(); indice++) {
			
			Produto fruta = (Produto) frutas.get(indice);
			System.out.print(fruta.getNome() + ", ");
			System.out.print(fruta.getDescricao() + ", ");
			System.out.println(fruta.getPreco());
		}
		
		/*
		 * Lista de bebidas
		 */
		for(int indice = 0; indice < bebidas.length; indice++) {
			
			Produto bebida = (Produto) bebidas[indice];
			
			if(bebida != null) {
				System.out.print(bebida.getNome() + ", ");
				System.out.print(bebida.getDescricao() + ", ");
				System.out.println(bebida.getPreco());
			}
		}
		
		/*
		 * Com Iterator
		 */
		Main main = new Main();
		
		main.mostrarProdutos(new CestaFrutas().getProdutosIterator());
		main.mostrarProdutos(new CestaBebidas().getProdutosIterator());
	}
}