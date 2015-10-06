package br.com.seniocaires.buider;

import java.util.HashMap;
import java.util.Map;

public class Forma {

	private String tipo;
	private Map<String, String> partes = new HashMap<String, String>();
	
	public Forma(String tipo) {
		this.tipo = tipo;
	}
	
	public Object getParte(String nomeParte) {
		return this.partes.get(nomeParte);
	}
	
	public void setParte(String nomeParte, String parte) {
		this.partes.put(nomeParte, parte);
	}
	
	@Override
	public String toString() {
		return "Forma: " + this.tipo + " (Lados: " + getParte("LADO") + " Cor: " + getParte("COR") + " Área: " + getParte("AREA") + ")";  
	}
}