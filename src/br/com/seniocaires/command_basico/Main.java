package br.com.seniocaires.command_basico;

public class Main {

	public static void main(String[] args) {

		Mapping mapping = new Mapping();
		
		mapping.registrar("/criar", new AcaoCriar());
		mapping.registrar("/remover", new AcaoRemover());
		mapping.registrar("/atualizar", new AcaoAtualizar());
		
		mapping.executar("/criar");
		mapping.executar("/remover");
		mapping.executar("/atualizar");
	}
}