package br.com.seniocaires.command_avancado;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class ComandoAbrir extends AbstractAction {

	private static final long serialVersionUID = 1L;
	
	private DocumentoXLS documentoXLS;
	
	public ComandoAbrir(DocumentoXLS documentoXLS) {
		super("Abrir...");
		this.documentoXLS = documentoXLS;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		String nomeArquivo = JOptionPane.showInputDialog((Component)arg0.getSource(), "Entre com o nome do arquivo");
		
		if(nomeArquivo != null && nomeArquivo.length() > 0) {
			this.documentoXLS.abrir(nomeArquivo);
		}
	}
}