package br.com.seniocaires.singleton;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Conexao conexao = Conexao.getInstancia();
		
		Conexao outraConexao = Conexao.getInstancia();
	}
}