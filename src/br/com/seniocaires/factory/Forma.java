package br.com.seniocaires.factory;

abstract public class Forma {

	public static Forma getForma(int[] atributos) {
		
		// C�rculo
		if(atributos.length == 1) {
			return new Circulo(atributos[0]);
		}
		
		// Tri�ngulo
		if(atributos.length == 2) {
			return new Triangulo(atributos[0], atributos[1]);
		}
		
		return null;
	}
	
	abstract public Double calcularArea();
}