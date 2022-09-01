package contabancaria;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("Conta: "+ getNumConta());
		System.out.println("Tipo: "+ getTipo());
		System.out.println("Dono: "+ getDono());
		System.out.println("Saldo: "+ getSaldo());
		System.out.println("Status: "+ getStatus());
		System.out.println("---------------------------");
	}
	
	public ContaBanco(){
		setSaldo(0);
		setStatus(false);
	}
	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		if(tipo == "CC") {
			setSaldo(50);
		} else if(tipo == "CP") {
			setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}
	
	public void fecharConta() {
		if (getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		} else if(getSaldo() < 0) {
			System.out.println("Conta em débito");
		} else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
		
	}
	
	public void depositar(double v) {
		if(getStatus()){
			setSaldo(getSaldo() + v);
			System.out.println("Deposito feito com sucesso");
		} else {
			System.out.println("Impossivel depositar em conta fechada");
		}
		
	}
	
	public void sacar(double v) {
		if(getStatus()) {
			if(getSaldo() >= v) {
				setSaldo(getSaldo() - v);
			} else {
				System.out.println("Saldo Insuficiente!");
			}
		} else {
			System.out.println("Imposível sacar!");
		}
	}
	
	public void pagarMensal() {
		double var = 0;
		if(getTipo() == "CC") {
			var = 12;
		} else if(getTipo() == "CP") {
			var = 20;
		}
		if(getStatus()) {
			if(getSaldo() >= var) {
				setSaldo(getSaldo() - var);
			} else {
				System.out.println("Saldo insuficiente!");
			}
		} else {
			System.out.println("Impossível pagar!");
		}
		
	}
	
	
	
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
}
