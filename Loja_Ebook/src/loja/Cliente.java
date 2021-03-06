package loja;
import java.util.*;

public class Cliente extends Pessoa {
	public static ArrayList<Cliente> cliente = new ArrayList<>();
	
	protected int idade;

	
	public Cliente(String n, int d, int cpf, Endereco e, Telefone t) {
		nome = n;
		idade = d;  
		CPF = cpf;     
		endereco = e;
		numTel = t;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public static ArrayList<Cliente> getCliente() {
		return cliente;
	}
	
	public static void cadastrar(Cliente cl) {
		cliente.add(cl);
	}
	
	
	public static void listar(ArrayList<Cliente> cliente) {
    	Cliente cl;
    	Main.limpaTela(7);
    	System.out.println("NOME\t\tIDADE\t\tCPF\t\tTELEFONE\t\tENDERE?O");
		System.out.println("====\t\t=======\t\t\t=====\t\t\t=====\\t\\t\\t=====");
        for(int aux = 0;aux < cliente.size(); aux++) {
        	cl = (Cliente) cliente.get(aux);
            System.out.println(cl.getNome()+"\t\t"+
            		cl.getIdade()+
            		"\t\t"+cl.getCPF()+"\t\t"+cl.getEndereco());
        }
    }
	
	public static void editar(ArrayList<Cliente> cliente) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do PDF a editar:");
		b = ler.nextLine();
		Cliente cl = null;
    	Main.limpaTela(3);
    	System.out.println("NOME\t\tIDADE\t\tCPF\t\tTELEFONE\t\tENDERE?O");
		System.out.println("====\t\t=======\t\t\t=====\t\t\t=====\\t\\t\\t=====");
		for( aux = 0;aux < cliente.size(); aux++) {
        	cl = (Cliente) cliente.get(aux);
        	if(cl.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(cl.getNome()+"\t\t"+cl.getIdade()+
        		"\t\t"+cl.getCPF()+"\t\t"+cl.getEndereco());
        		System.out.println("Digite 5 se deseja alterar os dados desse cliente. "
        				+ "Caso contr?rio digite outro n?mero para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o nome");
        			cl.setNome(ler.nextLine()); 
        			System.out.println("Altere a Idade");
        			cl.setIdade(ler.nextInt());
        			System.out.println("Altere o CPF");
        			cl.setCPF(ler.nextInt());
        			System.out.println("Altere o telefone");
        			ler.nextInt();
        			System.out.println("Altere o endere?o");
        			ler.nextLine(); 
        			return;
        		}
        		else {
        			return;
        		}
        	}

		}
		
	}
	
	public static int deletar(ArrayList<Cliente> cliente) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a deletar:");
		b = ler.nextLine();
		Cliente cl = null;
    	Main.limpaTela(3);
    	System.out.println("NOME\t\tIDADE\t\tCPF\t\tTELEFONE\t\tENDERE?O");
		System.out.println("====\t\t=======\t\t\t=====\t\t\t=====\\t\\t\\t=====");
		for( aux = 0;aux < cliente.size(); aux++) {
        	cl = (Cliente) cliente.get(aux);
        	if(cl.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(cl.getNome()+"\t\t"+cl.getIdade()+
        		"\t\t"+cl.getCPF()+"\t\t"+cl.getEndereco());
        		System.out.println("Digite 5 se deseja alterar esse cliente. "
        				+ "Caso contr?rio digite outro n?mero para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			cliente.remove(cl);
        			return 0;
        		}
        		else {
        			return 0;
        		}
        	}

		} 
		if ( cl.getNome() != b ) {
      	  System.out.println("Cliente n?o encontrado!");
		}
		return 0;
	}
		
	

	
	
	public static int buscar(ArrayList<Cliente> cliente) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente a buscar:");
		b = ler.nextLine();
		Cliente cl = null;
    	Main.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDERE?O");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < cliente.size(); aux++) {
        	cl = (Cliente) cliente.get(aux);
        	if(cl.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(cl.getNome()+"\t\t"+cl.getIdade()+
        		"\t\t"+cl.getCPF()+"\t\t"+cl.getEndereco());
        	}

		} 
		if ( cl.getNome() != b ) {
      	  System.out.println("Cliente n?o encontrado!");
		}
		return 0;
	}
}