package loja;
import java.util.*;



public class Main {
	
	static Cliente c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, cl1;
	static Funcionario f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, fun1;
	
	static Telefone t;
	static Endereco e;
	static PDF p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, prod1, pd;
	static Epub e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, prod2;
	

	public static void main(String[] args) {
		
			
		 
		 
		  ArrayList<Cliente> cliente = Cliente.getCliente();
		  ArrayList<Epub> epub = Epub.getEpub();
		  ArrayList<PDF> pdf = PDF.getPdf();
		  ArrayList<Venda> vendas = Venda.getVenda();
		  ArrayList<Funcionario> funcionario = Funcionario.getFuncionario();
		
	
		
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		GregorianCalendar d = new GregorianCalendar();
		Date data = d.getTime();
		
		t = new Telefone(061, 981447766);
		
		
		e = new Endereco("DF", "Brasília", "Gama", "rua Pinheiro", 49);
		int menu;
		int n = 0, m, counter, p, b;
		String nome, descricao, a, c, titulo, categoria, autor, lingua, nome2;
		String titulo2, editora, autor2, genero, lingua2;
		String cargo, escolaridade;
		double valor, valor2, salario;
		int anoPublicacao, quantidade, id, idade, cpf;
		int anoPublicacao2, quantidade2, id2;
		
		
		
		
		
		
		do {
			showMenu();
			menu = ler.nextInt();
			
			int venda = 0;

			switch (menu) {

				case 1:
					boolean sim = false;
					
					 System.out.println(" \n CADASTRO DE PDFs \n ");
					 
					
					 p1 = new PDF("Calculo", "Educacao", "James Steward", 120.00, "Portugues", 10, 01, 1982);
					 p2 = new PDF("Fisica", "Educacao", "James Steward", 120.00, "Portugues", 10, 02, 1982);
					 p3 = new PDF("Quimica", "Educacao", "James Steward", 20.00, "Portugues", 10, 03, 1982);
					 p4 = new PDF("Cienca", "Educacao", "James Steward", 120.00, "Portugues", 10, 04, 1982);
					 p5 = new PDF("Direito", "Educacao", "James Steward", 120.00, "Portugues", 10, 05, 1982);
					 p6 = new PDF("Turismo", "Educacao", "James Steward", 120.00, "Portugues", 10, 06, 1982);
					 p7 = new PDF("Letras", "Educacao", "James Steward", 120.00, "Portugues", 10, 07, 1982);
					 p8 = new PDF("Linguas", "Educacao", "James Steward", 120.00, "Portugues", 10, 8, 1982);
					 p9 = new PDF("OO", "Educacao", "James Steward", 120.00, "Portugues", 10, 9, 1982);
					 p10 = new PDF("Java", "Educacao", "James Steward", 120.00, "Portugues", 10, 10, 1982);
					 
					 
					 PDF.cadastrar(p1);
					 PDF.cadastrar(p2);
					 PDF.cadastrar(p3);
					 PDF.cadastrar(p4);
					 PDF.cadastrar(p5);
					 PDF.cadastrar(p6);
					 PDF.cadastrar(p7);
					 PDF.cadastrar(p8);
					 PDF.cadastrar(p9);
					 PDF.cadastrar(p10);
					 
					
					 do {
						 
						
						 System.out.println( " \n Digite 5 se deseja ACRESCENTAR ( cadstrar) mais PDFs manualmente ao pre-cadastro aleatorio, \n "
						 		+ "ou digite qualquer outro número para usar somente o pre-cadastro aleatorio ou seguir com os já cadastrados \n" );
						 b = ler.nextInt();
						 if(b!=5) {
							 sim = true;
							
						 } else {
							 System.out.print(" \n Digite a quantidade de PDF a serem cadastrados:\n");
							 n = ler.nextInt();
							 
							 for(int aux = 0;aux<n;aux++) {
								 
								 
								 limpaTela(7);
								 System.out.println("Digite o Titulo do PDF nº: " );
							     titulo = lerString.nextLine();
							     System.out.println("Digite a Categoria do PDF:");			
							     categoria = lerString.nextLine();
							     System.out.println("Digite o Autor do PDF:");			
								 autor = lerString.nextLine();
								 System.out.println("Digite o Valor do compra do PDF: ");
								 valor = ler.nextDouble();
								 System.out.println("Digite a Lingua do PDF:");			
								 lingua = lerString.nextLine();
								 System.out.println("Digite a quantidade desse PDF especifico: ");
								 quantidade = ler.nextInt();
								 System.out.println("Digite o Id do PDF: ");
								 id = ler.nextInt();
								 System.out.println("Digite o Ano de Publicacao do PDF: ");
								 anoPublicacao = ler.nextInt();
								 
								 prod1 = new PDF(titulo, categoria, autor, valor, lingua,
										 quantidade, id, anoPublicacao);
								 
								 PDF.cadastrar(prod1);
									
							       
							 }
							 
						 	}
						 	 
					 } while (sim == false );
					 
					
					break;
					
					
				case 2:	
					
					limpaTela(6);
					System.out.println(" LISTAR PDF ");
					PDF.listar(pdf);
					
					break;
					
				case 3:	
					
					limpaTela(6);
					System.out.println(" EDITAR PDF ");
					PDF.editar(pdf);
					
					break;
					
					
				case 4:	
					
					limpaTela(6);
					System.out.println(" DELETAR PDF \n ");
					PDF.deletar(pdf);
					
					break;
					
					
				case 5:	
					
					limpaTela(6);
					System.out.println(" BUSCA POR PDF ");
					PDF.buscarNome(pdf);
					
					break;
					
					
				case 6:
					
					
					boolean vai = false;
					
					System.out.println(" \n CADASTRO DE Epub \n ");
					
					 e1 = new Epub("Viagem", "Saraiva", "Negocios", 2200.000, "Portugues", 10, 01, 1982);
					 e2 = new Epub("Lazer", "Saraiva", "Negocios", 2200.000, "Portugues", 10, 02, 1982);
					 e3 = new Epub("Jogo", "Saraiva", "Negocios", 2200.000, "Portugues", 10, 03, 1982);
					 e4 = new Epub("Comida", "Saraiva", "Negocios", 2200.000, "Portugues", 10, 04, 1982);
					 e5 = new Epub("Saude", "Saraiva", "Negocios", 2200.000, "Portugues", 10, 05, 1982);
					 e6 = new Epub("Poder", "Saraiva", "Negocios", 2200.000, "Portugues", 10, 06, 1982);
					 e7 = new Epub("Casa", "Saraiva", "Negocios", 2200.000, "Portugues", 10, 07, 1982);
					 e8 = new Epub("Bebida", "Saraiva", "Negocios", 2200.000, "Portugues", 10, 8, 1982);
					 e9 = new Epub("Moveis", "Saraiva", "Negocios", 2200.000, "Portugues", 10, 9, 1982);
					 e10 = new Epub("Esporte", "Saraiva", "Negocios", 2200.000, "Portugues", 10, 10, 1982);
					 
					 Epub.cadastrar(e1);
					 Epub.cadastrar(e2);
					 Epub.cadastrar(e3);
					 Epub.cadastrar(e4);
					 Epub.cadastrar(e5);
					 Epub.cadastrar(e6);
					 Epub.cadastrar(e7);
					 Epub.cadastrar(e8);
					 Epub.cadastrar(e9);
					 Epub.cadastrar(e10);
					 
					 
					 do {
						 
						
						 System.out.println( " \n Digite 5 se deseja ACRESCENTAR ( cadstrar) mais Epub manualmente ao pre-cadastro aleatorio,  "
						 		+ "ou digite qualquer outro número para usar somente o pre-cadastro aleatorio ou seguir com os já cadastrados" );
						 b = ler.nextInt();
						 if(b!=5) {
							 vai = true;
							
						 } else {
							 System.out.print(" \n Digite a quantidade de Epub a serem cadastrados:\n");
							 n = ler.nextInt();
							 
							 for(int aux = 0;aux<n;aux++) {
								 
								 
								 limpaTela(7);
								 System.out.println("Digite o Titulo do Epub: ");
							     titulo2 = lerString.nextLine();
							     System.out.println("Digite a Editora do Epub:");			
								 editora = lerString.nextLine();
							     System.out.println("Digite o Genero do Epub:");			
							     genero = lerString.nextLine();
								 System.out.println("Digite o Valor do compra do Epub: ");
								 valor2 = ler.nextDouble();
								 System.out.println("Digite a Lingua do Epub:");			
								 lingua2 = lerString.nextLine();
								 System.out.println("Digite a quantidade desse Epub especifico: ");
								 quantidade2 = ler.nextInt();
								 System.out.println("Digite o Id do Epub: ");
								 id2 = ler.nextInt();
								 System.out.println("Digite o Ano de Publicacao do Epub: ");
								 anoPublicacao2 = ler.nextInt();
								 
								 prod2 = new Epub(titulo2, editora, genero, valor2, lingua2,
										 quantidade2, id2, anoPublicacao2);
								 
								 Epub.cadastrar(prod2);
									
							       
							 }
							 
						 	}
						 	 
					 } while (vai == false );
					
					break;
					
				case 7:	
					
					limpaTela(6);
					System.out.println(" LISTAR Epub ");
					Epub.listar(epub);
					
					break;
					
					
				case 8:	
					
					limpaTela(6);
					System.out.println(" EDITAR Epub ");
					Epub.editar(epub);
					
					break;
					
					
				case 9:	
					
					limpaTela(6);
					System.out.println(" DELETAR Epub ");
					Epub.deletar(epub);
					
					break;
					
				case 10:
					
					limpaTela(6);
					System.out.println(" BUSCA POR Epub ");
					Epub.buscarNome(epub);
					
					break;
					
				case 11:
					
					boolean sai = false;
					
					System.out.println(" \n CADASTRO DE CLIENTE \n ");
					
					Endereco en;
					
					
					 c1 = new Cliente("Paulo", 25, 87496847, e, t);
					 c2 = new Cliente("Maria", 39, 87496847, e, t);
					 c3 = new Cliente("Isabela", 41, 87496847, e, t);
					 c4 = new Cliente("Naira", 12, 87496847, e, t);
					 c5 = new Cliente("Pedro", 26, 87496847, e, t);
					 c6 = new Cliente("Gustavo", 50, 87496847, e, t);
					 c7 = new Cliente("Merlin", 68, 87496847, e, t);
					 c8 = new Cliente("Luis", 70, 87496847, e, t);
					 c9 = new Cliente("Bebeto", 15, 87496847, e, t);
					 c10 = new Cliente("Ronaldo", 80, 87496847, e, t);
					 
					 
					 Cliente.cadastrar(c1);
					 Cliente.cadastrar(c2);
					 Cliente.cadastrar(c3);
					 Cliente.cadastrar(c4);
					 Cliente.cadastrar(c5);
					 Cliente.cadastrar(c6);
					 Cliente.cadastrar(c7);
					 Cliente.cadastrar(c8);
					 Cliente.cadastrar(c9);
					 Cliente.cadastrar(c10);
					 
					 
					 do {
						 
						
						 System.out.println( " \n Digite 5 se deseja ACRESCENTAR ( cadstrar) mais CLientes manualmente ao pre-cadastro aleatorio, \n  "
						 		+ "ou digite qualquer outro número para usar somente o pre-cadastro aleatorio ou seguir com os já cadastrados" );
						 b = ler.nextInt();
						 if(b!=5) {
							 sai = true;
							
						 } else {
							 System.out.print(" \n Digite a quantidade de Clientes a serem cadastrados:\n");
							 n = ler.nextInt();
							 
							 for(int aux = 0;aux<n;aux++) {
								 
								 
								 limpaTela(7);
								 System.out.println("Digite o nome do Cliente a ser cadastrado: ");
							     nome2 = lerString.nextLine();
							     System.out.println("Digite a Idade do Cliente a ser cadastrado: ");
							     idade = ler.nextInt();
								 System.out.println("Digite o CPF do Cliente com apenas numeros sucessivos: ");
								 cpf = ler.nextInt();
								 System.out.println("Digite o Endereco do Cliente em linhas distintas da seguinte forma: Primeiro o Estado, depois a Cidade, "
								 		+ "depois o Bairro, depois a Rua e por fim o Numero do imóvel ");
								 e.setEstado(lerString.nextLine());
								 e.setCidade(lerString.nextLine());
								 e.setBairro(lerString.nextLine());
								 e.setRua(lerString.nextLine());
								 e.setNumeroImovel(ler.nextInt());
								 System.out.println("Digite o Telefone do Cliente em linhas distintas da seguinte forma: Primeiro o DDD e depois o numero ");
								 t.setDDD(ler.nextInt());
								 t.setNumero(ler.nextInt());
								 
								 
								 cl1 = new Cliente(nome2, idade, cpf, e, t);
								 
								 Cliente.cadastrar(cl1);
									
							       
							 }
							 
						 	}
						 	 
					 } while (sai == false );
					
					break;
					
					
					
				case 12:	
					
					limpaTela(6);
					System.out.println(" LISTAR CLIENTES ");
					Cliente.listar(cliente);
					
					break;
					
					
				case 13:	
					
					limpaTela(6);
					System.out.println(" EDITAR CLIENTES ");
					Cliente.editar(cliente);
					
					break;
					
					
				case 14:	
					
					limpaTela(6);
					System.out.println(" DELETAR CLIENTES ");
					Cliente.deletar(cliente);
					
					break;
					
					
				case 15:	
					
					limpaTela(6);
					System.out.println(" BUSCA POR CLIENTES ");
					Cliente.buscar(cliente);
					
					break;	
					
					
				case 16:	
					
					boolean continua = false;
					
					limpaTela(6);
					System.out.println(" \n CADASTRO DE FUNCIONARIO \n ");
					
					
					 f1 = new Funcionario("Pedro", "Diretor",  17.000, "Doutorado");
					 f2 = new Funcionario("Luan", "Marketing",  17.000, "Graduacao");
					 f3 = new Funcionario("Martin", "Presidente",  17.000, "Mestrado");
					 f4 = new Funcionario("Gabriel", "Vendedor",  17.000, "Graduacao");
					 f5 = new Funcionario("Santana", "Assistente",  17.000, "Medio");
					 f6 = new Funcionario("Marcela", "Estagiario",  17.000, "Medio");
					 f7 = new Funcionario("Luisa", "Assistente",  17.000, "Medio");
					 f8 = new Funcionario("Emilia", "Financeiro",  17.000, "Graduacao");
					 f9 = new Funcionario("Margarete", "Contador",  17.000, "Mestrado");
					 f10 = new Funcionario("Juliana", "Advogado",  17.000, "Graduacao");
					 
					 
					 Funcionario.cadastrar(f1);
					 Funcionario.cadastrar(f2);
					 Funcionario.cadastrar(f3);
					 Funcionario.cadastrar(f4);
					 Funcionario.cadastrar(f5);
					 Funcionario.cadastrar(f6);
					 Funcionario.cadastrar(f7);
					 Funcionario.cadastrar(f8);
					 Funcionario.cadastrar(f9);
					 Funcionario.cadastrar(f10);
					 
					
					 do {
						 
						
						 System.out.println( " \n Digite 5 se deseja ACRESCENTAR ( cadstrar) mais Funcionarios manualmente ao pre-cadastro aleatorio,  "
						 		+ "ou digite qualquer outro número para usar somente o pre-cadastro aleatorio ou seguir com os já cadastrados" );
						 b = ler.nextInt();
						 if(b!=5) {
							 continua = true;
							
						 } else {
							 System.out.print(" \n Digite a quantidade de Funcionarios a serem cadastrados:\n");
							 n = ler.nextInt();
							 
							 for(int aux = 0;aux<n;aux++) {
								 
								 
								 limpaTela(7);
								 System.out.println("Digite o nome do Funcionario nº: " + aux+1 );
							     nome = lerString.nextLine();
							     System.out.println("Digite a Cargo do Funcionario:");			
							     cargo = lerString.nextLine();
							     System.out.println("Digite a escolaridade do Funcionario:");			
								 escolaridade = lerString.nextLine();
								 System.out.println("Digite o Salario do Funcionario: ");
								 salario = ler.nextDouble();
								 
								 
								 fun1 = new Funcionario(nome, cargo, salario, escolaridade);
								 
	
								 Funcionario.cadastrar(fun1);
									
							       
							 }
							 
						 	}
						 	 
					 } while (continua == false );
					 
					
					
					break;
					
					
				case 17:	
					
					limpaTela(6);
					System.out.println(" LISTAR FUNCIONARIOS ");
					Funcionario.listar(funcionario);
					
					break;
					
					
				case 18:	
					
					limpaTela(6);
					System.out.println(" EDITAR FUNCIONARIOS ");
					Funcionario.editar(funcionario);
					
					break;
					
					
				case 19:	
					
					limpaTela(6);
					System.out.println(" DELETAR FUNCIONARIOS ");
					Funcionario.editar(funcionario);
					
					break;
					
					
				case 20:
					
					limpaTela(5);
					System.out.println(" CADASTRO DE VENDA DE PDF ");
					Venda.cadastrarVendaPDF(cliente, pdf, funcionario);
					
					
					break;
					
				case 21:
					
						System.out.println("CADASTRANDO DE VENDA DE Epub ");
						Venda.cadastrarVendaEpub(cliente, epub, funcionario);
														
					
					
					break;
					
				case 22:
					
				
					System.out.println(" QUANTIDADE DE PDF EM ESTOQUE ");
					Venda.mostarPDFEstoque(pdf);
				
					
					
					
			
			
						break;
						
				case 23:
					
					System.out.println("4 - QUANTIDADE DE Epub EM ESTOQUE");
					Venda.mostarEpub(epub);
					
					
					
					
					break;
					
			
					
				case 24:
					
					limpaTela(4);
					System.out.println("9 - SAINDO DO SISTEMA!!!!! ");
					limpaTela(4);
					
					break;
					
			} 
			
		}while ( menu != 24);
		   
		   
		  
			
		  
    }
	
	
	static void showMenu() {
		System.out.println("==========LOJA_EBOOK=======");
		System.out.println("1 - CADASTRO DE PDF");
		System.out.println("2 - LISTAR PDF");
		System.out.println("3 - EDITAR PDF");
		System.out.println("4 - DELETAR PDF");
		System.out.println("5 - BUSCA POR PDF");
		System.out.println("6 - CADASTRO DE Epub");
		System.out.println("7 - LISTAR Epub");
		System.out.println("8 - EDITAR Epub");
		System.out.println("9 - DELETAR Epub");
		System.out.println("10 - BUSCA POR EPUB");
		System.out.println("11 - CADASTRO DE CLIENTES");
		System.out.println("12 - LISTAR CLIENTES");
		System.out.println("13 - EDITAR CLIENTES");
		System.out.println("14 - DELETAR CLIENTESF");
		System.out.println("15 - BUSCA POR CLIENTE ");
		System.out.println("16 - CADASTRO DE FUNCIONARIO");
		System.out.println("17 - LISTAR FUNCIONARIO");
		System.out.println("18 - EDITAR FUNCIONARIO");
		System.out.println("19 - DELETAR FUNCIONARIO");
		System.out.println("20 - CADASTRO DE VENDAS DE PDF ");
		System.out.println("21 - CADASTRO DE VENDAS DE Epub ");
		System.out.println("22 - QUANTIDADE DE PDF EM ESTOQUES");
		System.out.println("23 - QUANTIDADE DE Epub EM ESTOQUES");
		System.out.println("24 - SAIR ");
	} 
		
		
		
		
	
	
	public static void limpaTela(int linhas) {
		for(int aux = 0; aux < linhas; aux++)
		System.out.println();
    }

	
}
