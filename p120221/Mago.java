package p120221;

public class Mago extends Personagem { // verificar se a herança esta certa
	
	
	public Mago(int pontuacao, int quantForca, int inteligencia, int nivelVida, String sexo) {
		super(pontuacao, quantForca, inteligencia, nivelVida, sexo);
		
	}

	private int mana;
	
	public int lancarMagia(int mana) { // receber 2 parametros ??
		boolean podeAtacar = false;
		int danoPoderoso = 0;
		if(mana > 0) {
			podeAtacar = true;
			danoPoderoso = getMana() * getInteligencia(); // chamar o objeto
		}
		return danoPoderoso;
	}
	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
}
