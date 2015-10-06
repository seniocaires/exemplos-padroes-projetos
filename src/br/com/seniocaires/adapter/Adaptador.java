package br.com.seniocaires.adapter;

public class Adaptador extends BibliotecaMatematica implements Calculadora {

	public double calculoComplexo(double numero) {

		double y = raizQuadrada(numero);
		return soma(y, numero * 2);
	}

}