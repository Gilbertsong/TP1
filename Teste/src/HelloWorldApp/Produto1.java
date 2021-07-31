package HelloWorldApp;
import java.util.ArrayList;




public class Produto1 {
	
	// INSTÂNCIANDO A ARRAYLIST
	public static ArrayList<Produto> products = new ArrayList<>();

	public static ArrayList<Produto> getProducts() {
		return products;
	}
	
	 // CADASTRANDO OS PRODUTOS
	public static void cadastrar(Produto p) {
				products.add(p);
			}
		    
	
	// LISTANDO OS PRODUTOS
	public static String listar() {
		String lista = "";
		int aux = 1;
		for(Produto p : products) {
			lista += "\n==== PRODUTO N°" + (aux++);
			lista += "\n";
			lista += p.listaProduto();
		}
		return lista;
	
	}

	
	
}


