import java.util.Scanner;

public class Conversao {

	static final double COTACAO = 5.3;
	
	public static void main(String[] args) {
		/* Formatação de casas decimais
		 * double x = 5.54784887;
		   System.out.println("x: " + String.format("%.2f", x));	
		 */
		double doacaoDolar, valorReais;
		
		Scanner leitor = new Scanner(System.in);
		Scanner leitorTexto = new Scanner(System.in);
		
		String doador;
		System.out.println("Digite seu nome: ");
		doador = leitorTexto.nextLine();
		System.out.println("Digite o valor da doação em dolares: $ ");
		doacaoDolar = leitor.nextDouble();
		if(doacaoDolar > 0) { //Condição => (variavel operadorRelacional valor|variavel)
			valorReais = doacaoDolar * COTACAO;
			System.out.println("O valor da cotacao recebida em reais foi " + String.format("%.2f", valorReais)
			+ "\nObrigado(a) " + doador);
		}
		
		
		/*2ª SOLUÇÃO
		valorReais = doacaoDolar * 5.3;
		System.out.println("O valor da cotacao exibida em reais foi " + String.format("%.2f", valorReais));
		
		//3ª SOLUÇÃO
		System.out.println("Digite a cotacao do dolar: ");
		double cotacaoDolar = leitor.nextDouble();
		valorReais = doacaoDolar * cotacaoDolar;
		System.out.println("O valor da cotacao exibida em reais foi " + String.format("%.2f", valorReais));
		
		*/
	}

}
