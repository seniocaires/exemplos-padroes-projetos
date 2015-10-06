package br.com.seniocaires.decorator;

public class Div extends ContainerDecorator {

	Componente componente;
	
	public Div(Componente componente) {
		this.componente = componente;
	}
	
	@Override
	public String getNome() {
		return componente.getNome() + " Div";
	}

	@Override
	public String getHTML() {

		String temp = "<div>";
		
		temp += componente.getHTML();
		
		return temp + "</div>";
	}
}