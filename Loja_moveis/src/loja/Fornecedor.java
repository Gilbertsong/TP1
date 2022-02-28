package loja;

import java.util.ArrayList;
import java.util.Scanner;

public class Fornecedor extends Pessoa {
	public static ArrayList<Fornecedor> fornecedor = new ArrayList<>();
	
	private String tipo;
	
	
	public Fornecedor(String n, String t, int cpf) {
		nome = n;
		tipo = t;;  // arrumar a forma de entrar data
		CPF = cpf;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	
	
	
	public static ArrayList<Fornecedor> getFornecedor() {
		return fornecedor;
	}
	
	
	public static void cadastrar(Fornecedor forn) {
		fornecedor.add(forn);
	}
	
	
	public static void listar(ArrayList<Fornecedor> fornecedor) {
    	Fornecedor forn;
    	Insumo.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
        for(int aux = 0;aux < fornecedor.size(); aux++) {
        	forn = (Fornecedor) fornecedor.get(aux);
            System.out.println(forn.getNome()+"\t\t"+
            		forn.getTipo()+
            		"\t\t"+forn.getCPF());
        }
    }
	
	public static void editar(ArrayList<Fornecedor> fornecedor) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Funcionário a editar:");
		b = ler.nextLine();
		Fornecedor forn = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < fornecedor.size(); aux++) {
        	forn = (Fornecedor) fornecedor.get(aux);
        	if(forn.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(forn.getNome()+"\t\t"+forn.getTipo()+
        		"\t\t"+forn.getCPF());
        		System.out.println("Digite 5 se deseja editar os dados desse funcionário. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o nome");
        			forn.setNome(ler.nextLine()); 
        			System.out.println("Altere o Cargo");
        			forn.setTipo(ler.nextLine());
        			System.out.println("Altere o Salário");
        			forn.setCPF(ler.nextInt());
        			
        			return;
        		}
        		else {
        			return;
        		}
        	}

		}
		
	}
	
	public static void deletar(ArrayList<Fornecedor> fornecedor) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Funcionário a editar:");
		b = ler.nextLine();
		Fornecedor forn = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < fornecedor.size(); aux++) {
        	forn = (Fornecedor) fornecedor.get(aux);
        	if(forn.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(forn.getNome()+"\t\t"+forn.getTipo()+
        		"\t\t"+forn.getCPF());
        		System.out.println("Digite 5 se deseja editar os dados desse funcionário. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			fornecedor.remove(forn);
        			return;
        		}
        		else {
        			return;
        		}
        	}

		} 
		if ( forn.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return;
	}
		
	

	
	
	public static void buscar(ArrayList<Fornecedor> fornecedor) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Funcionário a editar:");
		b = ler.nextLine();
		Fornecedor forn = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < fornecedor.size(); aux++) {
        	forn = (Fornecedor) fornecedor.get(aux);
        	if(forn.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(forn.getNome()+"\t\t"+forn.getTipo()+
        		"\t\t"+forn.getCPF());
        	}

		} 
		if ( forn.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return;
	}
	
	
	public static void classificar(ArrayList<Fornecedor> fornecedor) {

		//  criar o método
		
        }
    


	
}
	
	


