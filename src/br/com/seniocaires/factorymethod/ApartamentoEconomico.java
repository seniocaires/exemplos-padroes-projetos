package br.com.seniocaires.factorymethod;

public class ApartamentoEconomico extends Apartamento {

	@Override
	public Cozinha criarCozinha() {
		return new CozinhaAmericana();
	}
}