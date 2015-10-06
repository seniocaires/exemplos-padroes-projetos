package br.com.seniocaires.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Planta {

	public List<Elemento> elementos = new ArrayList<Elemento>();
	
	public void adicionarElemento(Elemento elemento) {
		elementos.add(elemento);
	}
}