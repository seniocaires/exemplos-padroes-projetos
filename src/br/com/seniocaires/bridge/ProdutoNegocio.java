package br.com.seniocaires.bridge;

public class ProdutoNegocio extends GerenteDeNegocio {

	public void listar() {
		
		System.out.println();
		System.out.println("Produtos: ");
		super.listar();
	}
}