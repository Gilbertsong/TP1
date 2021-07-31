package package4;
import package2.Clientes;
import java.util.ArrayList;

public class Show {
	
	boolean sair = false;
	
	public static String showSt(String mensagem) {
		 String valorLido;
		 System.out.println(mensagem);
		 valorLido = Input.inputSt();
		 return valorLido;
    }
	
	public static int showIn(String mensagem) {
		 int valorLido;
		 System.out.println(mensagem);
		 valorLido = Input.inputIn();
		 return valorLido;
	}
	

    public static void mostra(ArrayList cliente) {
    	Clientes cl;
    	Instancia.limpaTela(7);
        System.out.println("NOME\t\tENDEREÇO\tTELEFONE");
        System.out.println("====\t\t=======\t\t=====");
        for(int aux = 0;aux < cliente.size(); aux++) {
        	cl = (Clientes) cliente.get(aux);
            System.out.println(cl.getNome()+"\t\t"+
        cl.getEndereço()+"\t\t"+cl.getTelefone());
        }
    }

}
