package package4;
import java.util.Scanner;


public class Input {
	
	public static String inputSt() {
		Scanner ler = new Scanner(System.in);
		String string = ler.nextLine(); // nome completo
		return string;
	}

    public static int inputIn() {
		Scanner ler = new Scanner(System.in);
		int inteiro = ler.nextInt();
		return inteiro;
	}

	public static char inputCh() {
		Scanner ler = new Scanner(System.in);
		char caracter = ler.next().toLowerCase().charAt(0);
		return caracter;
	}
	
	public static void inputBus() {
		System.out.print("Digite o nome do cliente a buscar:\n");
		Scanner ler = new Scanner(System.in);
		String nome = ler.nextLine(); // nome completo
		
	}
	
}



// how to close    ler.close()
