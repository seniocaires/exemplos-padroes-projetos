package br.com.seniocaires.command_avancado;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ComandoSair extends AbstractAction {

	private static final long serialVersionUID = 1L;
	
	public ComandoSair() {
		super("Sair...");
	}
	
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}
}