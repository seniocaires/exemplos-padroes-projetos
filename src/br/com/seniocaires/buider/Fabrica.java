package br.com.seniocaires.buider;

public class Fabrica {

	public void construir(FormaBuilder formaBuilder) {
		
		formaBuilder.construirArea();
		formaBuilder.construirCor();
		formaBuilder.construirLados();
	}
}