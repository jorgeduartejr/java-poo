package p120221;

public enum Sexo {
	MASCULINO, FEMININO;
	private String tipoSexo;
	
	
	/*
	public void setarSexo() {
			if (tipoSexo == MASCULINO) {
				setQuantForca(getQuantForca() = 10);
				setInteligencia(getInteligencia() = 5);
			} else if (tipoSexo == MASCULINO) {
				setQuantForca(getQuantForca() = 5);
				setInteligencia(getInteligencia() = 10);
		}
	} 
	*/ // TENTEI FAZER E NAO DEU TEMPO
	
	
	public String getTipoSexo() {
		return tipoSexo;
	}

	public void setTipoSexo(String tipoSexo) {
		this.tipoSexo = tipoSexo;
	}

	
}

