import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// imc = (peso / altura²)
		
		Scanner leitor = new Scanner(System.in);
		double peso, altura, imc;
		System.out.println("Digite seu peso");
		peso = leitor.nextDouble();
		System.out.println("Digite sua altura");
		altura = leitor.nextDouble();
		imc = peso / (altura * altura);
		//Operadores lógicos:
		//não - !   1
		//E - &&    2 
		//OU - ||   3
		String sexo = "Feminino";
		//Feminino = feminio
				
		if(sexo.equals("Feminino"))
			System.out.println("Bem vinda, voce esta ");
		else
			System.out.println("Bem vindo, voce esta ");
		
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		}
		else if (imc >= 18.5 && imc <= 24.99 ) {
			System.out.println("Normal");
		}
		else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso");
		}
		else if (imc >= 30 && imc < 40) {
			System.out.println("Obesidade");
		}
		else {
			System.out.println("Obesidade grave");
		}
			

	}

}
