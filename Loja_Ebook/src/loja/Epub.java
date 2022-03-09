package loja;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Epub extends Produto {
	
public static ArrayList<Epub> epub = new ArrayList<>();
	
	protected String editora;
	protected String genero;

	
	public Epub(String t,  String e, String g, double v, String l, int q, int i,  int a) {  
		titulo = t;
		setEditora(e);  
		setGenero(g);
		valor = v;
		quantidade = q;
		id = i;
		lingua = l;
		anoPublicacao = a;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	public static ArrayList<Epub> getEpub() {
		return epub;
	}
	
	
	
	
	public static void cadastrar(Epub ep) {
		epub.add(ep);
	}
	
	
	public static void listar(ArrayList<Epub> epub) {
		Epub ep;
    	limpaTela(6);
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
	
	public static void editar(ArrayList<Epub> epub) {
		String b;
		int aux, c;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\n Digite o nome do Epub a editar: \n ");
		b = ler.nextLine();
		Epub ep = null;
    	limpaTela(3);
    	System.out.println("NOME\t\tEDITORA\t\tGENERO\t\t\tPRECO\t\tLINGUA\t\tQUANTIDADE\tID\t\tAnoPUBLICACAO");
		System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
		for( aux = 0;aux < epub.size(); aux++) {
        	ep = (Epub) epub.get(aux);
        	if(ep.getTitulo() .equalsIgnoreCase(b)) {
        		System.out.println(ep.getTitulo()+"\t\t"+
                		ep.getEditora()+
                		"\t\t"+ep.getTitulo()+"\t\t"+ep.getGenero()+"\t\t"+
                		ep.getValor()+"\t\t"+ep.getId()+"\t\t"+ep.getQuantidade()+"\t\t"+
                        		ep.getLingua()+"\t\t"+ep.getAnoPublicacao());
        		System.out.println(" \n Digite 5 se deseja alterar os dados desse Epub. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt(); 
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o Titulo");
        			ep.setTitulo(ler.nextLine());
        			System.out.println("Altere a Editora");
        			ep.setEditora(ler.nextLine());
        			System.out.println("Altere o Genero");
        			ep.setGenero(ler.nextLine()); 
        			System.out.println("Altere o preço");
        			ep.setValor(ler.nextDouble());
        			System.out.println("Altere a Lingua");
        			ep.setLingua(ler.nextLine());
        			System.out.println("Altere a quantidade");
        			ep.setQuantidade(ler.nextInt()); 
        			System.out.println("Altere o Id");
        			ep.setId(ler.nextInt());
        			System.out.println("Altere o Ano de Publicacao");
        			ep.setAnoPublicacao(ler.nextInt()); 
        			return;
        		}
        		else {
        			return;
        		}
        	}

		}
		if (ep.getTitulo() .equalsIgnoreCase(b)) {
			c = 1;
		} else {
			System.out.println("\n Titulo nao encontrado!");
			return;
		}
		
		
	}
	
	public static int deletar(ArrayList<Epub> epub) {
		String b;
		int aux, c;
		
		Scanner ler = new Scanner(System.in);
		System.out.println(" \n Digite o nome do Epub a deletar:\n ");
		b = ler.nextLine();
		Epub ep = null;
    	limpaTela(3);
    	System.out.println("NOME\t\tEDITORA\t\tGENERO\t\t\tPRECO\t\tLINGUA\t\tQUANTIDADE\tID\t\tAnoPUBLICACAO");
		System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
		for( aux = 0;aux < epub.size(); aux++) {
        	ep = (Epub) epub.get(aux);
        	if(ep.getTitulo() .equalsIgnoreCase(b)) {
        		System.out.println(ep.getTitulo()+"\t\t"+
        				ep.getEditora()+
                		"\t\t"+ep.getGenero()+"\t\t"+
                		ep.getValor()+"\t\t"+ep.getId()+"\t\t"+ep.getQuantidade()+"\t\t"+
                        		ep.getLingua()+"\t\t"+ep.getAnoPublicacao());
        		System.out.println(" \n Digite 5 se deseja deletar esse Epub. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			epub.remove(ep);
        			return 0;
        		}
        		else {
        			return 0;
        		}
        	}

		} 
		if (ep.getTitulo() .equalsIgnoreCase(b)) {
			c = 1;
		} else {
			System.out.println(" \n Titulo nao encontrado!");
			return 0;
		}
		return 0;
	}
		
	

	
	
	public static int buscarNome(ArrayList<Epub> epub) {
		String b;
		int aux, c;
		
		Scanner ler = new Scanner(System.in);
		System.out.println(" \n Digite o nome do Epub a buscar: \n ");
		b = ler.nextLine();
		Epub ep = null;
    	limpaTela(3);
    	System.out.println("NOME\t\tEDITORA\t\tGENERO\t\t\tPRECO\t\tLINGUA\t\tQUANTIDADE\tID\t\tAnoPUBLICACAO");
		System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
		for( aux = 0;aux < epub.size(); aux++) {
        	ep = (Epub) epub.get(aux);
        	if(ep.getTitulo() .equalsIgnoreCase(b)) {
        		System.out.println(ep.getTitulo()+"\t\t"+
        				ep.getEditora()+
                		"\t\t"+ep.getGenero()+"\t\t"+
                		ep.getValor()+"\t\t"+ep.getId()+"\t\t"+ep.getQuantidade()+"\t\t"+
                        		ep.getLingua()+"\t\t"+ep.getAnoPublicacao());
        	}

		} 
		if (ep.getTitulo() .equalsIgnoreCase(b)) {
			c = 1;
		} else {
			System.out.println("\n Titulo nao encontrado!");
			return 0;
		}
		return 0;
	}


	public static int buscarPreco(ArrayList<Epub> eletro) {
		
		 
		
		return 0;
	}
	
	
	public static void limpaTela(int linhas) {
		for(int aux = 0; aux < linhas; aux++)
		System.out.println();
    }

	
	
	
                                
}
