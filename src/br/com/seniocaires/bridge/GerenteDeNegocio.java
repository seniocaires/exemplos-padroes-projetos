package br.com.seniocaires.bridge;

public class GerenteDeNegocio {

	protected DataAccess dataAccess;

	public void setDataAccess(DataAccess dataAccess) {
		this.dataAccess = dataAccess;
	}
	
	public void inserir(String nome) {
		dataAccess.inserir(nome);
	}
	
	public void remover(String nome) {
		dataAccess.remover(nome);
	}
	
	public void listar() {
		dataAccess.listar();
	}
}