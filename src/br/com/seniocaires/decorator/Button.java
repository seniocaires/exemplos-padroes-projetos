package br.com.seniocaires.decorator;

public class Button extends Componente {

	public Button() {
		this.nome = "Bot�o";
	}
	
	@Override
	public String getHTML() {
		return "<input type='button' value='Clique aqui'>";
	}
}