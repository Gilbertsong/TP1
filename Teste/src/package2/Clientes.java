package package2;



 
public class Clientes {
	
	private String nome;
	private String endere�o;
	private int telefone;
	
	public Clientes ( ) {     //  Contrutor default
		
	}
	public Clientes (String nome, String endere�o, int telefone)  {    // Construtor com par�metros
		this.setNome(nome);
		this.setEndere�o(endere�o);
		this.setTelefone(telefone);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
		}
	
}
