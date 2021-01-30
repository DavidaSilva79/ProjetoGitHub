package br.com.socin.projetosocin.model;

import java.util.ArrayList;
import java.util.List;

public class ListaGit {
	
	private List<git> lista;

	public List<git> getLista() {
		return lista;
	}

	public void setLista(List<git> lista) {
		this.lista = lista;
	}

	public ListaGit() {
		super();
		lista = new ArrayList<>();
	}
	
	

}
