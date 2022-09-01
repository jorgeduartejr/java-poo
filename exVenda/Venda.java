package exVenda;

public class Venda {
	private String mes;
	private float valor;
	
	public Venda(String mes,float valor) {
		setValor(valor);
		setMes(mes);
	}
	public String getMes() {
		return this.mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public float getValor() {
		return this.valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
}





