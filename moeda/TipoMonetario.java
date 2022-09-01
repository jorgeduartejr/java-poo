package moeda;

public enum TipoMonetario {
	REAL(1), DOLAR(1.82),EURO(2.39);
	
	private double cotacao;
	
	private TipoMonetario(double cotacao) {
		this.cotacao = cotacao;
	}
	public double getCotacao() {
		return this.cotacao;
	}
	
}
