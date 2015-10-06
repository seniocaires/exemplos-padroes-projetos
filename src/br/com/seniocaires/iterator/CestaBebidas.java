package br.com.seniocaires.iterator;


public class CestaBebidas {

	static final int QUANTIDADE_MAXIMA = 4;
	private int indice = 0;
	private Produto[] bebidas;
	
	public CestaBebidas() {
		
		bebidas = new Produto[QUANTIDADE_MAXIMA];
		
		adicionarProduto("Vinho", "Tinto", 23.50);
		adicionarProduto("Cerveja", "Gelada", 1.90);
	}
	
	public void adicionarProduto(String nome, String descricao, double preco) {
		
		Produto produto = new Produto(nome, descricao, preco);
		
		if(indice < QUANTIDADE_MAXIMA) {
			bebidas[indice] = produto;
			indice++;
		}
	}

	public Produto[] getProdutos() {
		return bebidas;
	}
	
	public Iterator getProdutosIterator() {
		return new BebidasIterator(bebidas);
	}
}