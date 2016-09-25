package exercicio_215;
import java.util.Scanner;

public class Exercicio_215 {
	
	//soma
	public static int soma(int x, int y){
		int soma = x + y;
		return soma;
	}
	
	//subtração
	public static int subtracao(int x, int y){
		int subtracao = x - y;
		return subtracao;
	}
	
	//multiplicação
	public static int multiplicacao(int x, int y){
		int multiplicacao = x * y;
		return multiplicacao;
	}
	
	//divisão
	public static double divisao(int x, int y){
		double divisao = (double)(x) / y;
		return divisao;
	}
	
	//Método principal
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Informe um número qualquer: ");
		num1 = input.nextInt();
		
		System.out.print("Informe outro número qualquer: ");
		num2 = input.nextInt();
		
		System.out.println("\nSoma: " + num1 + " + " + num2 + " = " + soma(num1,num2));
		System.out.println("Subtração: " + num1 + " - " + num2 + " = " + subtracao(num1,num2));
		System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + multiplicacao(num1,num2));
		System.out.println("Divisão: " + num1 + " / " + num2 + " = " + divisao(num1,num2));
	}
	
}
