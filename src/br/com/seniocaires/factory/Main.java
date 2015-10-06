package br.com.seniocaires.factory;

public class Main {

	public static void main(String[] args) {

		Forma forma = Forma.getForma(new int[] {6});
		System.out.println(forma);
		System.out.println("Área: " + forma.calcularArea());
		
		Forma outraForma = Forma.getForma(new int[] {2, 5});
		System.out.println(outraForma);
		System.out.println("Área: " + outraForma.calcularArea());
	}
}