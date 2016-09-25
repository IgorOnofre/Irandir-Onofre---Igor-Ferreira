package exercicio_225;

import java.util.Scanner;

public class Exercicio225 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite um numero ");
		int n = scan.nextInt();
		if (n % 2 == 0) {
			System.out.println("é par");
		}else{
			System.out.println("é impar ");
		}

	}

}
