package ex01;

public class Cachorro {
	private String nome;
	public void late() {
		System.out.println("Au au!");
		System.out.println(nome);
	}
public String getNome() {
	return this.nome;
}
public void setNome(String value) {
	this.nome = value;
}
	public static void main(String[] args) {
		// criando variável do tipo Cachorro;
		Cachorro bingo;
		// Instanciando um novo cachorro e associando a variável
		// bingo que é do tipo cachorro
		
		bingo = new Cachorro();
		bingo.setNome("Bingo");
		bingo.late();
		
		Cachorro Nasus;
		Nasus = new Cachorro();
		Nasus.setNome("Nasus");
		Nasus.late();
		
		
		
		}
	
}
