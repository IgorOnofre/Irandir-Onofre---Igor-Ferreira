package exercicio_216;
import java.util.Scanner;

public class Exercicio_216 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Informe um n�mero: ");
		num1 = input.nextInt();
		
		System.out.print("Informe outro n�mero: ");
		num2 = input.nextInt();
		
		if(num1>num2){
			System.out.println(num1 + " � o maior!");
		}else if(num2>num1){
			System.out.println(num2 + " � o maior!");
		}else if(num1 == num2){
			System.out.println("Os dois n�meros s�o iguais!");
		}
	}	
}
