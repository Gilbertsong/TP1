package HelloWorldApp;

public class Produto {
	
	// Atributos
	public String nome;
	public String descricao;
	public double valorDeCompra;
	public double lucro;
	public double quantidade;
	
	
	
	
	// construtor 
	public Produto() { } 
	public Produto (String nome, String descricao, 
			double valorDeCompra, double lucro, double quantidade) {
		this.nome = nome;
		this.descricao = descricao;
		this.valorDeCompra = valorDeCompra;
		this.lucro = lucro;
		this.quantidade = quantidade;
	}
	
	
	// get and set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorDeCompra() {
		return valorDeCompra;
	}
	public void setValorDeCompra(double valorDeCompra) {
		this.valorDeCompra = valorDeCompra;
	}
	public double getLucro() {
		return lucro;
	}
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	
	//  MÉTODO LISTAR PRODUTOS
	public String listaProduto() {
		return "Nome: " + nome + " \n\nDescrição: " + descricao + 
				String.format("\n\nValor de Compra: %.1f \n", valorDeCompra) + 
	  String.format("\nLucro: %.1f \n", lucro) + 
	 String.format("\nQUANTIDADE: %.1f \n", quantidade);
	}
	
	
	
	

}
