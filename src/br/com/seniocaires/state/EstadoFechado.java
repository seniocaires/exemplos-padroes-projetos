package br.com.seniocaires.state;

public class EstadoFechado extends Estado {

	public EstadoFechado(OrdemServico ordemServico) {
		super(ordemServico);
	}

	@Override
	public void inserirServico(Servico servico) {
		
		this.ordemServico.getServico().add(servico);
		this.ordemServico.setEstado(ordemServico.getAberto());
	}

	@Override
	public void removerServico(Servico servico) {
		
		this.ordemServico.getServico().remove(servico);
		this.ordemServico.setEstado(ordemServico.getAberto());
	}

	@Override
	public void imprimirFaturamento() {
		this.ordemServico.setEstado(ordemServico.getFaturado());
	}
}