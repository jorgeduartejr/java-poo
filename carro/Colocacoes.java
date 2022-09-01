package carro;

public enum Colocacoes {
	PRIMEIRO(1), SEGUNDO(2), TERCEIRO(3), RETARDATARIO(4);
	
	private int posicao;

	private Colocacoes(int posicao) {
		this.posicao = posicao;
	}

	public int getPosicao() {
		return posicao;
	}

	
}
