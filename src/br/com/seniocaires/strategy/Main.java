package br.com.seniocaires.strategy;

public class Main {

	public static void main(String[] args) {

		Documento documentoJuridico = new Juridico();
		
		documentoJuridico.setComportamentoDesenho(new PDF());
		documentoJuridico.desenhar();
		
		documentoJuridico.setComportamentoDesenho(new HTML());
		documentoJuridico.desenhar();
	}
}