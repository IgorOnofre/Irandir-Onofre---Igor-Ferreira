package exercicio_224;
import java.util.Scanner;

public class Exercicio_224 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		int maior;
		int menor;
		
		System.out.print("Informe o 1º número: ");
		num = input.nextInt();
		maior = num;
		menor = num;
		
		for(int x = 1; x<5; x++){
			System.out.print("Informe o " + (x+1) + "º número: ");
			num = input.nextInt();
			
			if(num>maior){
				maior = num;
			}
			if(num<menor){
				menor = num;
			}
		}
		
		System.out.println("\nMaior número: " + maior);
		System.out.println("Menor número: " + menor);
	}
}
