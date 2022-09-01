package exVenda;
import java.util.ArrayList;


public class Vendedor {
	private String nomeVendedor;
	ArrayList<Venda> listaVendas = new ArrayList<Venda>();
	
	public Vendedor(String vendedor) {
		setNomeVendedor(vendedor);
	}
	
	public ArrayList<Venda> getListaVendas() {
		return listaVendas;
	}
	public void setListaVendas(Venda listaVendas) {
		this.listaVendas.add(listaVendas);
	}
	public String getNomeVendedor() {
		return this.nomeVendedor;
	}
	public void setNomeVendedor(String nomeVendedor){
		this.nomeVendedor = nomeVendedor;
	}
	
	
	
}
