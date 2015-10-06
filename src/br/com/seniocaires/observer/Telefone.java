package br.com.seniocaires.observer;

/*
 * SOURCE ou SUBJECT
 * 
 * Classe que está sendo observada.
 */
public class Telefone {

	private TelefoneListener listener;

	public void setListener(TelefoneListener listener) {
		this.listener = listener;
	}
	
	public void tocou() {
		
		// ... código
		
		listener.telefoneTocou();
		
		// ... código
	}
}