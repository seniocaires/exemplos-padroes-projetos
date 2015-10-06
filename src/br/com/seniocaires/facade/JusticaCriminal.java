package br.com.seniocaires.facade;

public class JusticaCriminal implements Justica {

	public Processo getProcesso() {
		return new ProcessoCriminal();
	}
}