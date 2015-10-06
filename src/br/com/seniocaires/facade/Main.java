package br.com.seniocaires.facade;

public class Main {

	public static void main(String[] args) {
	
		Advogado advogado = new Advogado();
		
		advogado.getProcesso(Advogado.CIVIL);
	}
}