package loja;
import java.util.*;

public class Cliente extends Pessoa {
	public static ArrayList<Cliente> cliente = new ArrayList<>();
	
	private Date idade;

	
	public Cliente(String n, Date d, int cpf, Endereco e) {
		nome = n;
		idade = d;  // perguntar para a prof. como herdar o telefone/endereco
		CPF = cpf;      // e agraceder por ter cacado o ç cedilha
		endereco = e;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getIdade() {
		return idade;
	}
	public void setIdade(Date idade) {
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
    	Insumo.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
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
		System.out.println("Digite o nome do Cliente a editar:");
		b = ler.nextLine();
		Cliente cl = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < cliente.size(); aux++) {
        	cl = (Cliente) cliente.get(aux);
        	if(cl.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(cl.getNome()+"\t\t"+cl.getIdade()+
        		"\t\t"+cl.getCPF()+"\t\t"+cl.getEndereco());
        		System.out.println("Digite 5 se deseja alterar os dados desse cliente. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o nome");
        			cl.setNome(ler.nextLine()); 
        		/*	System.out.println("Altere a data de nascimento");
        			cl.setIdade(ler.nextLine());
        			System.out.println("Altere o telefone");
        			cl.setNumTel(ler.nextInt());
        			System.out.println("Altere o endereço");
        			cl.setEndereco(ler.nextLine()); */
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
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < cliente.size(); aux++) {
        	cl = (Cliente) cliente.get(aux);
        	if(cl.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(cl.getNome()+"\t\t"+cl.getIdade()+
        		"\t\t"+cl.getCPF()+"\t\t"+cl.getEndereco());
        		System.out.println("Digite 5 se deseja alterar esse cliente. "
        				+ "Caso contrário digite outro número para voltar ao menu");
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
      	  System.out.println("Cliente não encontrado!");
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
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < cliente.size(); aux++) {
        	cl = (Cliente) cliente.get(aux);
        	if(cl.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(cl.getNome()+"\t\t"+cl.getIdade()+
        		"\t\t"+cl.getCPF()+"\t\t"+cl.getEndereco());
        	}

		} 
		if ( cl.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return 0;
	}
}