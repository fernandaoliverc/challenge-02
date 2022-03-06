package br.com.capgemini.questao02;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[] { 1, 5, 3, 4, 2 };
		int soma = 0;

		System.out.print("Array de entrada: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}

		System.out.println("\n");
		System.out.print("Informe o valor de x: ");
		int x = scan.nextInt();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] - array[j] == x) {
					soma += 1;
					System.out.print("[" + array[i] + "," + array[j] + "]");
				}

			}

		}

		System.out.println("\nExistem " + soma + " pares de inteiros.");

	}

}
