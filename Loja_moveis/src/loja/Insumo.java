package loja;

import java.util.ArrayList;
import java.util.Scanner;

public class Insumo extends Produto {
	
public static ArrayList<Insumo> insumo = new ArrayList<>();
	
	private String categoria;
	

	
	public Insumo(String n, String c, double p, int q) {
		nome = n;
		categoria = c;  // perguntar para a prof. como herdar o telefone/endereco	                    // e agraceder por ter cacado o ç cedilha
		preco = p;
		quantidade = q;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
	public static ArrayList<Insumo> getInsumo() {
		return insumo;
	}
	
	public static void cadastrar(Insumo ins) {
		insumo.add(ins);
	}
	
	
	public static void listar(ArrayList<Insumo> insumo) {
		Insumo ins;
    	Insumo.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
        for(int aux = 0;aux < insumo.size(); aux++) {
        	ins = (Insumo) insumo.get(aux);
            System.out.println(ins.getNome()+"\t\t"+
            		ins.getCategoria()+"\t\t"+
            		ins.getPreco()+"\t\t"+ins.getQuantidade());
        }
    }
	
	public static void editar(ArrayList<Insumo> insumo) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a editar:");
		b = ler.nextLine();
		Insumo ins = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < insumo.size(); aux++) {
        	ins = (Insumo) insumo.get(aux);
        	if(ins.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(ins.getNome()+"\t\t"+
                		ins.getCategoria()+"\t\t"+
                		ins.getPreco()+"\t\t"+ins.getQuantidade());
        		System.out.println("Digite 5 se deseja alterar os dados desse cliente. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt(); 
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o nome");
        			ins.setNome(ler.nextLine()); 
        			System.out.println("Altere a categoria");
        			ins.setCategoria(ler.nextLine()); 
        			System.out.println("Altere o preço");
        			ins.setPreco(ler.nextDouble());
        			System.out.println("Altere a cor");
        			ins.setCor(ler.nextLine());
        			System.out.println("Altere a quantidade");
        			ins.setQuantidade(ler.nextInt()); 
        			return;
        		}
        		else {
        			return;
        		}
        	}

		}
		
	}
	
	public static int deletar(ArrayList<Insumo> insumo) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a deletar:");
		b = ler.nextLine();
		Insumo ins = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < insumo.size(); aux++) {
        	ins = (Insumo) insumo.get(aux);
        	if(ins.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(ins.getNome()+"\t\t"+
                		ins.getCategoria()+"\t\t"+
                		ins.getPreco()+"\t\t"+ins.getQuantidade());
        		System.out.println("Digite 5 se deseja deletar esse cliente. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			insumo.remove(ins);
        			return 0;
        		}
        		else {
        			return 0;
        		}
        	}

		} 
		if ( ins.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return 0;
	}
		
	

	
	
	public static int buscarNome(ArrayList<Insumo> insumo) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a buscar:");
		b = ler.nextLine();
		Insumo ins = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < insumo.size(); aux++) {
        	ins = (Insumo) insumo.get(aux);
        	if(ins.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(ins.getNome()+"\t\t"+
                		ins.getCategoria()+"\t\t"+
                		ins.getPreco()+"\t\t"+ins.getQuantidade());
        	}

		} 
		if ( ins.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return 0;
	}
	
	
	public static int buscarPreco(ArrayList<Insumo> insumo) {
		
		// //   Ainda não finalizado
		return 0;
	}
	
	
	
	public static void limpaTela(int linhas) {
		for(int aux = 0; aux < linhas; aux++)
		System.out.println();
    }

}
