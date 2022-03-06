
import java.util.Scanner;
import java.util.Random;







public class App {

	public static void main(String[] args) {
		
		int n = 0, m, counter, p;
		
		// INSTÂNCIANDO AS ARRAYLIST CLIENTE E PRODUTO
		
		String [][] tema = new String[51][51];
		
		
		String [][] temas = {{"Cores", "azul", "vermelha", "verde", "preta", "amarela", "roxa", "cinza", "marron", "branca", "laranja"},
				            {"Países", "canada", "frança", "allemanha", "israel", "rússia", "china", "japão", "correa", "polonia", "angola"},
				            {"Nomes", "joão", "mariana", "lucia", "gilberto", "pedro", "breno", "miguel", "roberto", "isabela", "fabiola"},
				            {"Numeros", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez"},
				            {"Cursos", "biologia", "matematica", "fisica", "engenharia", "medicina", "direito", "agronomia", "administração", "informatica", "design"},
				            {"Carros"}};
		
		
		
		 
		String nome, descricao, a, c;
		double valorDeCompra, lucro, quantidade;
		int menu, menus, menuu;
		
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
		do {
			showMenu();
			menu = ler.nextInt();
			int venda = 0;

			switch (menu) {

				case 1:
					
					do {
						menuTemas();
						menus = ler.nextInt();
						//int venda = 0;

						switch (menus) {

							case 1:
								
								System.out.println("============================== \n\n");
								 System.out.println("CADASTRE DE TEMAS \n ");
								 System.out.println("============================== \n\n");
								 preCadastroMatriz(tema);
								 cadastro(tema);
								
								
								break;
								
							case 2:
								
								limpaTela(5);
								System.out.println("============================== \n\n");
								System.out.println(" BUSCA DE TEMAS ");
								System.out.println("============================== \n\n");
								
								//listarTema(tema);
								buscarTema(temas);
								
								
								break;
								
							case 3:
								    System.out.println("\n ============================== \n\n");
									System.out.println(" EXCLUSÃO DE TEMAS ");
									System.out.println("============================== \n\n");
									
									excluirTema(temas);    // PRÉ-CADASTRADO 
									// buscaTema(temas);   // IMPORTANTE !!!   PARA EXCLUIR MANUALMENTE DESCOMENTE ESTA LINHA E CADASTRE MANUALMENTE PRIMEIRO
									
									
									
									limpaTela(7);
									
								
								
								
								break;
								
							case 4:
								
								limpaTela(5);
								System.out.println("============================== \n\n");
								System.out.println(" LISTAGEM DE TEMAS ");
								System.out.println("============================== \n\n");
								//listarTema(tema);
								
								listarTema(temas);
								
								
								break;
								
							
								
							case 5:
								
								limpaTela(4);
								System.out.println("============================== \n\n");
								System.out.println("9 - SAINDO DO MENU TEMA !!!!! ");
								limpaTela(4);
								
								
								break;
								
						} 
						
					}while ( menus != 5);
					showMenu();
					
					
					
				case 2:
					
					
					
					do {
						menuPalavras();
						menuu = ler.nextInt();
						//int venda = 0;

						switch (menuu) {

							case 1:
								
								System.out.println("============================== \n\n");
								 System.out.println("CADASTRO DE PALAVRAS \n ");
								 System.out.println("============================== \n\n");
								 preCadastroMatriz(tema);
								 cadastroPalavra(tema);
								
								 
								break;
								
							case 2:
								
								limpaTela(5);
								System.out.println("============================== \n\n");
								System.out.println(" BUSCA DE PALAVRAS ");
								System.out.println("============================== \n\n");
								
								buscarPalavra(temas);
								
								
								break;
								
							case 3:
								    System.out.println("\n ============================== \n\n");
									System.out.println(" EXCLUSÃO DE PALAVRAS ");
									System.out.println("============================== \n\n");
									
									excluirPalavra(temas);
								
									
									
									
									limpaTela(7);
									
								
								
								
								break;
								
							case 4:
								
								limpaTela(5);
								System.out.println("============================== \n\n");
								System.out.println(" LISTAGEM DE PALAVRAS ");
								System.out.println("============================== \n\n");
							
								listarPalavra(temas);
								
								
								
								break;
								
							
								
							case 5:
								
								limpaTela(4);
								System.out.println("============================== \n\n");
								System.out.println("9 - SAINDO DO MENU PALAVRAS !!!!! ");
								limpaTela(4);
								
								break;
								
						} 
						
					}while ( menuu != 5);
					showMenu();
					
							
					
					break;
					
		
			    case 3:
					
					
					System.out.println("============================== \n\n");
				    System.out.println(" JOGAR ");
				    System.out.println("============================== \n\n");
					    
						//buscarTema(tema);
						jogar(tema);
						
						
						   limpaTela(7);
						
					
					
					
					break;
					
				
					
				case 4:
					
					limpaTela(4);
					System.out.println("9 - SAINDO DO SISTEMA!!!!! ");
					limpaTela(4);
					
					break;
					
			} 
			
		}while ( menu != 4);
		   
		   
		
		  
			
}	  
    
	
	
	static void showMenu() {
		System.out.println("============================== \n");
		System.out.println("==========JOGO DA FORCA=======\n");
		System.out.println("============================== \n\n");
		System.out.println("1 - GERENCIAR TEMAS");
		System.out.println("2 - GERENCIAR PALAVRAS");
		System.out.println("3 - JOGAR");
		System.out.println("4 - SAIR ");
	} 
	
	
	static void menuTemas() {
		System.out.println("\n\n============================================ \n");
		System.out.println("======= MENU DE GERENCIAMENTO DE TEMAS =======\n");
		System.out.println("1 - CADASTRO DE TEMAS");
		System.out.println("2 - BUSCA DE TEMAS");
		System.out.println("3 - EXCLUSÃO DE TEMAS ");
		System.out.println("4 - LISTAGEM DE TEMAS ");
		System.out.println("5 - SAIR ");
	}
	
	
	static void menuPalavras() {
		System.out.println("============================================ \n\n");
		System.out.println("========== MENU DE GERENCIAMENTO DE PALAVRAS ======\n");
		System.out.println("1 - CADASTRO DE PALAVRAS  ");
		System.out.println("2 - BUSCA DE PALAVRAS");
		System.out.println("3 - EXCLUSÃO DE PALAVRAS ");
		System.out.println("4 - LISTAGEM DE PALAVRAS ");
		System.out.println("5 - SAIR ");
	}
	
	
	
	public static int cadastro (String [][] temas) {
		int n,  m = 0, p = 0, s = 0;
		String nome;
		   
		   Scanner ler = new Scanner(System.in);
		   Scanner lerString = new Scanner(System.in);
		
		
	       
		   
	       for(int i=0; i < 5; i++) {
				for(int j = 0; j < 10; j++) { 
					System.out.println(temas[i][j]);
				}
			}
	       
			for(int aux =0; aux < temas.length; aux++) {
				if(temas[aux][0] == null) {
					do {
						
						System.out.println("\n ====================================\n");
						System.out.println("\t Cadastre o Tema n°" + (aux+1));
						System.out.println("\n\n");
				        nome = lerString.nextLine();
				        
				    	
				        temas[aux][0] = nome; 
				    
				        System.out.println("\n ====================================\n");
					    System.out.println("\t Cadastro realizado com êxito !! \n ");
					    System.out.println("======================================\n ");
					    System.out.print(" \n Digite 4 se deseja cadastrar outro Tema ou qualquer outro número para encerrar \n");
						m = ler.nextInt();
						if(m != 4 && m != 0) {
														
							return 0;
						//aux++;
						}
					} while (m != 4);
				}
				
				}
			
		
				
				limpaTela(4);
			
			return 0;
	}
	
	
	public static int listarTema (String [][] temas) {
		int n;
		String nome, a;
		
		
		
		   
		   Scanner ler = new Scanner(System.in);
		   Scanner lerString = new Scanner(System.in);
		   
		  
			
			limpaTela(6);
			
			for(int aux =0; aux < temas.length; aux++) {
				if(temas[aux][0] != null) {
					System.out.println();
				    System.out.println( temas[aux][0]);
				}								
			}
			return 0;
	}
	
	
	
	
	
	public static int excluirTema (String [][] temas) {
		int n;
		String nome, a;
		
		
		
		   
		   Scanner ler = new Scanner(System.in);
		   Scanner lerString = new Scanner(System.in);
	
		   
		   for(int aux =0; aux < temas.length; aux++) {
				System.out.println();
				System.out.println( temas[aux][0]);
								
			}
		   
		   System.out.println( "Digite o nome do Tema que deseja excluir: " );
		   a = lerString.nextLine(); 
		   ler.nextLine();
		   
		   for(int i=0; i < temas.length; i++) {
			   
			   for(int j = 0; j < temas[i].length; j++) {
				   
				   if(temas[i][0] .equals(a)) {
					   
					   temas[i][0] = null; 
				   }
				   
				}
			}
			
			
			limpaTela(6);
			
			
			return 0;
	}
	
	public static int buscarTema (String [][] temas) {
		int n;
		String nome, a;
		
		
		
		   
		   Scanner ler = new Scanner(System.in);
		   Scanner lerString = new Scanner(System.in);
		   
		   for(int aux =0; aux < temas.length; aux++) {
				System.out.println();
				System.out.println( temas[aux][0]);
								
			}
		   
		   System.out.println( "\n\n Digite o nome do Tema que deseja buscar: " );
		   a = lerString.nextLine();
		   
		   for(int i=0; i < temas.length; i++) {
			  
			   for(int j = 0; j < temas[i].length; j++) {
				 
				   if(temas[i][0] .equals(a)) {
					   System.out.println("=============");
					   System.out.println(temas[i][0]);
					   System.out.println("=============");
				   } else {
					   System.out.println(" Tema não encontrado ");
				   }
				   
				}
			}
			
			
			limpaTela(6);
			
			
			return 0;
	}
	
	
	public static int cadastroPalavra (String [][] temas) {
		int n;
		String nome, palavra;
		   
		   Scanner ler = new Scanner(System.in);
		   Scanner lerString = new Scanner(System.in);
		   System.out.print("Digite a quantidade de Palavras a serem cadastradas: \n");
		   n = ler.nextInt();
		   ler.nextLine();    // Limpa o buffer
			
		
			System.out.println( "Digite o nome do Tema cujas palavras você deseja Cadastrar: " );	
			nome = lerString.nextLine();
			   
			   for(int i=0; i < temas.length; i++) {
				   
				   for(int j = 0; j < temas[i].length; j++) {
					   
					   if(temas[i][0] .equals(nome)) {
						   if(temas[i][j] == null) {
							   if( j > 0 && j < n+1) {
								   System.out.println( "Digite a Palavra que você deseja Cadastrar no Tema : " + temas[i][0] );
							       palavra = lerString.nextLine();
							       temas[i][j] = palavra;
							       
							       System.out.println("====================================\n");
								   System.out.println("\t Cadastro realizado com êxito !! \n ");
								   System.out.println("======================================");
							   
							   }
						   }
						   
					   } 
					   
					}
				}
			
			
			
			return 0;
	}
	
	
	


	public static int listarPalavra (String [][] temas) {
		int n = 0;
		String a;
		
		
		
		   
		   Scanner ler = new Scanner(System.in);
		   Scanner lerString = new Scanner(System.in);
		  
		   
		   System.out.println( " \n Digite o nome do Tema cujas Palavras você deseja listar: " );
		   a = lerString.nextLine();
		   System.out.println("                \n");
		   
		   for(int i=0; i < temas.length; i++) {
			   
			   for(int j = 0; j < temas[i].length; j++) {
				   if(temas[i][0] .equalsIgnoreCase(a)) {
					   n++;
					   if(temas[i][j] != null) {
						   if( j > 0 ) {
							   
							   System.out.println("=============");
					           System.out.println(temas[i][j]);
					           System.out.println("=============");
						   }
				       } 
				   } 
				 }				   
			   
			}
		   if(n == 0) {
			   
			   System.out.println(" \n ==================\n ");
		       System.out.println(" Palavra não encontrada !! \n ");
		       System.out.println("========================\n");
		       
		    }
			
			
			limpaTela(6);
			
			
			return 0;
	}
	
	
	
	public static int buscarPalavra (String [][] temas) {
		int n, m =0;
		String nome = null, a, b;
		
		
		
		   
		   Scanner ler = new Scanner(System.in);
		   Scanner lerString = new Scanner(System.in);
		  
		   
		 			
		   
		   System.out.println( " \n Digite o nome da Palavra que você deseja buscar: " );
		   a = lerString.nextLine();
		   System.out.println("                \n");
		   
		   for(int i=0; i < temas.length; i++) {
			   
			   for(int j = 0; j < temas[i].length; j++) {
				   if(temas[i][j] .equalsIgnoreCase(a)) {
					   m++;
					   if(temas[i][j] != null) {
						   
						   b = temas[i][j];	
						   nome = temas[i][0];
					       
				       } 
				   }
				 }				   
			   
			}
		   if(m == 0) {
			   System.out.println("====================================\n");
			   System.out.println("\t Palavra não encontrada !! \n ");
			   System.out.println("======================================");
		   } else {
			   System.out.println("==============================\n");
			   System.out.println (" Palavra encontrada no Tema:  " + nome );
			   System.out.println("\n ==============================\n");
		   }
			
			
			limpaTela(6);
			
			
			return 0;
	}
	
	
	public static int excluirPalavra (String [][] temas) {
		int n, m = 0;
		String nome, a;
		
		
		
		   
		   Scanner ler = new Scanner(System.in);
		   Scanner lerString = new Scanner(System.in);
		
		   
		   System.out.println( " \n Digite o nome da Palavra que você deseja excluir: " );
		   a = lerString.nextLine();
		   System.out.println("                \n");
		   
		   for(int i=0; i < temas.length; i++) {
			   
			   for(int j = 0; j < temas[i].length; j++) { 
				   if(temas[i][j] != null) {
					   if(temas[i][j] .equalsIgnoreCase(a)) {
						   m++;
					   
						   
					       temas[i][j] = null;
					   
					       System.out.println("======================================\n");
					       System.out.println("\t Exclusão realisada com êxito ! \n ");
					       System.out.println("======================================");
						   
					       
				       
				       }
				   }
				 }				   
			   
		   }
		   if(m == 0) {
			   
			   System.out.println("======================================\n");
			   System.out.println("\t Palavra não encontrada \n ");
			   System.out.println("======================================");
		   } 
			
			
			
			limpaTela(6);
			
			
			return 0;
	}
	
	
	
	
	public static int jogar (String [][] temas) {
		
		   int n, count = 0, mat = 0, ma = 0, rod = 0;
		
		   Random random = new Random();
	       String a, adem1;
	       String b = null;
	       int c, d, e, p;
	    
		   String [] max = new String[50];
		
		   Scanner ler = new Scanner(System.in);
		   Scanner lerString = new Scanner(System.in);
		   
		   for(int aux =0; aux < temas.length; aux++) {
			   if(temas[aux][0] != null) {
				   System.out.println();
				
				   System.out.println( temas[aux][0]);
			   }
								
			}
		   
		   do {			   
	    	   
			   p = 0;
	    	   d = 3;
		   
		       System.out.println( " \t\t Escolhe um Tema: " );
		       a = lerString.nextLine();
		       ler.nextLine();
		   
		   
		       for(int i=0; i < temas.length; i++) {
		    	   for(int j = 0; j < temas[i].length; j++) {
		    		   if(temas[i][0] .equals(a)) {
		    			   ma++;
					   
					       c = random.nextInt(temas[i].length); 
					  
					   
					       if(temas[i][c] .equalsIgnoreCase(temas[i][0])) {
					    	   b = temas[i][c+1];
					       } else {
					    	   b = temas[i][c];
					       }
					   
					   
				        }
				   
				    }
			   }
		       if(ma == 0) {
		    	   System.out.println("============= TEMA NÃO ENCONTRADO =======");
			   
		       } else {
		    	   System.out.println("============= EM TESE, O USUÁRIO NÃO SABERÁ A PALAVRA SORTEADA AQUI=======");
		           System.out.println(b);   
		           System.out.println("============= EM TESE, O USUÁRIO NÃO SABERÁ A PALAVRA SORTEADA AQUI =========");	
		   
		       
			       
			       do {
			    	   do {
			    		   System.out.println( " \n\n Digite uma Letra para jogar a " + (rod+1) + " RODADA: \n\n " );
			    		   rod++;
			               adem1 = lerString.nextLine();
			               ler.nextLine();
			   
			               for(int m = 0; m < max.length; m++) {
			            	   if(max[m] != null) {
			            		   
			            		   if(max[m] .equalsIgnoreCase(adem1)) {
			            			   mat = 1;
			                		   System.out.println( " Esta letra já foi tentada! \n  " );
					                   System.out.println( " \t Tente outra letra ! " );
			    		           } else {
			    		        	   p++;
				    	               mat = 0;
				    	           }
			    	            } 
			               }
			           }while(mat != 0);
			           max [p] = adem1;
			           int firstIndex = b.indexOf(adem1);
		               
		               if(firstIndex != -1 ) {
		            	   count = 0;
		            	   
		            	   System.out.println(" \t ==============================================================\n");
		            	   System.out.println( " \n Parabéns! Você ACERTOU a palavra! Deseja jogar novamente? \n\n" );
		            	   System.out.println(" \t ==============================================================\n");
		            	   System.out.println(" A letra escolhida está na "
		                           + firstIndex + "º posição da palavra! \n  " );
		                   System.out.println( " \n Digite 3 para jogar novamente ou qualquer outrou número para encerrar \n " );
		                   d = ler.nextInt();
		                   for(int q = 0; q < max.length; q++) {
		                	   max [q] = null;
		                   }
		               } else {
		            	   count++;
		        	       System.out.println( "\n  Você ERROU! Digite outra letra para continuar \n " );
		               }
			    
				  
		          } while (count != 5);
		          if(count == 5) {
		        	  System.out.println(" \t ===========================================\n");
		        	  System.out.println(" \t Você PERDEU! Deseja  jogar novamente? \n ");
		        	  System.out.println("\t ============================================\n");
			          System.out.println( " Digite 3 para jogar novamente ou qualquer outrou número para encerrar" );
	                  d = ler.nextInt();
	                  for(int q = 0; q < max.length; q++) {
	                	   max [q] = null;
	                  }
		          }
			      limpaTela(6);
			
		       } 
	     } while (d == 3);
			
		 

		  return 0;
		   
	}
	
	
	
	
	public static int preCadastroMatriz (String [][] temas) {
		
		String [][] matriz =  {{"Cores", "azul", "vermelha", "verde", "preta", "amarela", "roxa", "cinza", "marron", "branca", "laranja"},
								{"Países", "canada", "frança", "allemanha", "israel", "rússia", "china", "japão", "correa", "polonia", "angola"},
								{"Nomes", "joão", "mariana", "lucia", "gilberto", "pedro", "breno", "miguel", "roberto", "isabela", "fabiola"},
								{"Numeros", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez"},
								{"Cursos", "biologia", "matematica", "fisica", "engenharia", "medicina", "direito", "agronomia", "administração", "informatica", "design"}};
		
		for(int i=0; i < 5; i++) {
			for(int j = 0; j < 10; j++) { 
				temas[i][j] = matriz[i][j];
			}
		}
		

		
	
		return 0;
    }
	
	
	
	
	
	
	public static void limpaTela(int linhas) {
		for(int aux = 0; aux < linhas; aux++)
		System.out.println();
    }
	
	
	
	
	
	
	
	
	
}