package br.com.seniocaires.observer;

/*
 * OBSERVER
 */
public class Pessoa implements TelefoneListener {

	public void observarTelefone(Telefone telefone) {
		telefone.setListener(this);
	}

	public void telefoneTocou() {
		System.out.println("Eu atendoooooo.");
	}
}