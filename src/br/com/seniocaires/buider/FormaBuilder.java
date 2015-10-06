package br.com.seniocaires.buider;

public abstract class FormaBuilder {

	protected Forma forma;

	public Forma getForma() {
		return forma;
	}
	
	abstract public void construirLados();
	
	abstract public void construirCor();
	
	abstract public void construirArea();
}