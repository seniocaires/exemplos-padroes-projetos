package br.com.seniocaires.bridge;

public class Main {

	public static void main(String[] args) {

		GerenteDeNegocio gerenteProduto = new ProdutoNegocio();
		
		DataAccess indexado = new ProdutoIndexadoImplementacao();
		DataAccess naoIndexado = new ProdutoNaoIndexadoImplementacao();
		
		gerenteProduto.setDataAccess(indexado);
		gerenteProduto.inserir("Leite");
		gerenteProduto.inserir("Ch�");
		gerenteProduto.inserir("Feij�o");
		gerenteProduto.inserir("Caf�");
		gerenteProduto.inserir("Pizza");
		
		gerenteProduto.listar();
		
		gerenteProduto.remover("Pizza");

		gerenteProduto.listar();
		
		gerenteProduto.setDataAccess(naoIndexado);
		gerenteProduto.inserir("Leite");
		gerenteProduto.inserir("Ch�");
		
		gerenteProduto.listar();
	}
}