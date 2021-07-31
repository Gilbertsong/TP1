package package1;
import java.util.ArrayList;
import java.util.Scanner;
import HelloWorldApp.HelloWorldApp;
import HelloWorldApp.Produto;
import package2.Clientes;
import package4.Input;
import package4.Instancia;

public class Busca extends HelloWorldApp{
	
	 //  BUSCA CLIENTE PELO NOME
	public static int mostraCliente(ArrayList cliente) {
		String b;
		int a, aux;
		
		
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Digite o nome do Cliente a buscar:");
		 b = ler.nextLine();
    	Clientes cl = null;
    	Instancia.limpaTela(3);
        System.out.println("NOME\t\tENDEREÇO\tTELEFONE");
        System.out.println("====\t\t=======\t\t=====");
        for( aux = 0;aux < cliente.size(); aux++) {
        	cl = (Clientes) cliente.get(aux);
        	if(cl.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(cl.getNome()+"\t\t"+
        		cl.getEndereço()+"\t\t"+cl.getTelefone());
        		System.out.println("Digite 5 se deseja alterar os dados desse cliente. Caso contrário digite outro número para voltar ao menu");
        		a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o nome");
        			cl.setNome(ler.nextLine()); 
        			System.out.println("Altere o endereço");
        			cl.setEndereço(ler.nextLine());
        			System.out.println("Altere o telefone");
        			cl.setTelefone(ler.nextInt());
        			return 0;
        		}
        		else {
        			return 0;
        		}
        	}	
          }  if( cl.getNome() != b ) {
        	  System.out.println("Cliente não encontrado!");
          }
		return 0;
	  }   
 
    
	
	
	// BUSCA PRODUTO PELO NOME
	public static int mostraProduto(ArrayList<Produto> products) {
		String b;
		int a;
		
		
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Digite o nome do Produto a buscar:");
		 b = ler.nextLine();
    	Produto prod = null;
    	Instancia.limpaTela(4);
        System.out.println("NOME\t\tDESCRIÇÃO\t\tVALOR\t\tLUCRO\t\tQUANTIDADE");
        System.out.println("====\t\t=======\t\t\t======\t\t========\t========");
        for(int aux = 0;aux < products.size(); aux++) {
        	prod = (Produto) products.get(aux);
        	if(prod.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(prod.getNome()+"\t\t"+
        		prod.getDescricao()+"\t\t\t"+ prod.getValorDeCompra() + "\t\t" + prod.getLucro() + 
        		"\t\t" + prod.getQuantidade());
        		System.out.println("Digite 5 se deseja alterar os dados desse produto. Caso contrário digite outro número para voltar ao menu");
        		a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o nome do produto");
        			prod.setNome(ler.nextLine()); 
        			System.out.println("Altere a Descrição do produto");
        			prod.setDescricao(ler.nextLine());
        			System.out.println("Altere o Valoe de Compra");
        			prod.setValorDeCompra(ler.nextInt());
        			System.out.println("Altere o lucro");
        			prod.setLucro(ler.nextInt());
        			System.out.println("Altere a Quantidade desse produto");
        			prod.setQuantidade(ler.nextInt());
        			return 0;
        		}
        		else {
        			return 0;
        		}
        	}	
       }  if( prod.getNome() != b ) {
     	  System.out.println("Produto não encontrado!");
       }
       Instancia.limpaTela(3);
	return 0;
	}
}
 
    
	
	
	

