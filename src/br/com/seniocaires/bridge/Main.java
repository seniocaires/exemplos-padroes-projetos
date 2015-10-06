package br.com.seniocaires.bridge;

public class Main {

	public static void main(String[] args) {

		GerenteDeNegocio gerenteProduto = new ProdutoNegocio();
		
		DataAccess indexado = new ProdutoIndexadoImplementacao();
		DataAccess naoIndexado = new ProdutoNaoIndexadoImplementacao();
		
		gerenteProduto.setDataAccess(indexado);
		gerenteProduto.inserir("Leite");
		gerenteProduto.inserir("Chá");
		gerenteProduto.inserir("Feijão");
		gerenteProduto.inserir("Café");
		gerenteProduto.inserir("Pizza");
		
		gerenteProduto.listar();
		
		gerenteProduto.remover("Pizza");

		gerenteProduto.listar();
		
		gerenteProduto.setDataAccess(naoIndexado);
		gerenteProduto.inserir("Leite");
		gerenteProduto.inserir("Chá");
		
		gerenteProduto.listar();
	}
}