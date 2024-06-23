package main;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o
	 * número é par ou ímpar, positivo ou negativo.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;

		System.out.print("Informe um número: ");
		number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("é um número par");
		} else {
			System.out.println("é um número ímpar");
		}

		if (number >= 0) {
			System.out.println("é um número positivo");
		} else {
			System.out.println("é um número negativo");
		}

		sc.close();
	}

}
