package br.com.seniocaires.command_basico;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	private Map<String, Comando> comandos = new HashMap<String, Comando>();
	
	public void registrar(String nome, Comando comando) {
		comandos.put(nome, comando);
	}
	
	public void executar(String nome) {
		
		Comando comando = (Comando) comandos.get(nome);
		
		if(comando != null)
			comando.executar();
	}
}