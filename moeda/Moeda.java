package moeda;


public class Moeda {
	private double valor;
	private TipoMonetario tipoMonetario;
	
	public Moeda() {}
	
	public Moeda(double valor, TipoMonetario tipoMonetario) {
		this.valor = valor;
		this.tipoMonetario = tipoMonetario;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public TipoMonetario getTipoMonetario() {
		return tipoMonetario;
	}
	
	public void setTipoMonetario(TipoMonetario tipoMonetario) {
		this.tipoMonetario = tipoMonetario;
	}
	
	
	
}
