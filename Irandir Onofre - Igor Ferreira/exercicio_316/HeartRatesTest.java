package exercicio_316;

import java.util.Scanner;



public class HeartRatesTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite seu nome");
		String nome = scan.nextLine();
		
		System.out.println("digite seu sobrenome");
		String sobreNome = scan.nextLine();
		
		System.out.println("data de nascimento exemplo: 02/11/1998");
		String nascimento = scan.nextLine();
		
		HeartRates h = new HeartRates(nome, sobreNome, nascimento);
		int a = h.idade();
		System.out.println("Sua idade é "+a);
		System.out.println("Sua frequencia cardíaca Maxima é "+h.frequenciaCardiacaMaxima());
		System.out.println(h.frequenciaCardiacaAlvo());
	}

}
