package loja;
import loja.Cliente;
import loja.Movel;
import loja.Eletrodomestico;
import loja.Carrinho;

import java.util.*;

public class Venda {
	
		
	private Date data;
	private double total;
	private  int quantidade;
	private Cliente cl;
	private Carrinho car;
	private Movel mov;
	private Eletrodomestico el;

	
	public Venda() { };
	  
	
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Cliente getCl() {
		return cl;
	}
	public void setCl(Cliente cl) {
		this.cl = cl;
	}
	public Carrinho getCar() {
		return car;
	}
	public void setCar(Carrinho car) {
		this.car = car;
	}
	public Movel getMov() {
		return mov;
	}
	public void setMov(Movel mov) {
		this.mov = mov;
	}
	public Eletrodomestico getEl() {
		return el;
	}
	public void setEl(Eletrodomestico el) {
		this.el = el;
	}

	
	
	
	
	
	public static void mostrarCliente(ArrayList<Cliente> cliente) {
    	Cliente cl;
    	Insumo.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
        for(int aux = 0;aux < cliente.size(); aux++) {
        	cl = (Cliente) cliente.get(aux);
            System.out.println(cl.getNome()+"\t\t"+
            		cl.getIdade()+
            		"\t\t"+cl.getCPF()+"\t\t"+cl.getEndereco());
        }
    }
	
	
	public static void mostrarMovel(ArrayList<Movel> movel) {
    	Movel mov;
    	Insumo.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
        for(int aux = 0;aux < movel.size(); aux++) {
        	mov = (Movel) movel.get(aux);
            System.out.println(mov.getNome()+"\t\t"+
            		mov.getCategoria()+
            		"\t\t"+mov.getDimensao()+"\t\t"+mov.getModelo()+"\t\t"+
            		mov.getPreco()+"\t\t"+mov.getCor()+"\t\t"+mov.getQuantidade());
        }
    }
	
	public static void mostrarEletrodomestico(ArrayList<Eletrodomestico> eletro) {
		Eletrodomestico el;
    	Insumo.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
        for(int aux = 0;aux < eletro.size(); aux++) {
        	el = (Eletrodomestico) eletro.get(aux);
            System.out.println(el.getNome()+"\t\t"+
            		el.getGrupo()+
            		"\t\t"+el.getTipo()+"\t\t"+el.getMarca()+"\t\t"+
            		el.getPreco()+"\t\t"+el.getCor()+"\t\t"+el.getQuantidade());
        }
    }
	
	
	public  void cadastrarVendaMovel(ArrayList<Cliente> cliente, ArrayList<Movel> movel) {
		
		boolean sim = false;
		String a, c, f;
		int venda =0, d, b;
		Cliente cl;
		Movel mov;
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
	do {
		mostrarCliente(cliente);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome de um dos clientes para selecioná-lo: " );
		a = lerString.nextLine();
		
	
		mostrarMovel(movel);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome de um produto para selecioná-lo: " );
		c = lerString.nextLine();
		
		System.out.println( "Quantas vendas você deseja realizar?" );
		b = ler.nextInt();
		
		
		for(int i=0; i < b; i++) {
			for(int aux = 0;aux < cliente.size(); aux++) {
				cl = (Cliente) cliente.get(aux);
				if(cl.getNome() .equalsIgnoreCase(a)) {
					f = cl.getNome();
					for(int aux1 = 0;aux1<movel.size();aux1++) {
						mov = (Movel) movel.get(aux1);
						if(mov.getNome() .equalsIgnoreCase(c)) {
							venda++;
							mov.setQuantidade(mov.quantidade--);
							mov.quantidade--;
						}
					}
				}
			}
		}
		System.out.println( "Digite 5 se deseja realizar mais vendas. Caso contrário digite outro número para voltar ao menu " );
		d = ler.nextInt();
		if(d!=5) {
			sim = true;
		
		}
	} while (sim == false );
		
		
		System.out.println("Quantos produtos foram vendidos ?");
		System.out.println( venda +" "+ "vendas realizadas com exito!" );
		
		return;
}
	
	
	public  void cadastrarVendaEletrodomestico(ArrayList<Cliente> cliente, ArrayList<Movel> movel) {
		
		boolean sim = false;
		String a, c, f;
		int venda =0, d, b;
		Cliente cl;
		Movel mov;
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
	do {
		mostrarCliente(cliente);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome de um dos clientes para selecioná-lo: " );
		a = lerString.nextLine();
		
	
		mostrarMovel(movel);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome de um produto para selecioná-lo: " );
		c = lerString.nextLine();
		
		System.out.println( "Quantas vendas você deseja realizar?" );
		b = ler.nextInt();
		
		
		for(int i=0; i < b; i++) {
			for(int aux = 0;aux < cliente.size(); aux++) {
				cl = (Cliente) cliente.get(aux);
				if(cl.getNome() .equalsIgnoreCase(a)) {
					f = cl.getNome();
					for(int aux1 = 0;aux1<movel.size();aux1++) {
						mov = (Movel) movel.get(aux1);
						if(mov.getNome() .equalsIgnoreCase(c)) {
							venda++;
							mov.setQuantidade(mov.quantidade--);
							mov.quantidade--;
						}
					}
				}
			}
		}
		System.out.println( "Digite 5 se deseja realizar mais vendas. Caso contrário digite outro número para voltar ao menu " );
		d = ler.nextInt();
		if(d!=5) {
			sim = true;
		
		}
	} while (sim == false );
		
		
		System.out.println("Quantos produtos foram vendidos ?");
		System.out.println( venda +" "+ "vendas realizadas com exito!" );
		
		return;
}


	public static void mostrarMovelEstoque(ArrayList<Movel> movel) {
	Movel mov;
	Insumo.limpaTela(7);
	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
	System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
    for(int aux = 0;aux < movel.size(); aux++) {
    	mov = (Movel) movel.get(aux);
        System.out.println(mov.getNome()+"\t\t"+
        		mov.getCategoria()+
        		"\t\t"+mov.getDimensao()+"\t\t"+mov.getModelo()+"\t\t"+
        		mov.getPreco()+"\t\t"+mov.getCor()+"\t\t"+mov.getQuantidade());
    	}
	}


	public static void mostrarEletrodomesticoEstoque(ArrayList<Eletrodomestico> eletro) {
		Eletrodomestico el;
    	Insumo.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
        for(int aux = 0;aux < eletro.size(); aux++) {
        	el = (Eletrodomestico) eletro.get(aux);
            System.out.println(el.getNome()+"\t\t"+
            		el.getGrupo()+
            		"\t\t"+el.getTipo()+"\t\t"+el.getMarca()+"\t\t"+
            		el.getPreco()+"\t\t"+el.getCor()+"\t\t"+el.getQuantidade());
        }
    }
	
	

}
