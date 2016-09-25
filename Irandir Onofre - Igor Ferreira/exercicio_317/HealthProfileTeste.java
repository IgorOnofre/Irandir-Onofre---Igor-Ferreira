package exercicio_317;
import java.util.Scanner;;

public class HealthProfileTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		String sexo;
		int diaN;
		int mesN;
		int anoN;
		float altura;
		float peso;
		
		System.out.print("Informe seu nome: ");
		nome = input.next();
		System.out.print("Informe seu sobre nome: ");
		sobrenome = input.next();
		System.out.print("Informe seu sexo: ");
		sexo = input.next();
		
		
		System.out.print("Informe seu dia de nacimento: ");
		diaN = input.nextInt();
		System.out.print("Informe seu mês de nacimento: ");
		mesN = input.nextInt();
		System.out.print("Informe seu ano de nacimento: ");
		anoN = input.nextInt();
		
		
		System.out.print("Informe sua altura: ");
		altura = input.nextFloat();
		System.out.print("Informe seu peso: ");
		peso = input.nextFloat();
		
		
		HealthProfile p1 = new HealthProfile(nome, sobrenome, sexo,
				diaN, mesN, anoN, altura, peso);
		
		p1.mostrarDados();
	}
}
