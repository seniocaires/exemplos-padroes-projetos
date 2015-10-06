package br.com.seniocaires.singleton;

public class Conexao {

	private static Conexao instancia = null;
	
	private Conexao() {}

	public static Conexao getInstancia() {
		return instancia == null ? instancia = new Conexao() : instancia;
	}
}