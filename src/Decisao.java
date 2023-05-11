import java.util.Scanner;

public class Decisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Digite a idade do usuario: ");
		idade = leitor.nextInt();
		
		//Decisão simples
		//if(condicao) => variavel operadorRelacional valor|variavel
		/*Operadores relacionais
		 * >   maior
		 * >=  maior ou igual
		 * <   menor
		 * <=  menor ou igual
		 * ==  igual
		 * !=  diferente
		 * */
		if(idade >= 12) { //Verdadeira
			System.out.println("Pode assistir ao filme");
		} 
		else {
			System.out.println("Filme nao recomendado para menores de 12 anos");
		}
		
		// else => Condição do if é falsa o else é executado; Não tem condição
		
	}

}
