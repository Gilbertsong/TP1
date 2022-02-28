package loja;

public abstract class Pessoa {
	
	protected String nome;
	protected int RG;
	protected int CPF;
	protected Endereco endereco;
	protected Telefone numTel;
	
	
	public Pessoa() { };
/*	public Pessoa(String nome, int CPF, Telefone numTel) {
		super();
		setNome(nome);
		setCPF(CPF);
		setNumTel(numTel);
	}
	*/
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRG() {
		return RG;
	}
	public void setRG(int rG) {
		RG = rG;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getNumTel() {
		return numTel;
	}
	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}
	

}
