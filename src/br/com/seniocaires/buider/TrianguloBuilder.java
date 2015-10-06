package br.com.seniocaires.buider;

public class TrianguloBuilder extends FormaBuilder {

	public TrianguloBuilder() {
		forma = new Forma("Triângulo");
	}
	
	@Override
	public void construirLados() {
		forma.setParte("LADO", "3");
	}

	@Override
	public void construirCor() {
		forma.setParte("COR", "Azul");
	}

	@Override
	public void construirArea() {
		forma.setParte("AREA", "8");
	}
}