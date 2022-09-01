package moeda;

public class Main {

	public static void main(String[] args) {
		Moeda m = new Moeda();
		ConversorMonetario cm = new ConversorMonetario();
		
		m.setValor(100000000);
		m.setTipoMonetario(TipoMonetario.EURO);
		
		TipoMonetario tm = cm.entradaDeDados();
		
		Moeda nm = cm.converter(m, tm);
		
		System.out.println(nm.getValor());
		

	}

}
