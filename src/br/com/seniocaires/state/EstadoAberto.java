package br.com.seniocaires.state;

public class EstadoAberto extends Estado {

	public EstadoAberto(OrdemServico ordemServico) {
		super(ordemServico);
	}

	@Override
	public void inserirServico(Servico servico) {
		this.ordemServico.getServico().add(servico);
	}

	@Override
	public void removerServico(Servico servico) {
		this.ordemServico.getServico().remove(servico);
	}

	@Override
	public void cancelarServico() {
		this.ordemServico.setEstado(ordemServico.getCancelado());
	}

	@Override
	public void requisitarPagamento() {
		this.ordemServico.setEstado(ordemServico.getFechado());
	}
}