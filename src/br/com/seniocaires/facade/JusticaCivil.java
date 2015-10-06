package br.com.seniocaires.facade;

public class JusticaCivil implements Justica {

	public Processo getProcesso() {
		return new ProcessoCivil();
	}
}