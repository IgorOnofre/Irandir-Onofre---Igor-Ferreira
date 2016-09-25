package exercicio_315;
import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dia, mes, ano;
		
		System.out.print("Informe o seu dia de: ");
		dia = scan.nextInt();
		System.out.print("Informe o seu mês de: ");
		mes = scan.nextInt();
		System.out.print("Informe o seu ano de: ");
		ano = scan.nextInt();
		
		Date date = new Date(dia, mes, ano);
		date.displayDate();

	}
}
