package exEnum;

public enum TamanhoCafe{
	GRANDE,GIGANGE, GIGANTESCO
};
public class Cafe {
	TamanhoCafe tamanho;
}
public class Teste{
	public static void main(String[] args) {
		Cafe bebida = new Cafe();
		
		// enum fora da classe
		bebida.tamanho = TamanhoCafe.GRANDE;
	}
}

