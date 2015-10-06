package br.com.seniocaires.bridge;

public abstract class DataAccess {

	abstract public void inserir(String nome);
	
	abstract public void remover(String nome);
	
	abstract public void listar();
}