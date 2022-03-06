package br.com.capgemini.questao01;

import java.util.Arrays;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[] { 9, 2, 1, 4, 6 };

		System.out.print("Entrada: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}

		Arrays.sort(array);
		int aux = array.length / 2;
		int mediana = array[aux];
		System.out.println();
		System.out.println("Saída: " + mediana);

	}

}
