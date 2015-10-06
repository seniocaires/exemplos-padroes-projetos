package br.com.seniocaires.facade;

public class Advogado {

	public static final int CRIMINAL = 0;
	public static final int CIVIL = 1;
	
	public Processo getProcesso(int tipo) {
		
		Justica justica;
		
		switch (tipo) {
		case CRIMINAL:
			justica = new JusticaCriminal();
			break;

		case CIVIL:
			justica = new JusticaCivil();
			break;			
			
		default:
			justica = new JusticaCivil();
			break;
		}
		
		return justica.getProcesso();
	}
}