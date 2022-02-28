package loja;

import java.util.ArrayList;
import java.util.Scanner;

public class Movel extends Produto {
	
public static ArrayList<Movel> movel = new ArrayList<>();
	
	protected String categoria;
	protected double dimensao;
	protected String modelo;

	
	public Movel(String n, String cat, double d, String m, double p, String c, int q) {
		nome = n;
		categoria = cat;  // perguntar para a prof. como herdar o telefone/endereco
		dimensao = d;      // e agraceder por ter cacado o ç cedilha
		modelo = m;
		preco = p;
		cor = c;
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

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	public static ArrayList<Movel> getMovel() {
		return movel;
	}
	
	
	
	public static void cadastrar(Movel mov) {
		movel.add(mov);
	}
	
	
	public static void listar(ArrayList<Movel> movel) {
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
	
	public static void editar(ArrayList<Movel> movel) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a editar:");
		b = ler.nextLine();
		Movel mov = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < movel.size(); aux++) {
        	mov = (Movel) movel.get(aux);
        	if(mov.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(mov.getNome()+"\t\t"+
                		mov.getCategoria()+
                		"\t\t"+mov.getDimensao()+"\t\t"+mov.getModelo()+"\t\t"+
                        		mov.getPreco()+"\t\t"+mov.getCor()+"\t\t"+mov.getQuantidade());
        		System.out.println("Digite 5 se deseja alterar os dados desse cliente. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt(); 
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o nome");
        			mov.setNome(ler.nextLine()); 
        			System.out.println("Altere a categoria");
        			mov.setCategoria(ler.nextLine());
        			System.out.println("Altere a dimensao");
        			mov.setDimensao(ler.nextInt());
        			System.out.println("Altere o modelo");
        			mov.setModelo(ler.nextLine()); 
        			System.out.println("Altere o preço");
        			mov.setPreco(ler.nextDouble());
        			System.out.println("Altere a cor");
        			mov.setCor(ler.nextLine());
        			System.out.println("Altere a quantidade");
        			mov.setQuantidade(ler.nextInt()); 
        			return;
        		}
        		else {
        			return;
        		}
        	}

		}
		
	}
	
	public static int deletar(ArrayList<Movel> movel) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a deletar:");
		b = ler.nextLine();
		Movel mov = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < movel.size(); aux++) {
        	mov = (Movel) movel.get(aux);
        	if(mov.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(mov.getNome()+"\t\t"+
                		mov.getCategoria()+
                		"\t\t"+mov.getDimensao()+"\t\t"+mov.getModelo()+"\t\t"+
                        		mov.getPreco()+"\t\t"+mov.getCor()+"\t\t"+mov.getQuantidade());
        		System.out.println("Digite 5 se deseja deletar esse cliente. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			movel.remove(mov);
        			return 0;
        		}
        		else {
        			return 0;
        		}
        	}

		} 
		if ( mov.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return 0;
	}
		
	

	
	
	public static int buscarNome(ArrayList<Movel> movel) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a buscar:");
		b = ler.nextLine();
		Movel mov = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < movel.size(); aux++) {
        	mov = (Movel) movel.get(aux);
        	if(mov.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(mov.getNome()+"\t\t"+
                		mov.getCategoria()+
                		"\t\t"+mov.getDimensao()+"\t\t"+mov.getModelo()+"\t\t"+
                        		mov.getPreco()+"\t\t"+mov.getCor()+"\t\t"+mov.getQuantidade());
        	}

		} 
		if ( mov.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return 0;
	}

		
	public static int buscarCXategoria(ArrayList<Movel> movel) {
		
	//   Ainda não finalizado
		
		return 0;
	}
	
	

}
