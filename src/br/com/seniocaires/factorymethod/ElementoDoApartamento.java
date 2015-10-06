package br.com.seniocaires.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class ElementoDoApartamento extends Elemento {

	public static final int NORTE = 1;
	public static final int LESTE = 2;
	public static final int SUL = 3;
	public static final int OESTE = 4;
	
	private Map<Integer, ElementoDoApartamento> vizinhos = new HashMap<Integer, ElementoDoApartamento>();
	
	public void setVizinho(Integer posicao, ElementoDoApartamento elementoDoApartamento) {
		this.vizinhos.put(posicao, elementoDoApartamento);
	}

	public Map<Integer, ElementoDoApartamento> getVizinhos() {
		return vizinhos;
	}
}