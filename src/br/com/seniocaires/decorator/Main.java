package br.com.seniocaires.decorator;

public class Main {

	public static void main(String[] args) {
		
		Componente checkbox = new CheckBox();
		
		ContainerDecorator container = new FieldSet(new Div(checkbox));
		
		System.out.println(container.getHTML());
	}
}