import java.util.Scanner;

public class DecisaoEncadeada {
	public static void main(String[] args) {
		//Dado um número pelo usuário, verificar se ele é “Positivo”, “Negativo” ou “Nulo”
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um numero: ");
		numero = leitor.nextInt();
		if(numero > 0) {
			System.out.println("Numero positivo.");
		}
		else if(numero < 0) {
			System.out.println("Numero negativo.");
		}
		else {
			System.out.println("Numero nulo.");
		}
		

		
		
	}

}
