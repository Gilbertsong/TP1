package loja;

import java.util.ArrayList;
import java.util.Scanner;

public class Eletrodomestico extends Produto {
	
public static ArrayList<Eletrodomestico> eletro = new ArrayList<>();
	
	private String grupo;
	private String tipo;
	private String marca;

	
	public Eletrodomestico(String n, String g,  String t, String m, double p, String c, int q) {
		nome = n;
		setGrupo(g);  // perguntar para a prof. como herdar o telefone/endereco
		setTipo(t);      // e agraceder por ter cacado o ç cedilha
		setMarca(m);
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
	
	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	public static ArrayList<Eletrodomestico> getEletrodomestico() {
		return eletro;
	}
	
	
	
	
	public static void cadastrar(Eletrodomestico el) {
		eletro.add(el);
	}
	
	
	public static void listar(ArrayList<Eletrodomestico> eletro) {
		Eletrodomestico el;
    	Insumo.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
        for(int aux = 0;aux < eletro.size(); aux++) {
        	el = (Eletrodomestico) eletro.get(aux);
            System.out.println(el.getNome()+"\t\t"+
            		el.getGrupo()+
            		"\t\t"+el.getTipo()+"\t\t"+el.getMarca()+"\t\t"+
            		el.getPreco()+"\t\t"+el.getCor()+"\t\t"+el.getQuantidade());
        }
    }
	
	public static void editar(ArrayList<Eletrodomestico> eletro) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a editar:");
		b = ler.nextLine();
		Eletrodomestico el = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < eletro.size(); aux++) {
        	el = (Eletrodomestico) eletro.get(aux);
        	if(el.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(el.getNome()+"\t\t"+
                		el.getGrupo()+
                		"\t\t"+el.getTipo()+"\t\t"+el.getMarca()+"\t\t"+
                		el.getPreco()+"\t\t"+el.getCor()+"\t\t"+el.getQuantidade());
        		System.out.println("Digite 5 se deseja alterar os dados desse cliente. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt(); 
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o nome");
        			el.setNome(ler.nextLine()); 
        			System.out.println("Altere o grupo");
        			el.setGrupo(ler.nextLine());
        			System.out.println("Altere o tipo");
        			el.setTipo(ler.nextLine());
        			System.out.println("Altere a marca");
        			el.setMarca(ler.nextLine()); 
        			System.out.println("Altere o preço");
        			el.setPreco(ler.nextDouble());
        			System.out.println("Altere a cor");
        			el.setCor(ler.nextLine());
        			System.out.println("Altere a quantidade");
        			el.setQuantidade(ler.nextInt()); 
        			return;
        		}
        		else {
        			return;
        		}
        	}

		}
		
	}
	
	public static int deletar(ArrayList<Eletrodomestico> eletro) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a deletar:");
		b = ler.nextLine();
		Eletrodomestico el = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < eletro.size(); aux++) {
        	el = (Eletrodomestico) eletro.get(aux);
        	if(el.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(el.getNome()+"\t\t"+
                		el.getGrupo()+
                		"\t\t"+el.getTipo()+"\t\t"+el.getMarca()+"\t\t"+
                		el.getPreco()+"\t\t"+el.getCor()+"\t\t"+el.getQuantidade());
        		System.out.println("Digite 5 se deseja deletar esse cliente. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			eletro.remove(el);
        			return 0;
        		}
        		else {
        			return 0;
        		}
        	}

		} 
		if ( el.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return 0;
	}
		
	

	
	
	public static int buscarNome(ArrayList<Eletrodomestico> eletro) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a buscar:");
		b = ler.nextLine();
		Eletrodomestico el = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < eletro.size(); aux++) {
        	el = (Eletrodomestico) eletro.get(aux);
        	if(el.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(el.getNome()+"\t\t"+
                		el.getGrupo()+
                		"\t\t"+el.getTipo()+"\t\t"+el.getMarca()+"\t\t"+
                		el.getPreco()+"\t\t"+el.getCor()+"\t\t"+el.getQuantidade());
        	}

		} 
		if ( el.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return 0;
	}


	public static int buscarPreco(ArrayList<Eletrodomestico> eletro) {
		
		 //   Ainda não finalizado
		
		return 0;
	}
	
	
	
                                
}
