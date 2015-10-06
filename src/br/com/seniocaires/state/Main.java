package br.com.seniocaires.state;

public class Main {

	public static void main(String[] args) {

		OrdemServico ordemServico = new OrdemServico();
		
		System.out.println(ordemServico);
		
		Servico servico1 = new Servico("Instalar Linux", 0.00);
		Servico servico2 = new Servico("Formatar computador", 49.00);
		
		ordemServico.inserirServico(servico1);
		ordemServico.inserirServico(servico2);
		
		System.out.println(ordemServico);
		
		ordemServico.imprimirFaturamento();
		
		System.out.println(ordemServico);
		
		ordemServico.removerServico(servico2);
		
		System.out.println(ordemServico);
		
		ordemServico.requisitarPagamento();
		
		System.out.println(ordemServico);
		
		ordemServico.imprimirFaturamento();
		
		System.out.println(ordemServico);
	}
}