package br.com.seniocaires.buider;

public class QuadradoBuilder extends FormaBuilder {

	public QuadradoBuilder() {
		forma = new Forma("Quadrado");
	}
	
	@Override
	public void construirLados() {
		forma.setParte("LADO", "4");
	}

	@Override
	public void construirCor() {
		forma.setParte("COR", "Verde");
	}

	@Override
	public void construirArea() {
		forma.setParte("AREA", "10");
	}
}