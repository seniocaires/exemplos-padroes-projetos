package br.com.seniocaires.state;

import java.util.ArrayList;
import java.util.List;

public class OrdemServico {

	private static Integer GERADOR_ID = 1;
	
	private Estado aberto;
	private Estado fechado;
	private Estado cancelado;
	private Estado faturado;
	
	private Integer id;
	
	private Estado estado;
	
	private List<Servico> servico;
	
	/*
	 * Evento 01
	 */
	public OrdemServico() {
	
		this.id = GERADOR_ID++;
		
		aberto = new EstadoAberto(this);
		fechado = new EstadoFechado(this);
		cancelado = new EstadoCancelado(this);
		faturado = new EstadoFaturado(this);
		
		this.estado = aberto;
		
		servico = new ArrayList<Servico>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Servico> getServico() {
		return servico;
	}

	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}
	
	/*
	 * Evento 02
	 */
	public void inserirServico(Servico servico) {
		estado.inserirServico(servico);
	}
	
	/*
	 * Evento 03
	 */
	public void removerServico(Servico servico) {
		estado.removerServico(servico);
	}
	
	/*
	 * Evento 04
	 */
	public void cancelarServico() {
		estado.cancelarServico();
	}
	
	/*
	 * Evento 05
	 */
	public void requisitarPagamento() {
		estado.requisitarPagamento();
	}
	
	/*
	 * Evento 06
	 */
	public void imprimirFaturamento() {
		estado.imprimirFaturamento();
	}
	
	@Override
	public String toString() {
		return "********* OS id: " + id + " *************\n " +
				"Estado:" + estado + "\n" +
				"Serviços" + servico + "\n\n\n";
	}

	public Estado getAberto() {
		return aberto;
	}

	public Estado getFaturado() {
		return faturado;
	}

	public Estado getCancelado() {
		return cancelado;
	}

	public Estado getFechado() {
		return fechado;
	}
}