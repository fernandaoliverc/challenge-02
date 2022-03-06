package br.com.capgemini.questao03;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int calcMin = Integer.MAX_VALUE;

		System.out.print("Entrada: ");
		String frase = scan.nextLine().replaceAll("[^0-9a-zA-Z]+", "");

		int tamF = frase.length();
		int raizF = (int) Math.sqrt(Math.sqrt(tamF));
		int raizFA = (int) Math.ceil(Math.sqrt(tamF));

		int x = 0, y = 0;
		for (int i = raizF; i <= raizFA; i++) {
			for (int j = raizF; j <= raizFA; j++) {
				if (i * j >= tamF) {
					if (calcMin >= i * j) {
						x = Math.min(i, j);
						y = Math.max(i, j);
					}
					calcMin = Math.min(calcMin, i * j);
				}
			}
		}
		char[][] grid = new char[x][y];
		int indice = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (indice < frase.length()) {
					grid[i][j] = frase.charAt(indice++);
				} else {
					grid[i][j] = ' ';
				}
			}
		}

		System.out.print("Saída: ");
		for (int j = 0; j < grid[0].length; j++) {
			for (int i = 0; i < grid.length; i++) {
				if (grid[i][j] != ' ') {
					System.out.print(grid[i][j]);

				}

			}
			System.out.print("   ");
		}
	}
}
