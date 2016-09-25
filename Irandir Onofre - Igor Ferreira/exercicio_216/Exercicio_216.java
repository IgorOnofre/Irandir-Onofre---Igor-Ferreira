package exercicio_216;
import java.util.Scanner;

public class Exercicio_216 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Informe um número: ");
		num1 = input.nextInt();
		
		System.out.print("Informe outro número: ");
		num2 = input.nextInt();
		
		if(num1>num2){
			System.out.println(num1 + " é o maior!");
		}else if(num2>num1){
			System.out.println(num2 + " é o maior!");
		}else if(num1 == num2){
			System.out.println("Os dois números são iguais!");
		}
	}	
}
