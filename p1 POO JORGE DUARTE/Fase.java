package p120221;

public class Fase {
	private String nome;
	private int dificuldade;
	public static int numPerson; // compartilhado com todas as fases ?
	
	
	
	public Fase(String nome, int dificuldade, int numPerson) {
		this.nome = nome;
		this.dificuldade = dificuldade;
		this.numPerson = numPerson; 
	}

	public int dificuldadeFase(int numPerson) {
		int calculaDificuldade = 0;
		calculaDificuldade = getNumPerson() + 1;
		if (calculaDificuldade >= 5) {
			calculaDificuldade = 5;
		}
		return calculaDificuldade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

	public int getNumPerson() {
		return numPerson;
	}

	public void setNumPerson(int numPerson) {
		Fase.numPerson = numPerson;
	}

	
	
	
}
