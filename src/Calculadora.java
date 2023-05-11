import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//2 + 2 = 4 ( + - * /)
		//Nomes de variáveis: não conter caracteres especias exceto o _
		//; começa com letra; CamelCase nomeAluno, cpfAluno
		int valor1;  //num1 | n1 | v1
		int valor2;
		int soma, subtracao, multiplicao;
		Scanner leitor = new Scanner(System.in);
		//syso => System.out.println();
		System.out.println("Esse programa vai somar, subtrair, multiplicar e dividir");
		System.out.println("Digite o primeiro valor que deseja somar: ");
		//Leitura - entrada sintaxe: variavel = leitor.nextTipo();
		valor1 = leitor.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = leitor.nextInt();
		
		/* Operadores matemático
		 * Soma: +
		 * Subtração: -
		 * Multiplicação: *
		 * Divisão: /
		 * Resto da divisão: %
		 * Prioridade: multiplicação| Divisão e depois a soma| Subtração 
		 * (())
		 * ((2 + 3)/ 2) * 3
		 * */
		//Processamento ou atribuição
		//Sintaxe: variavel = calculo;   ou variavel = valor
		//          x = 2 + 3;					pi = 3.14

		soma = valor1 + valor2;
		System.out.println("A soma dos numeros digitados e: " + soma + ".");
		
		if (valor1 >= valor2) {
			subtracao = valor1 - valor2;
		}
		else
			subtracao = valor2 - valor1;
		
		System.out.println("A subtracao dos numeros digitados e: " + subtracao);
		
		multiplicao = valor1 * valor2;
		System.out.println("A multiplicacao dos numeros digitados e: " + multiplicao);
		
		if(valor2 > 0) {
			double divisao = (double) valor1 / (double) valor2;
			System.out.println("A divisao dos numeros digitados e: " + divisao);
		}
		else
			System.out.println("Nao e possivel dividir por zero.");
				
	}

}
