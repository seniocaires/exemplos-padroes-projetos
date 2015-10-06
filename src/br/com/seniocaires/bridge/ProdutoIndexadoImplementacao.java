package br.com.seniocaires.bridge;

import java.util.ArrayList;
import java.util.List;

public class ProdutoIndexadoImplementacao extends DataAccess {

	private List<String> produtos = new ArrayList<String>();

	@Override
	public void inserir(String nome) {
		produtos.add(nome);
	}

	@Override
	public void remover(String nome) {
		produtos.remove(nome);
	}

	@Override
	public void listar() {
		
		int indice = 0;
		
		for (String produto : produtos) {
			
			System.out.println(indice + " - " + produto);
			indice++;
		}		
	}
}