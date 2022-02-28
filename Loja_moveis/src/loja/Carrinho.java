package loja;
import java.util.*;
import loja.Venda;


public class Carrinho {

	private String item;
	private int quantidade;
	private String formaPagamento;
	private double total = 0;
	private Date data;
	private double preco;
	Venda[] produtoVendidos = new Venda[50]; 

	//construtor
	public Carrinho() { }
	
	public Carrinho(String i,  Date d, int q, String f, double p, int t) {
		item = i;
	                    // perguntar para a prof. como herdar o telefone/endereco
		data = d;      // e agraceder por ter cacado o ç cedilha
		formaPagamento = f;
		preco = p;
		quantidade = q;
		total = t;
	}
	
	
	
	
	
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Venda[] getProdutoVendidos() {
		return produtoVendidos;
	}

	public void setProdutoVendidos(Venda[] produtoVendidos) {
		this.produtoVendidos = produtoVendidos;
	}

	public Venda[] getVenda() {
		return this.produtoVendidos;
	}
	
	public void setArrayProdutoVendido(Venda[] v) {
		this.produtoVendidos = v;
	}
	
	public Movel getMovel(int i) {
		return produtoVendidos[i].getMov();
	}
	
	public void setMovel(Venda ven, int i) {
		this.produtoVendidos[i] = ven;
	}
	
	
	
	
	
	public void mostrarHistorico() {
		
		// // //   Ainda não finalizado
		
		/*
		  String p="";
		System.out.print(" ====HISTÓRICO DE VENDA==== ");
		for (int aux=0; aux < produtoVendidos.length; aux++) {
			System.out.print(produtoVendidos[aux]);
		 	p = p + produtoVendidos[aux] + " ";
		} */
	}
	
	
	public String toString() {
		String p="";
		// //   Ainda não finalizado
		/*
		String p="";
		for (int aux=0; aux < produtoVendidos.length; aux++) {
			p = p + "\n"+produtoVendidos[aux].getMov().toString();
		}
		*/
	return p;
}
	
	public void fazerPagamento() {
		
		// //   Ainda não finalizado
		
		//  if( formadepagam = cartão) println pago com cartão) else println pago com pix
		
	}
	
	public void adicionarItem() {
		
		//  //    Ainda não finalizado
	}
	
	public void deletarItem() {
		
		// //   Ainda não finalizado
	}
	
	
	
	
	
}
