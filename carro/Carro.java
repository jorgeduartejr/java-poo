package carro;


public class Carro {
	
	private int vel = 0;
	private int tempo = 0;
	
	
	public void aumentarVel(int vel) {
		this.vel++;
	}
	
	public void diminuirVel(int vel) {
		this.vel--;
	}
	
	public int percorrer(int tempo,int vel) {
		int distancia = 0;
		distancia = (getTempo() * getVel());
		return distancia;
	}
	
	public int distanciaPercorrida(int distancia) {
		int distanciaTotal = 0;
		distanciaTotal = (getTempo() * distancia);
		return distanciaTotal;
		
	}
	
	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	
	
	
	
}
