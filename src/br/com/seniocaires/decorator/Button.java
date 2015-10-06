package br.com.seniocaires.decorator;

public class Button extends Componente {

	public Button() {
		this.nome = "Botão";
	}
	
	@Override
	public String getHTML() {
		return "<input type='button' value='Clique aqui'>";
	}
}