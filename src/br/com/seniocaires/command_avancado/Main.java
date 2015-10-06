package br.com.seniocaires.command_avancado;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;

	public Main(JMenuBar barraMenu) {
		
		setTitle("Exemplo Command");
		setSize(500, 250);
		setJMenuBar(barraMenu);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		JMenuBar barraMenu = new JMenuBar();
		
		JMenu menu = new JMenu("Comandos");
		
		DocumentoXLS documentoXLS = new DocumentoXLS();
		
		ComandoAbrir abrir = new ComandoAbrir(documentoXLS);
		
		ComandoSair sair = new ComandoSair();
		
		menu.add(abrir);
		menu.add(sair);
		
		barraMenu.add(menu);
		
		new Main(barraMenu);
	}
}