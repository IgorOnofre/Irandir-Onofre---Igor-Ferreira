package exercicio_215;
import java.util.Scanner;

public class Exercicio_215 {
	
	//soma
	public static int soma(int x, int y){
		int soma = x + y;
		return soma;
	}
	
	//subtra��o
	public static int subtracao(int x, int y){
		int subtracao = x - y;
		return subtracao;
	}
	
	//multiplica��o
	public static int multiplicacao(int x, int y){
		int multiplicacao = x * y;
		return multiplicacao;
	}
	
	//divis�o
	public static double divisao(int x, int y){
		double divisao = (double)(x) / y;
		return divisao;
	}
	
	//M�todo principal
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Informe um n�mero qualquer: ");
		num1 = input.nextInt();
		
		System.out.print("Informe outro n�mero qualquer: ");
		num2 = input.nextInt();
		
		System.out.println("\nSoma: " + num1 + " + " + num2 + " = " + soma(num1,num2));
		System.out.println("Subtra��o: " + num1 + " - " + num2 + " = " + subtracao(num1,num2));
		System.out.println("Multiplica��o: " + num1 + " * " + num2 + " = " + multiplicacao(num1,num2));
		System.out.println("Divis�o: " + num1 + " / " + num2 + " = " + divisao(num1,num2));
	}
	
}
