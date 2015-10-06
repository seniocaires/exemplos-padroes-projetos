package br.com.seniocaires.composite;

public class Main {

	public static void main(String[] args) {

		CompositeElementoEmpresa empresa = new CompositeElementoEmpresa("Empresa X");
		
		CompositeElementoEmpresa departamentoA = new CompositeElementoEmpresa("Departamento A");
		CompositeElementoEmpresa departamentoB = new CompositeElementoEmpresa("Departamento B");
		
		departamentoA.adicionar(new Empregado("Aline"));
		departamentoA.adicionar(new Empregado("Marcos"));
		
		departamentoB.adicionar(new Empregado("Fábio"));
		departamentoB.adicionar(new Empregado("Isabela"));
		
		empresa.adicionar(departamentoA);
		empresa.adicionar(departamentoB);
		
		empresa.mostrar("-");
	}
}