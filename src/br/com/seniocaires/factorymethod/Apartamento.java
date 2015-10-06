package br.com.seniocaires.factorymethod;

// CRIADOR
public class Apartamento {

	public Planta criarApartamento() {
		
		Planta planta = criarPlanta();
		
		Quarto quarto1 = criarQuarto(true, true);
		planta.adicionarElemento(quarto1);
		
		Quarto quarto2 = criarQuarto(true, false);
		planta.adicionarElemento(quarto2);
		
		Cozinha cozinha = criarCozinha();
		planta.adicionarElemento(cozinha);
		
		Sala sala1 = criarSala();
		planta.adicionarElemento(sala1);
		
		Sala sala2 = criarSala();
		planta.adicionarElemento(sala2);
		
		sala1.setVizinho(ElementoDoApartamento.LESTE, quarto2);
		sala1.setVizinho(ElementoDoApartamento.SUL, sala2);
		
		sala2.setVizinho(ElementoDoApartamento.SUL, cozinha);
		
		quarto2.setVizinho(ElementoDoApartamento.LESTE, quarto1);
		
		return planta;
	}
	
	/* ================================
	 *  FACTORY METHODS
	 * ================================
	 */
	
	public Planta criarPlanta() {
		return new Planta();
	}
	
	public Sala criarSala() {
		return new Sala();
	}
	
	public Quarto criarQuarto(boolean suite, boolean closet) {
		return new Quarto(suite, closet);
	}
	
	public Cozinha criarCozinha() {
		return new Cozinha();
	}
}