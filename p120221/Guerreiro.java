package p120221;

public class Guerreiro extends Personagem{ // verificar se a herança está certa
	
	public Guerreiro(int pontuacao, int quantForca, int inteligencia, int nivelVida, String sexo) {
		super(pontuacao, quantForca, inteligencia, nivelVida, sexo);
		
	}

	private int estamina; 
	
	public int ataquePoderoso(int estamina) { // receber 2 parametros ??
		boolean podeAtacar = false;
		int danoPoderoso = 0;
		if (estamina > 0) {  // trocar valor estamina
			podeAtacar = true;
			danoPoderoso = getEstamina() * getQuantForca(); // chamar o objeto do personagem // 
		}
		return danoPoderoso;
	}
	
	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}
}
