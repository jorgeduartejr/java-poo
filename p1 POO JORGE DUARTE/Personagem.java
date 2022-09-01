package p120221;

import java.util.ArrayList;

public abstract class Personagem {
	
	private final String nomePersonagem = "";
	private int pontuacao;
	private int quantForca;
	private int inteligencia;
	private int nivelVida = 100;
	private Sexo sexo;
	
	
	
	
	ArrayList<Item> listaItems = new ArrayList<Item>();
	
	public Personagem(int pontuacao, int quantForca, int inteligencia, int nivelVida, String sexo) {
		super();
		this.pontuacao = pontuacao;
		this.quantForca = quantForca;
		this.inteligencia = inteligencia;
		this.nivelVida = nivelVida;
		
	}
	
	public Sexo sexo() {
		
		return sexo;
	}
	
	/*
	public void escolherSexo() {
		if (sexo == equal("Masculino")) {
			setQuantForca(getQuantForca() = 10);
			setInteligencia(getInteligencia() = 5);
		} else if (sexo == "Feminino") {
			setQuantForca(getQuantForca() = 5);
			setInteligencia(getInteligencia() = 10);
		}
	}*/
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public int getQuantForca() {
		return quantForca;
	}
	public void setQuantForca(int quantForca) {
		this.quantForca = quantForca;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getNivelVida() {
		return nivelVida;
	}
	public void setNivelVida(int nivelVida) {
		this.nivelVida = nivelVida;
	}
	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	
	
}
