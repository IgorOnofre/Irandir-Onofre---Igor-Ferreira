package exercicio_224;
import java.util.Scanner;

public class Exercicio_224 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		int maior;
		int menor;
		
		System.out.print("Informe o 1� n�mero: ");
		num = input.nextInt();
		maior = num;
		menor = num;
		
		for(int x = 1; x<5; x++){
			System.out.print("Informe o " + (x+1) + "� n�mero: ");
			num = input.nextInt();
			
			if(num>maior){
				maior = num;
			}
			if(num<menor){
				menor = num;
			}
		}
		
		System.out.println("\nMaior n�mero: " + maior);
		System.out.println("Menor n�mero: " + menor);
	}
}
