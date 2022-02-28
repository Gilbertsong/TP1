package loja;

import java.util.ArrayList;
import java.util.Scanner;

public class Compra {
	
	private double total;
	private  int quantidade;
	
	public Compra() { }

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	};
	
	
	
	
	public static void mostrarFuncionario(ArrayList<Funcionario> funcionario) {
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
	
	
	public static void mostrarInsumo(ArrayList<Insumo> insumo) {
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
	
	
	
	public  void cadastrarCompraInsumo(ArrayList<Funcionario> funcionario, ArrayList<Insumo> insumo) {
		
		boolean sim = false;
		String a, c, f;
		int compra =0, d, b;
		Funcionario fun;
		Insumo ins;
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
	do {
		mostrarFuncionario(funcionario);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome de um dos funcionarios para selecioná-lo: " );
		a = lerString.nextLine();
		
	
		mostrarInsumo(insumo);
		System.out.println( "\n\n" );
		System.out.println( "Digite o nome de um insumo para selecioná-lo: " );
		c = lerString.nextLine();
		
		System.out.println( "Quantas vendas você deseja realizar?" );
		b = ler.nextInt();
		
		
		for(int i=0; i < b; i++) {
			for(int aux = 0;aux < funcionario.size(); aux++) {
				fun = (Funcionario) funcionario.get(aux);
				if(fun.getNome() .equalsIgnoreCase(a)) {
					for(int aux1 = 0;aux1<insumo.size();aux1++) {
						ins = (Insumo) insumo.get(aux1);
						if(ins.getNome() .equalsIgnoreCase(c)) {
							compra++;
							ins.setQuantidade(ins.quantidade++);
							ins.quantidade++;
						}
					}
				}
			}
		}
		System.out.println( "Digite 5 se deseja realizar mais compras. Caso contrário digite outro número para voltar ao menu " );
		d = ler.nextInt();
		if(d!=5) {
			sim = true;
		
		}
	} while (sim == false );
		
		
		System.out.println("Quantos produtos foram comprados ?");
		System.out.println( compra +" "+ "vendas realizadas com exito!" );
		
		return;
}
	
	
	


	public static void mostrarInsumoEstoque(ArrayList<Insumo> insumo) {
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
	
	
	
	
	
	
	

}
