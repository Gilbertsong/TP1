package loja;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa {
	public static ArrayList<Funcionario> funcionario = new ArrayList<>();
	
	private double salario;
	private String cargo;
	private String escolaridade;
	
	
	
	
	public Funcionario(String n, String c, double s, String e) {
		nome = n;
		cargo = c;  // arrumar a forma de entrar data
		salario = s;
		escolaridade = e;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	
	public static ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}
	
	
	public static void cadastrar(Funcionario fun) {
		funcionario.add(fun);
	}
	
	
	public static void listar(ArrayList<Funcionario> funcionario) {
    	Funcionario fun;
    	Insumo.limpaTela(7);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
        for(int aux = 0;aux < funcionario.size(); aux++) {
        	fun = (Funcionario) funcionario.get(aux);
            System.out.println(fun.getNome()+"\t\t"+
            		fun.getCargo()+
            		"\t\t"+fun.getSalario()+"\t\t"+fun.getEscolaridade());
        }
    }
	
	public static void editar(ArrayList<Funcionario> funcionario) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Funcionário a editar:");
		b = ler.nextLine();
		Funcionario fun = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < funcionario.size(); aux++) {
        	fun = (Funcionario) funcionario.get(aux);
        	if(fun.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(fun.getNome()+"\t\t"+fun.getCargo()+
        		"\t\t"+fun.getSalario()+"\t\t"+fun.getEscolaridade());
        		System.out.println("Digite 5 se deseja editar os dados desse funcionário. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			System.out.println("Altere o nome");
        			fun.setNome(ler.nextLine()); 
        			System.out.println("Altere o Cargo");
        			fun.setCargo(ler.nextLine());
        			System.out.println("Altere o Salário");
        			fun.setSalario(ler.nextInt());
        			System.out.println("Altere a Escolaridade");
        			fun.setEscolaridade(ler.nextLine());
        			
        			return;
        		}
        		else {
        			return;
        		}
        	}

		}
		
	}
	
	public static void deletar(ArrayList<Funcionario> funcionario) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Funcionário a editar:");
		b = ler.nextLine();
		Funcionario fun = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < funcionario.size(); aux++) {
        	fun = (Funcionario) funcionario.get(aux);
        	if(fun.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(fun.getNome()+"\t\t"+fun.getCargo()+
        		"\t\t"+fun.getSalario()+"\t\t"+fun.getEscolaridade());
        		System.out.println("Digite 5 se deseja editar os dados desse funcionário. "
        				+ "Caso contrário digite outro número para voltar ao menu");
        		int a = ler.nextInt();   
        		ler.nextLine();
        		if(a == 5) {
        			funcionario.remove(fun);
        			return;
        		}
        		else {
        			return;
        		}
        	}

		} 
		if ( fun.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return;
	}
		
	

	
	
	public static void buscar(ArrayList<Funcionario> funcionario) {
		String b;
		int aux;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Funcionário a editar:");
		b = ler.nextLine();
		Funcionario fun = null;
    	Insumo.limpaTela(3);
    	System.out.println("NOME\t\tDATA DE NASCIMENTO\t\t\tTELEFONE\t\tENDEREÇO");
		System.out.println("====\t\t=================\t\t\t=====\t\t\t=====");
		for( aux = 0;aux < funcionario.size(); aux++) {
        	fun = (Funcionario) funcionario.get(aux);
        	if(fun.getNome() .equalsIgnoreCase(b)) {
        		System.out.println(fun.getNome()+"\t\t"+fun.getCargo()+
        		"\t\t"+fun.getSalario()+"\t\t"+fun.getEscolaridade());
        	}

		} 
		if ( fun.getNome() != b ) {
      	  System.out.println("Cliente não encontrado!");
		}
		return;
	}
	
	
	public static void avaliar(ArrayList<Funcionario> funcionario) {

		// fazer o método avaliar aqui
		
        }
    
	
	
}
	
	


