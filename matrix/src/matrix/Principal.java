package matrix;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o tamanho: ");
		int n1 = teclado.nextInt();
		System.out.print("Informe a largura: ");
		int n2 = teclado.nextInt();

		int[][] m = new int[n1][n2];

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {

				m[i][j] = teclado.nextInt();

			}

		}

		System.out.print("Informe um numero da matriz: ");

		int x = teclado.nextInt();

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j] == x) {
					System.out.print("Posição: " + i + ", " + j + ": ");

					if (j > 0) {
						System.out.print("Esquerda: " + m[i][j - 1]);
					}
					if (i > 0) {
						System.out.print("Direita: " + m[i][j + 1]);
					}
					if (j < m[i].length - 1) {
						System.out.print("Baixo: " + m[i][j + 1]);
					}
					if (i < m.length - 1) {
						System.out.print("Cima: " + m[i + 1][j]);
					}

				}
			}

		}
		teclado.close();
	}

}
