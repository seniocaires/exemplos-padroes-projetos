package br.com.seniocaires.observer;

/*
 * SOURCE ou SUBJECT
 * 
 * Classe que est� sendo observada.
 */
public class Telefone {

	private TelefoneListener listener;

	public void setListener(TelefoneListener listener) {
		this.listener = listener;
	}
	
	public void tocou() {
		
		// ... c�digo
		
		listener.telefoneTocou();
		
		// ... c�digo
	}
}