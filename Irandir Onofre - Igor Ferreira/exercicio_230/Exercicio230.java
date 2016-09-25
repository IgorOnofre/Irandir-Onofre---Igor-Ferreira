package exercicio_230;

import java.util.Scanner;

public class Exercicio230 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite um numero de cinco digitos ");
		String a = scan.nextLine();
		char[] array = a.toCharArray();
		System.out.println(array[0]+"   "+array[1]+"   "+array[2]+"   "+array[3]+"   "+array[4]);
		

	}

}
