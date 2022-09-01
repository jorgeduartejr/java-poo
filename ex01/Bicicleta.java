package ex01;

public class Bicicleta {
	private int velocidade = 0;
	private int marcha = 1;
	private int velocidadeMaxima = 0;
	
	
	public Bicicleta(int novoValor) {
		this.velocidadeMaxima = novoValor;
	}
	
	
	public void mudarMarcha(int novoValor) {
		marcha = novoValor;
	}
	public void acelerar(int incremento) {
		velocidade = velocidade + incremento;
		if(velocidade + incremento > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
		}
	}
	public void freiar(int decremento) {
		velocidade = velocidade - decremento;
	}
	public void imprimirEstados() {
		System.out.println("velocidade: "+velocidade+"marcha: "+marcha);
		System.out.println("Velocidade Máxima: "+velocidadeMaxima);
	}
	
}