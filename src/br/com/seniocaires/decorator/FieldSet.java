package br.com.seniocaires.decorator;

public class FieldSet extends ContainerDecorator {

	Componente componente;
	
	public FieldSet(Componente componente) {
		this.componente = componente;
	}
	
	@Override
	public String getNome() {
		return componente.getNome() + " FieldSet";
	}

	@Override
	public String getHTML() {

		String temp = "<fieldset>";
		
		temp += "<legend> Título </legend>";
		
		temp += componente.getHTML();
		
		return temp + "</fieldset>";
	}
}