package exercicio_232;

import java.util.Scanner;

public class Exercicio_232 {
	public static int[] contandoNumeros(int[] lista){
		
		int contPositivo = 0;
		int contNegativo = 0;
		int contZero = 0;
		
		
		for(int x = 0; x<5; x++){
			if(lista[x]>0){
				contPositivo++;
			}else if(lista[x]<0){
				contNegativo++;
			}else{
				contZero++;
			}
		}
		int[] listaRetorno = {contPositivo, contNegativo, contZero};
		return listaRetorno;
		
	}
	
	//M�todo principal
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int[] listaEntradas = new int[5];
			for(int x = 0; x<5; x++){
				System.out.print("Informe o " + (x+1) + "� n�mero: ");
				listaEntradas[x] = input.nextInt();
			}
			
			int[] listaFinal = contandoNumeros(listaEntradas);
			System.out.println("Foram inseridos: " + listaFinal[0] + " n�meros positivos.");
			System.out.println("Foram inseridos: " + listaFinal[1] + " n�meros negativos.");
			System.out.println("Foram inseridos: " + listaFinal[2] + " n�meros zero.");
		}
}