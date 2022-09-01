package luta;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String no, String na,int id,double al,double pe, int vi,int de, int em) {
		nome = no;
		nacionalidade = na;
		idade = id;
		altura = al;
		setPeso(pe);
		vitorias = vi;
		derrotas = de;
		empates = em;
	}
	
	public void apresentar() {
		System.out.println("Lutador: "+getNome());
		System.out.println("Origem: "+getNacionalidade());
		System.out.println("Idade: "+getIdade());
		System.out.println("Peso: "+getPeso()+"KG");
		System.out.println("Ganhou: "+getVitorias());
		System.out.println("Perdeu "+getDerrotas());
		System.out.println("Empate: "+getEmpates());
		
	}
	public void status() {
		System.out.println(getNome()+"é um peso "+this.getCategoria());
		System.out.println("Ganhou "+ this.getVitorias()+" vezes");
		System.out.println("Perdeu "+ this.getDerrotas()+" vezes");
		System.out.println("Empatou "+ this.getEmpates() +" vezes");
		
	}
	
	public void ganharLuta() {
		setVitorias(getVitorias()+1);
	}
	
	public void perderLuta() {
		setDerrotas(getDerrotas()+1);
	}
	
	public void empatarLuta() {
		setEmpates(getEmpates()+1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double pe) {
		this.peso = pe;
		setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Levee";
		} else if(this.peso <= 83.9 ) {
			this.categoria = "Médio";
		} else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}
