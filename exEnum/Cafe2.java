package exEnum;

public class Cafe2 {
	enum TamanhoCafe{
		GRANDE, GIGANTE, GIGANTESCO
	};
	
	TamanhoCafe tamanho;
}

public class Teste{
	public static void main(String[] args) {
		Cafe2 bebida = new Cafe2();
		// enum dentro da classe
		bebida.tamanho = Cafe2.TamanhoCafe.GRANDE;
	}
}
