package exercicio_1;

import java.util.Scanner;

public class Matriz {

	public void calculo(int a[][], int b[][]) {
		if (a[0].length != b.length) {
			System.out.println("não é possivel multiplica a matriz");

		} else {
			int x = a.length;
			int y = b[0].length;
			int[][] resultado = new int[x][y];

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < b.length; k++) {
						resultado[i][j] += a[i][k] * b[k][j];
					}

				}

			}
			for (int i = 0; i < resultado.length; i++) {
				for (int j = 0; j < resultado[0].length; j++) {
					System.out.print(resultado[i][j] + " ");
				}
				System.out.println();
			}

		}
	}

	static Scanner scan = new Scanner(System.in);

	public static int[][] input() {
		System.out.println("digite o numero de linhas: ");
		int x = scan.nextInt();
		System.out.println("digite o numero de colunas: ");
		int y = scan.nextInt();

		int[][] matriz = new int[x][y];
		int a = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("digite o valor da posição: " + a);
				matriz[i][j] = scan.nextInt();
				a++;
			}
		}
		return matriz;
	}

	public static void main(String[] args) {
		Matriz matriz = new Matriz();

		int[][] a = input();
		int[][] b = input();
		matriz.calculo(a, b);

	}

}
