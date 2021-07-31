package HelloWorldApp;
import java.util.Scanner;
import package1.Busca;
import package2.Clientes;

import java.util.ArrayList;
import package4.*;



public class HelloWorldApp {

	public static void main(String[] args) {
		
		int n = 0, m, counter, p;
		
		// INSTÂNCIANDO AS ARRAYLIST CLIENTE E PRODUTO
		 ArrayList cliente = new ArrayList();
		 ArrayList<Produto> products = Produto1.getProducts();
		
		Produto prod = null;
		String nome, descricao, a, c;
		double valorDeCompra, lucro, quantidade;
		int menu;
		
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
		do {
			showMenu();
			menu = ler.nextInt();
			int venda = 0;

			switch (menu) {

				case 1:
					
					 System.out.println("CADASTRE DE PRODUTOS ");
					
					 System.out.print("Digite a quantidade de produtos a serem cadastrados:\n");
					 n = ler.nextInt();
					 
					 
					 
					// CRIANDO OS ATRIBUTOS DO OBJETO
					for(int aux = 0;aux<n;aux++) {
						
						System.out.println("Digite o nome: ");
						nome = lerString.nextLine();
						System.out.println("Digite a descrição:");			
						descricao = lerString.nextLine();
						System.out.println("Digite o Valor de compra: ");
						valorDeCompra = ler.nextDouble();
						System.out.println("Digite o a porcentagem de lucro: ");
						lucro = ler.nextDouble();
						System.out.println("Digite a quantidade: ");
						quantidade = ler.nextDouble();
					
						
						// criar objeto
						prod = new Produto(nome, descricao, valorDeCompra, lucro, quantidade);
			
					// salvar no arrayList
						Produto1.cadastrar(prod); 
						Instancia.limpaTela(4);
					
					}
					
					
					
					
					break;
					
				case 2:
					
					Instancia.limpaTela(5);
					System.out.println(" BUSCA POR PRODUTOS ");
					Busca.mostraProduto(products);
					
					break;
					
				case 3:
					
						System.out.println("CADASTRANDO OS CLIENTES ");
					    System.out.print("Digite a quantidade de clientes a serem cadastrados:\n");
						p = ler.nextInt();
						
						
					   for( counter =0;counter < p;counter++) {
						   cliente.add(Instancia.elem(Show.showSt("Digite o nome"),
						   Show.showSt("Digite o endereço"), Show.showIn("Digite o telefone")));
						   Instancia.limpaTela(7);
						
					   }
					
					
					
					break;
					
				case 4:
					
				
					System.out.println("BUSCA POR CLIENTE ");
					Busca.mostraCliente(cliente);
					
					
					
			
			
						break;
						
				case 5:
					
					System.out.println("4 - CADASTRANDO AS VENDAS");
					cadastroDeVenda(cliente, products);
					
					
					
					break;
					
				case 6:
					
					
					System.out.println("LISTA DE PRODUTOS COM QUANTIDADES EM ESTOQUES ");
					System.out.println( Produto1.listar() );
					
					
					
					break;
					
				case 7:
					
					System.out.println("LISTA DE CLIENTES CADASTRADOS ");
					Show.mostra(cliente);
					
					
					
					
					
					break;
					
				case 8:
					
					Instancia.limpaTela(4);
					System.out.println("9 - SAINDO DO SISTEMA!!!!! ");
					Instancia.limpaTela(4);
					
					break;
					
			} 
			
		}while ( menu != 8);
		   
		   
		//   cadastro();
		//   dadosCliente();
		  
			
		  
    }
	
	
	static void showMenu() {
		System.out.println("==========PRODUTO=======");
		System.out.println("1 - CADASTRO DE PRODUTO");
		System.out.println("2 - BUSCA POR PRODUTOS");
		System.out.println("3 - CADASTRO DE CLIENTES");
		System.out.println("4 - BUSCA POR CLIENTE ");
		System.out.println("5 - CADASTRO DE VENDAS ");
		System.out.println("6 - LISTA DE PRODUTOS COM QUANTIDADES EM ESTOQUES");
		System.out.println("7 - LISTA DE CLIENTES CADASTRADOS");
		System.out.println("8 - SAIR ");
	} 
	
	
	
	public static String[] cadastro () {
		int n;
		   
		   Scanner ler = new Scanner(System.in);
		   System.out.print("Digite a quantidade de clientes a serem cadastrados:\n");
			n = ler.nextInt();
		
		   
			String[] client = new String[n];
			
			for(int counter =0;counter < client.length;counter++) {
				System.out.println("Cadastre o cliente n°" + (counter+1));
				client[counter] = ler.next();
			}
			return client;
	}
	
	//
	public static ArrayList dadosCliente() {
		   int n;
		   
		   Scanner ler = new Scanner(System.in);
		   System.out.print("Digite a quantidade de clientes a serem cadastrados:\n");
			n = ler.nextInt();
		
		 ArrayList cliente = new ArrayList();
			
			
		   for(int counter =0;counter < n;counter++) {
			   cliente.add(Instancia.elem(Show.showSt("Digite o nome"),
			   Show.showSt("Digite o endereço"), Show.showIn("Digite o telefone")));
			   Instancia.limpaTela(7);
			
		   }
		   
		   return cliente;
		   
	    	// Show.mostra(cliente);
		 //  Busca.mostraCliente(cliente);  
		
	}
	
	//	 Show.mostra(cliente);
	
	
	 //  Cadastro de vendas
	public static int cadastroDeVenda(ArrayList cliente, ArrayList<Produto> products) {
		
		boolean sim = false;
		String a, c;
		int venda =0, d, b;
		Clientes cl;
		Produto prod;
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
	do {
		Show.mostra(cliente);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome de um dos clientes para selecioná-lo: " );
		a = lerString.nextLine();
		
	
		System.out.println( Produto1.listar() );
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome de um produto para selecioná-lo: " );
		c = lerString.nextLine();
		
		System.out.println( "Quantas vendas você deseja realizar?" );
		b = ler.nextInt();
		
		
		for(int i=0; i < b; i++) {
			for(int aux = 0;aux < cliente.size(); aux++) {
				cl = (Clientes) cliente.get(aux);
				if(cl.getNome() .equalsIgnoreCase(a)) {
					for(int aux1 = 0;aux1<products.size();aux1++) {
						prod = (Produto) products.get(aux1);
						if(prod.getNome() .equalsIgnoreCase(c)) {
							venda++;
							prod.setQuantidade(prod.quantidade--);
							prod.quantidade--;
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
		
		return 0;
}

	
	
	
	
	
	
	
}