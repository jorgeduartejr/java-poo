package ex01;

public class DemonstracaoBicicleta {
	public static void main(String[] args) {
		// criando dois novos objetos bicicleta
		Bicicleta bike1 = new Bicicleta(70);
		Bicicleta bike2 = new Bicicleta(90);
		
		bike1.acelerar(10);
		bike1.mudarMarcha(2);
		bike1.imprimirEstados();
		
		bike1.acelerar(100);
		bike1.mudarMarcha(5);
		bike1.imprimirEstados();
		
		
		bike2.acelerar(50);
		bike2.mudarMarcha(3);
		bike2.imprimirEstados();
		
	}
}
