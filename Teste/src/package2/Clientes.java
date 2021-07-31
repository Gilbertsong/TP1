package package2;



 
public class Clientes {
	
	private String nome;
	private String endereço;
	private int telefone;
	
	public Clientes ( ) {     //  Contrutor default
		
	}
	public Clientes (String nome, String endereço, int telefone)  {    // Construtor com parâmetros
		this.setNome(nome);
		this.setEndereço(endereço);
		this.setTelefone(telefone);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
		}
	
}
