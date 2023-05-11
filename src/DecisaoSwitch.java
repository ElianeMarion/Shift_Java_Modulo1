import java.util.Scanner;

public class DecisaoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		String usuario, senha;
		int dia = 3;
		System.out.println("Digite seu login: ");
		usuario = leitor.nextLine();
		
		System.out.println("Digite sua senha: ");
		senha = leitor.nextLine();
		
		if((usuario.equals("Admin") || usuario.equals("admin"))&& senha.equals("123")) {
			System.out.println("Bem vindo " + usuario);
			if(dia == 1)
				System.out.println("Hoje e segunda feira.");
			else if (dia == 2)
				System.out.println("Hoje e terca feira.");
			else if(dia == 3)
				System.out.println("Hoje e quarta feira.");
			else if(dia == 4)
				System.out.println("Hoje e quinta feira.");
			else if(dia == 5)
				System.out.println("Hoje e sexta feira.");
			else
				System.out.println("Bom descanso, aproveite seu final de semana");
			
			//switch => e avaliada uma unica variavel; Não tem operador lógico
			switch(dia) { //a variavel que está sendo testada tem que ser inteira ou caractere '+'
			case 1:
				System.out.println("Hoje e segunda feira.");
				break;
			case 2:
				System.out.println("Hoje e terca feira.");break;
			case 3:
				System.out.println("Hoje e quarta feira.");break;
			case 4:
				System.out.println("Hoje e quinta feira.");break;
			case 5:
				System.out.println("Hoje e sexta feira.");break;
			default:
				System.out.println("Bom descanso, aproveite seu final de semana");
			}
		}
		else
			System.out.println("Login ou senha invalida");
		
	}

}
