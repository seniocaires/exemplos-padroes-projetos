package br.com.seniocaires.buider;

public class CirculoBuilder extends FormaBuilder {

	public CirculoBuilder() {
		forma = new Forma("Círculo");
	}
	
	@Override
	public void construirLados() {
		forma.setParte("LADO", "0");
	}

	@Override
	public void construirCor() {
		forma.setParte("COR", "Vermelho");
	}

	@Override
	public void construirArea() {
		forma.setParte("AREA", "23,1");
	}
}