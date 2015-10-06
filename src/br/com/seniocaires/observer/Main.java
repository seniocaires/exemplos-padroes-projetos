package br.com.seniocaires.observer;

public class Main {

	public static void main(String[] args) {

		Telefone telefone = new Telefone();
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.observarTelefone(telefone);
		
		telefone.tocou();
	}
}