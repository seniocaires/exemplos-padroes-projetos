package br.com.seniocaires.templatemethod;

public class Main {

	public static void main(String[] args) {
		
		Operacao soma = new Soma();
		soma.efetuarOperacao(10, 4);
		
		Operacao subtracao = new Subtracao();
		subtracao.efetuarOperacao(10, 4);
	}
}