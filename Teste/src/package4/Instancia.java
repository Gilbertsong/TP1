package package4;
import package2.Clientes;

public class Instancia {
	
	public static Clientes elem(String nome, String endereço, int telefone) {
		Clientes cl = new Clientes(nome, endereço, telefone);
		return cl;
	}
		 
	public static void limpaTela(int linhas) {
		for(int aux = 0; aux < linhas; aux++)
		System.out.println();
    }


}
