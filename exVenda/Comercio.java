package exVenda;
import java.util.ArrayList;

public class Comercio {
	private ArrayList<Empresa> empresas = new ArrayList<Empresa>();
	
	
	
	public ArrayList<Empresa> getEmpresas(){
		return empresas;
	}
	
	public void inserirEmpresa(String nomeEmpresa) {
		Empresa empresa = new Empresa(nomeEmpresa);
		this.empresas.add(empresa);
	}
	
	public void inserirVendedor(String nomeVendedor, String nomeEmpresa) {
		for(Empresa empresa: empresas) {
			if(empresa.getRazaoSocial() == nomeEmpresa) {
				Vendedor vendedor = new Vendedor(nomeVendedor);
				empresa.setVendedores(vendedor);
			}
		}
	}
	public void inserirVenda(String nomeVendedor, float valor, String mes) {
		for(Empresa empresa: empresas) {
			for(Vendedor vendedor: empresa.getVendedores()) {
				if(vendedor.getNomeVendedor() == nomeVendedor) {
					Venda objeto = new Venda(mes, valor);
					vendedor.setListaVendas(objeto);
				}
			}
		}
	}
	
	
	
	public void setEmpresas(Empresa Empresas) {
		this.empresas.add(Empresas);
	}
	
	public double comissao(Vendedor vendedor) {
		double somaTotal = 0;
		double valorFinal = 0;
		for(Venda venda: vendedor.getListaVendas()) {
			somaTotal =  somaTotal + venda.getValor();
			double valorReceber = venda.getValor()*(0.05);
			
			if(somaTotal >= 2000) {
				valorReceber = venda.getValor()*(0.1);
			}
			valorFinal = valorReceber + valorFinal;
		}
		return valorFinal;
		
		
	}
	
	public void status() {
		for(Empresa empresa: empresas) {
		for(Vendedor vendedor: empresa.getVendedores())
		System.out.println(vendedor.getNomeVendedor()+" "+empresa.getRazaoSocial()+" "+ comissao(vendedor));
		
		}
	}
	
	
}

