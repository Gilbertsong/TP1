package loja;

public class Endereco {
	
	protected int numeroImovel;
	protected String estado;
	protected String cidade;
	protected String bairro;
	protected String rua;
	
	public Endereco(String e, String c, String b, String r, int num) {
		estado = e;  
		cidade = c;
		bairro = b;
		rua = r;
		numeroImovel = num;
	}

	public int getNumeroImovel() {
		return numeroImovel;
	}

	public void setNumeroImovel(int numeroImovel) {
		this.numeroImovel = numeroImovel;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
}
