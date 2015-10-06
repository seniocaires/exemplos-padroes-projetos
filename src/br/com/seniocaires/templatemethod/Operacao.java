package br.com.seniocaires.templatemethod;

public abstract class Operacao {

	abstract public int controlarEfetuarOperacao(int numero1, int numero2);
	
	public void efetuarOperacao(int numero1, int numero2) {
		
		int resultado = controlarEfetuarOperacao(numero1, numero2);
		
		System.out.println("O resultado é: " + resultado);
	}
}