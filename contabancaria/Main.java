package contabancaria;

public class Main {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		ContaBanco p2 = new ContaBanco();
		
		p1.setNumConta(11111);
		p1.abrirConta("CC");
		p1.setDono("Jubileu");
		p1.depositar(200);
		p1.pagarMensal();
		p1.estadoAtual();
		
		p2.setNumConta(222222);
		p2.abrirConta("CP");
		p2.setDono("Creusa");
		p2.sacar(100);
		p2.pagarMensal();
		p2.sacar(200);
		p2.fecharConta();
		p2.estadoAtual();
		
		
		
		

	}

}
