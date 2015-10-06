package br.com.seniocaires.factory;

public class Circulo extends Forma {

	private int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	@Override
	public String toString() {
		return "Círculo";
	}

	@Override
	public Double calcularArea() {
		// PI * raio ^ 2
		return Math.PI * Math.pow(this.raio, 2);
	}
}