package loja;

import java.util.ArrayList;
import java.util.Scanner;

public class PDF extends Produto {
	
public static ArrayList<PDF> pdf = new ArrayList<>();
	
	protected String categoria;
	protected String autor;

	
	public PDF(String t, String cat,  String an, double v, String l, int q, int i, int a ) {
		titulo = t;
		setCategoria(cat);  // perguntar para a prof. como herdar o telefone/endereco
		setAutor(an);      // e agraceder por ter cacado o ç cedilha
		
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
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public static ArrayList<PDF> getPdf() {
		return pdf;
	}
	
	
	
	public static void cadastrar(PDF pd) {
		pdf.add(pd);
	}
	
	
	public static void listar(ArrayList<PDF> pdf) {
    	PDF pd;
    	limpaTela(7);
    	System.out.println("NOME\t\tCATEGORIA\t\tAUTOR\t\t\tPRECO\t\tID\t\tQUANTIDADE\tLINGUA\t\tAnoPUBLICACAO");
		System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
        for(int aux = 0;aux < pdf.size(); aux++) {
        	pd = (PDF) pdf.get(aux);
            System.out.println(pd.getTitulo()+"\t\t"+
            		pd.getCategoria()+
            		"\t\t"+pd.getAutor()+"\t\t"+pd.getValor()+"\t\t"+pd.getId()+"\t\t"+pd.getQuantidade()+"\t\t"+
            		pd.getLingua()+"\t\t"+pd.getAnoPublicacao());
        }
    }
	
	public static void editar(ArrayList<PDF> pdf) {
		String b;
		int aux, c;
		
		Scanner ler = new Scanner(System.in);
		System.out.println(" \n Digite o nome do PDF a editar: \n ");
		b = ler.nextLine();
		PDF pd = null;
    	limpaTela(3);
    	System.out.println("NOME\t\tCATEGORIA\t\tAUTOR\t\t\tPRECO\t\tID\t\tQUANTIDADE\tLINGUA\t\tAnoPUBLICACAO");
		System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
		for( aux = 0;aux < pdf.size(); aux++) {
        	pd = (PDF) pdf.get(aux);
        	if(pd.getTitulo() .equalsIgnoreCase(b)) {
        		System.out.println(pd.getTitulo()+"\t\t"+
                		pd.getCategoria()+
                		"\t\t"+pd.getAutor()+"\t\t"+pd.getId()+"\t\t"+pd.getQuantidade()+"\t\t"+
                		pd.getLingua()+"\t\t"+pd.getAnoPublicacao());
        		System.out.println(" \n Digite 5 se deseja alterar os dados desse PDF. "
        				+ "Caso contrário digite outro número para voltar ao menu \n");
        		int a = ler.nextInt(); 
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o Titulo");
        			pd.setTitulo(ler.nextLine()); 
        			ler.nextLine();
        			System.out.println("Altere a categoria");
        			pd.setCategoria(ler.nextLine());
        			ler.nextLine();
        			System.out.println("Altere o Id");
        			pd.setId(ler.nextInt());
        			ler.nextLine();
        			System.out.println("Altere o Autor");
        			pd.setAutor(ler.nextLine()); 
        			ler.nextLine();
        			System.out.println("Altere o Valor");
        			pd.setValor(ler.nextDouble());
        			ler.nextLine();
        			System.out.println("Altere a Lingua");
        			pd.setLingua(ler.nextLine());
        			ler.nextLine();
        			System.out.println("Altere a quantidade");
        			pd.setQuantidade(ler.nextInt()); 
        			ler.nextLine();
        			System.out.println("Altere o Ano de Publicacao");
        			pd.setAnoPublicacao(ler.nextInt()); 
        			return;
        		}
        		else {
        			return;
        		}
        	}

		}
		if(pd.getTitulo() .equalsIgnoreCase(b)) {
			c = 1;
		} else {
			System.out.println("Titulo nao encontrado!");
			return;
		}
		
	}
	
	public static int deletar(ArrayList<PDF> pdf) {
		String b;
		int aux, c;
		
		Scanner ler = new Scanner(System.in);
		System.out.println(" \n Digite o nome do PDF a deletar: \n ");
		b = ler.nextLine();
		PDF pd = null;
    	limpaTela(3);
    	System.out.println("NOME\t\tCATEGORIA\t\tAUTOR\t\t\tPRECO\t\tID\t\tQUANTIDADE\tLINGUA\t\tAnoPUBLICACAO");
		System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
		for( aux = 0;aux < pdf.size(); aux++) {
        	pd = (PDF) pdf.get(aux);
        	if(pd.getTitulo() .equalsIgnoreCase(b)) {
        		System.out.println(pd.getTitulo()+"\t\t"+
                		pd.getCategoria()+
                		"\t\t"+pd.getAutor()+"\t\t"+pd.getId()+"\t\t"+pd.getQuantidade()+"\t\t"+
                		pd.getLingua()+"\t\t"+pd.getAnoPublicacao());
        		System.out.println("Digite 5 se deseja deletar esse PDF. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			pdf.remove(pd);
        			return 0;
        		}
        		else {
        			return 0;
        		}
        	}

		} 
		if(pd.getTitulo() .equalsIgnoreCase(b)) {
			c = 1;
		} else {
			System.out.println("Titulo nao encontrado!");
			return 0;
		}
		return 0;
		
	}
		
	

	
	
	public static int buscarNome(ArrayList<PDF> pdf) {
		String b;
		int aux, a = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println(" \n Digite o nome do PDF a buscar: \n ");
		b = ler.nextLine();
		PDF pd = null;
    	limpaTela(3);
    	System.out.println("NOME\t\tCATEGORIA\t\tAUTOR\t\t\tPRECO\t\tID\t\tQUANTIDADE\tLINGUA\t\tAnoPUBLICACAO");
		System.out.println("====\t\t=========\t\t============\t\t=====\t\t====\t\t=========\t=========\t==============");
		for( aux = 0;aux < pdf.size(); aux++) {
        	pd = (PDF) pdf.get(aux);
        	if(pd.getTitulo() .equalsIgnoreCase(b)) {
        		System.out.println(pd.getTitulo()+"\t\t"+
                		pd.getCategoria()+
                		"\t\t"+pd.getAutor()+"\t\t"+pd.getId()+"\t\t"+pd.getQuantidade()+"\t\t"+
                		pd.getLingua()+"\t\t"+pd.getAnoPublicacao());
        	}

		} 
		if ( pd.getTitulo() .equalsIgnoreCase(b) ) {
			a = 1;
		} else {
			System.out.println("PDF não encontrado!");
		}
		return 0;
	}

		
	public static int buscarCategoria(ArrayList<PDF> movel) {
		
	
		
		return 0;
	}
	
	public static void limpaTela(int linhas) {
		for(int aux = 0; aux < linhas; aux++)
		System.out.println();
    }
	

}
