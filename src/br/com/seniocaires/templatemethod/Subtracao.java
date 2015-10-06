package br.com.seniocaires.templatemethod;

public class Subtracao extends Operacao {

	@Override
	public int controlarEfetuarOperacao(int numero1, int numero2) {
		return numero1 - numero2;
	}
}