package br.com.seniocaires.factory;

public class Triangulo extends Forma {

	private int base;
	private int altura;
	
	public Triangulo(int base, int altura) {
		
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Triângulo";
	}

	@Override
	public Double calcularArea() {
		return Double.valueOf((this.base * this.altura) / 2);
	}
}