package br.com.seniocaires.adapter;

public class Main {

	public static void main(String[] args) {
	
		Calculadora calculadora = new Adaptador();
		
		System.out.println(calculadora.calculoComplexo(10));
	}
}