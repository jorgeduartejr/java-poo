package moeda;
import java.util.Scanner;


public class ConversorMonetario {
	
	public TipoMonetario entradaDeDados() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha o novo tipo monetário: ");
		String s = scan.nextLine();
		
		return TipoMonetario.valueOf(s.toUpperCase());
		
	}
	
	public Moeda converter(Moeda moeda, TipoMonetario novoTipoMonetario) {
		Moeda m = new Moeda();
		double acumulador = 0;
		
		acumulador = moeda.getValor()*moeda.getTipoMonetario().getCotacao();
		m.setValor(acumulador/novoTipoMonetario.getCotacao());
		
		
		return m;
	}
}
