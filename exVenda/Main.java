package exVenda;

public class Main {

	public static void main(String[] args) {
			Comercio caminhao = new Comercio();
			caminhao.inserirEmpresa("Volvo");
			caminhao.inserirEmpresa("Scania");
			caminhao.inserirEmpresa("Mercedez");
			
			
			caminhao.inserirVendedor("João Lacerda","Volvo");
			caminhao.inserirVendedor("Miguel", "Scania");
			caminhao.inserirVendedor("Pedro", "Mercedez");
			
			caminhao.inserirVenda("Pedro", 700,"Janeiro");
			caminhao.inserirVenda("Pedro", 3000, "Fevereiro");
			
			caminhao.status();
			
		

	}

}
