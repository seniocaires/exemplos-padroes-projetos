package br.com.seniocaires.state;

public abstract class Estado {

	protected OrdemServico ordemServico;
	
	public Estado(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}
	
	public void inserirServico(Servico servico) {
		System.out.println("Erro");
	}
	
	public void removerServico(Servico servico) {
		System.out.println("Erro");
	}
	
	public void cancelarServico() {
		System.out.println("Erro");
	}
	
	public void requisitarPagamento() {
		System.out.println("Erro");
	}
	
	public void imprimirFaturamento() {
		System.out.println("Erro");
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}