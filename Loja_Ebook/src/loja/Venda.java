package loja;


import java.util.*;

public class Venda {
	
	public static ArrayList<Venda> vendas = new ArrayList<>();
	
		
	private Date data;
	private double total;
	private  int quantidade;
	private Cliente cl;
	private PDF pdf;
	private Epub ep;
	static int venda = 0;
	private Funcionario fun;

	
	public Venda(Date d, double t, int q, Cliente c, PDF p, Epub e) { 
		data = d;
		total = t;
		quantidade = q;
		cl = c;
		pdf = p;
		ep = e;
		
	}
	  
	
	
	
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
	
	public PDF getPDF() {
		return pdf;
	}
	public void setPDF(PDF pdf) {
		this.pdf = pdf;
	}
	public Epub getEpub() {
		return ep;
	}
	public void setEpub(Epub ep) {
		this.ep = ep;
	}
	
	
	public static ArrayList<Venda> getVenda() {
		return vendas;
	}

	
	
	public static void cadastrar(Venda vd) {
		vendas.add(vd);
	}
	
	
	
	public static void mostrarCliente(ArrayList<Cliente> cliente) {
    	Cliente cl;
    	Main.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
        for(int aux = 0;aux < cliente.size(); aux++) {
        	cl = (Cliente) cliente.get(aux);
            System.out.println(cl.getNome()+"\t\t"+
            		cl.getIdade()+
            		"\t\t"+cl.getCPF()+"\t\t"+cl.getEndereco());
        }
    }
	
	
	public static void mostrarFuncionario(ArrayList<Funcionario> funcionario) {
    	Funcionario fun;
    	Main.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
        for(int aux = 0;aux < funcionario.size(); aux++) {
        	fun = (Funcionario) funcionario.get(aux);
            System.out.println(fun.getNome()+"\t\t"+
            		fun.getCargo()+
            		"\t\t"+fun.getSalario()+"\t\t"+fun.getEscolaridade());
        }
    }
	
	
	public static void mostrarPDF(ArrayList<PDF> pdf) {
    	PDF pd;
    	Main.limpaTela(7);
    	System.out.println("NOME\t\tEDITORA\t\tGENERO\t\t\tPRECO\t\tLINGUA\t\tQUANTIDADE\tID\t\tAnoPUBLICACAO");
		System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
        for(int aux = 0;aux < pdf.size(); aux++) {
        	pd = (PDF) pdf.get(aux);
            System.out.println(pd.getTitulo()+"\t\t"+
            		pd.getCategoria()+
            		"\t\t"+pd.getAutor()+"\t\t"+pd.getId()+"\t\t"+pd.getQuantidade()+"\t\t"+
            		pd.getLingua()+"\t\t"+pd.getAnoPublicacao());
        }
    }
	
	public static void mostarEpub(ArrayList<Epub> epub) {
		Epub ep;
    	Main.limpaTela(7);
    	System.out.println("NOME\t\tEDITORA\t\tGENERO\t\t\tPRECO\t\tLINGUA\t\tQUANTIDADE\tID\t\tAnoPUBLICACAO");
		System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
        for(int aux = 0;aux < epub.size(); aux++) {
        	ep = (Epub) epub.get(aux);
            System.out.println(ep.getTitulo()+"\t\t"+
    				ep.getEditora()+
            		"\t\t"+ep.getGenero()+"\t\t"+
            		ep.getValor()+"\t\t"+ep.getId()+"\t\t"+ep.getQuantidade()+"\t\t"+
                    		ep.getLingua()+"\t\t"+ep.getAnoPublicacao());
        }
    }
	
	
	public static  void cadastrarVendaPDF(ArrayList<Cliente> cliente, ArrayList<PDF> pdf, ArrayList<Funcionario> funcionario) {
		
		System.out.println( "\n Para realizar Vendas, deve se haver cadastrado previamente algum Ebook, Cliente e Funcionário!\n" );
		boolean sim = false;
		String a, c, f, e;
		int  d, b;
		Cliente cl;
		Funcionario fun;
		PDF pd;
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
	do {
		mostrarCliente(cliente);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome do Cliente que irá comprar o PDF: " );
		a = lerString.nextLine();
		
		
		mostrarFuncionario(funcionario);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome do Funcionario que irá realizar a venda: " );
		e = lerString.nextLine();
		
	
		mostrarPDF(pdf);
		System.out.println( "\n\n" );
		System.out.println( "Digite o Titulo do PDF a ser vendido a esse Cliente: " );
		c = lerString.nextLine();
		
		System.out.println( "Quantas vendas você deseja realizar?" );
		b = ler.nextInt();
		
		
		for(int i=0; i < b; i++) {
			for(int aux = 0;aux < cliente.size(); aux++) {
				cl = (Cliente) cliente.get(aux);
				if(cl.getNome() .equalsIgnoreCase(a)) {
					f = cl.getNome();
					for(int aux2 = 0;aux2<funcionario.size();aux2++) {
						fun = (Funcionario) funcionario.get(aux2);
						if(fun.getNome() .equalsIgnoreCase(e)) {
							for(int aux1 = 0;aux1<pdf.size();aux1++) {
								pd = (PDF) pdf.get(aux1);
								if(pd.getTitulo() .equalsIgnoreCase(c)) {
							    venda++;
							    pd.setQuantidade(pd.quantidade--);
							    pd.quantidade--;
							    System.out.println( "Venda realizada com exito!" );
							    
								}
							}
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
		
		
		System.out.println("Quantos PDF foram vendidos ?");
		System.out.println( venda +" "+ "vendas realizadas com exito!" );
		
		return;
}
	
	
	public static  void cadastrarVendaEpub(ArrayList<Cliente> cliente, ArrayList<Epub> epub, ArrayList<Funcionario> funcionario) {
		
		boolean sim = false;
		String a, c, f, e;
		int venda =0, d, b;
		Cliente cl;
		Epub ep;
		Funcionario fun;
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
	do {
		mostrarCliente(cliente);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome de um dos clientes para selecioná-lo: " );
		a = lerString.nextLine();
		
		
		mostrarFuncionario(funcionario);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome do Funcionario que irá realizar a venda: " );
		e = lerString.nextLine();
		
	
		mostarEpub(epub);
		System.out.println( "\n\n" );
		System.out.println( "Digite o Titulo de um Epub para selecioná-lo: " );
		c = lerString.nextLine();
		
		System.out.println( "Quantas vendas você deseja realizar?" );
		b = ler.nextInt();
		
		
		
		for(int i=0; i < b; i++) {
			for(int aux = 0;aux < cliente.size(); aux++) {
				cl = (Cliente) cliente.get(aux);
				if(cl.getNome() .equalsIgnoreCase(a)) {
					f = cl.getNome();
					for(int aux2 = 0;aux2<funcionario.size();aux2++) {
						fun = (Funcionario) funcionario.get(aux2);
						if(fun.getNome() .equalsIgnoreCase(e)) {
							for(int aux1 = 0;aux1<epub.size();aux1++) {
								ep = (Epub) epub.get(aux1);
								if(ep.getTitulo() .equalsIgnoreCase(c)) {
							    venda++;
							    ep.setQuantidade(ep.quantidade--);
							    ep.quantidade--;
							    System.out.println( "Venda realizada com exito!" );
							    
								}
							}
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
		
		
		System.out.println("Quantos Epub foram vendidos ?");
		System.out.println( venda +" "+ "vendas realizadas com exito!" );
		
		return;
}


	public static void mostarPDFEstoque(ArrayList<PDF> pdf) {
	PDF pd;
	Main.limpaTela(7);
	System.out.println("NOME\t\tEDITORA\t\tGENERO\t\t\tPRECO\t\tLINGUA\t\tQUANTIDADE\tID\t\tAnoPUBLICACAO");
	System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
    for(int aux = 0;aux < pdf.size(); aux++) {
    	pd = (PDF) pdf.get(aux);
        System.out.println(pd.getTitulo()+"\t\t"+
        		pd.getCategoria()+
        		"\t\t"+pd.getAutor()+"\t\t"+pd.getId()+"\t\t"+pd.getQuantidade()+"\t\t"+
        		pd.getLingua()+"\t\t"+pd.getAnoPublicacao());
    	}
	}


	public static void mostrarEpubEstoque(ArrayList<Epub> epub) {
		Epub ep;
    	Main.limpaTela(7);
    	System.out.println("NOME\t\tEDITORA\t\tGENERO\t\t\tPRECO\t\tLINGUA\t\tQUANTIDADE\tID\t\tAnoPUBLICACAO");
		System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
        for(int aux = 0;aux < epub.size(); aux++) {
        	ep = (Epub) epub.get(aux);
            System.out.println(ep.getTitulo()+"\t\t"+
            		ep.getEditora()+
            		"\t\t"+ep.getTitulo()+"\t\t"+ep.getGenero()+"\t\t"+
            		ep.getValor()+"\t\t"+ep.getId()+"\t\t"+ep.getQuantidade()+"\t\t"+
            		ep.getLingua()+"\t\t"+ep.getAnoPublicacao());
        }
    }
	
	

}
