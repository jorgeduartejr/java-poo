package p120221;

import java.util.ArrayList;

public class Jogo {
	
	public enum estadoJogo {
		ATIVO, PAUSADO, GAMEOVER;
	}
	
	ArrayList<Fase> listaFases = new ArrayList<Fase>();  // lista de fases
	
	ArrayList<Personagem> listaPersonagem = new ArrayList<Personagem>(); // lista de personagens
	
	//private String estadoJogo; // criar enum 
	
	public ArrayList<Fase> getListaFases() {
		return listaFases;
	}

	public void setListaFases(ArrayList<Fase> listaFases) {
		this.listaFases = listaFases;
	}

	public ArrayList<Personagem> getListaPersonagem() {
		return listaPersonagem;
	}

	public void setListaPersonagem(ArrayList<Personagem> listaPersonagem) {
		this.listaPersonagem = listaPersonagem;
	}

	
	
	
}
