package br.com.seniocaires.decorator;

public class CheckBox extends Componente {

	public CheckBox() {
		this.nome = "Checkbox";
	}
	
	@Override
	public String getHTML() {
		return "<input type='checkbox' name='check'>";
	}
}
