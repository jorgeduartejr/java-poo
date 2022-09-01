package pessoa;

public class main {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[2];
		
		p[0] = new Pessoa("Pedro",22,"M");
		p[1] = new Pessoa("Maria",25,"F");
		
		l[0] = new Livro("Aprendendo Java","Silva Silveiro",500,p[0]);
		l[1] = new Livro("Arte da Sedução","Jorge Duarte",400,p[1]);
		
		

	}

}
