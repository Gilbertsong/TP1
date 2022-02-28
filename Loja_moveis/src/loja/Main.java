package loja;
import java.util.*;
import javax.swing.*;
import java.awt.*;

import view.TelaCliente;
import view.TelaMenu;

public class Main {
	
	static Cliente c1, c2, c3, c4, c5;
	static Funcionario f1, f2, f3, f4, f5;
	static Fornecedor f6, f7, f8, f9, f10;
	static Telefone t;
	static Endereco e;
	static Movel m1, m2, m3, m4, m5;
	static Eletrodomestico e1, e2, e3, e4, e5;
	

	public static void main(String[] args) {
		
		// TelaMenu menu = new TelaMenu();
		TelaCliente cliente = new TelaCliente();
		
		
		
	}
		/*
		 
		 
		  ArrayList<Cliente> cliente = Cliente.getCliente();
		  ArrayList<Eletrodomestico> eletro = Eletrodomestico.getEletrodomestico();
		  ArrayList<Movel> movel = Movel.getMovel();
		  //Venda[] venda = new Venda[10];
		  Carrinho carrinho = new Carrinho();
		//ArrayList<Funcionario> funcionario = Funcionario.getFuncionario();
		//ArrayList<Fornecedor> fornecedor = Fornecedor.getFornecedor();
		 //ArrayList<Produto> products = Produto1.getProducts();
		
		  Scanner ler = new Scanner(System.in);
			Scanner lerString = new Scanner(System.in);
		GregorianCalendar d = new GregorianCalendar();
		Date data = d.getTime();
		
		t = new Telefone(0, 0);
		t.setDDD(061);
		t.setNumero(981447766);
		int menu;
		
		// lembrar que não está herdando o telefone 
		c1 = new Cliente("paulo", data, 87496847, e);
		c2 = new Cliente("maria", data, 96236514, e);
		c3 = new Cliente("marcio", data, 92965814, e);
		c4 = new Cliente("isabela", data, 95214536, e);
		c5 = new Cliente("pedro", data, 82547896, e);           
		
		
		
		f1 = new Funcionario("paulo", "supervisor", 23.000, "Nível Médio" );
		f2 = new Funcionario("joao", "vendedor", 23.000, "Nível Superior" );
		f3 = new Funcionario("bruno", "suporte", 23.000, "Nível Médio" );
		f4 = new Funcionario("paulo", "gerente", 23.000, "Nível Superior" );
		f5 = new Funcionario("paulo", "sub-gerente", 23.000, "Nível Médio" );
		
		f6 = new Fornecedor("paulo", "monopolista", 254123654 );
		f7 = new Fornecedor("joao", "habitual", 632514788 );
		f8 = new Fornecedor("bruno", "especial", 123541233 );
		f9 = new Fornecedor("paulo", "monopolista", 145787441 );
		f10 = new Fornecedor("paulo", "especial", 125477452 );
		
		
		
		
		
		
		
		Cliente.cadastrar(c1);
		Cliente.cadastrar(c2);
		Cliente.cadastrar(c3);
		Cliente.cadastrar(c4);
		Cliente.cadastrar(c5);
		
		
		
		
	
		
		
		
	
		
/*		Funcionario.cadastrar(f1);
		Funcionario.cadastrar(f2);
		Funcionario.cadastrar(f3);
		Funcionario.cadastrar(f4);
		Funcionario.cadastrar(f5);
		
		Fornecedor.cadastrar(f6);
		Fornecedor.cadastrar(f7);
		Fornecedor.cadastrar(f8);
		Fornecedor.cadastrar(f9);
		Fornecedor.cadastrar(f10);        */
		
		
		//venda[0] = new Venda("mesa");
		//venda[1] = new Venda("rack");
		//venda[2] = new Venda("sofá");
		//venda[3] = new Venda("cama");
		//venda[4] = new Venda("painel");
		
		
		
		//Cliente.editar(cliente);
		//Cliente.listar(cliente);
		//Cliente.buscar(cliente);
		
		//Funcionario.listar(funcionario);
		//Fornecedor.listar(fornecedor);
		
		
		//Movel.listar(movel);
		//Eletrodomestico.listar(eletro);
		//Venda.mostrarCliente(cliente);
		
		
		//venda.cadastroDeVenda(cliente, movel);
		
		//Venda.mostrarMovel(movel);
		//carrinho.setProdutoVendidos(venda);
		
		
		
	  
	
	public static void limpaTela(int linhas) {
		for(int aux = 0; aux < linhas; aux++)
		System.out.println();
    }

	
}
