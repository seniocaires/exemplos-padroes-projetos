package br.com.seniocaires.factorymethod;

public class Quarto extends ElementoDoApartamento {

	@SuppressWarnings("unused")
	private boolean suite;
	
	@SuppressWarnings("unused")
	private boolean closet;
	
	public Quarto(boolean suite, boolean closet) {
		
		this.suite = suite;
		this.closet = closet;
	}
}