package br.com.seniocaires.buider;

public class Main {

	public static void main(String[] args) {
		
		Fabrica fabrica = new Fabrica();
		
		FormaBuilder quadradoBuilder = new QuadradoBuilder();
		FormaBuilder circuloBuilder = new CirculoBuilder();
		FormaBuilder trianguloBuilder = new TrianguloBuilder();
		
		fabrica.construir(quadradoBuilder);
		System.out.println(quadradoBuilder.getForma());
		
		fabrica.construir(circuloBuilder);
		System.out.println(circuloBuilder.getForma());
		
		fabrica.construir(trianguloBuilder);
		System.out.println(trianguloBuilder.getForma());
	}
}