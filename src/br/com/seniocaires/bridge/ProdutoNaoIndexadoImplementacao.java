package br.com.seniocaires.bridge;

import java.util.ArrayList;
import java.util.List;

public class ProdutoNaoIndexadoImplementacao extends DataAccess {

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
		
		for (String produto : produtos) {
			System.out.println(produto);
		}		
	}
}