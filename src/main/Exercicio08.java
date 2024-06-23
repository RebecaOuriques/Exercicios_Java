package main;

import java.util.Scanner;

public class Exercicio08 {
	/*
	 * 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na
	 * tela os valores em ordem decrescente.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;

		System.out.print("Informe o primeiro número: ");
		n1 = sc.nextInt();
		System.out.print("Informe o segundo número: ");
		n2 = sc.nextInt();
		System.out.print("Informe o terceiro número: ");
		n3 = sc.nextInt();

		if (n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.println("Segue em ordem decrescente : " + n1 + ", " + n2 + ", " + n3);
		} else if (n1 > n2 && n1 > n3 && n3 > n2) {
			System.out.println("Segue em ordem decrescente : " + n1 + ", " + n3 + ", " + n2);
		} else if (n2 > n1 && n2 > n3 && n1 > n3) {
			System.out.println("Segue em ordem decrescente : " + n2 + ", " + n1 + ", " + n3);
		} else if (n2 > n1 && n2 > n3 && n3 > n1) {
			System.out.println("Segue em ordem decrescente : " + n2 + ", " + n3 + ", " + n1);
		} else if (n3 > n1 && n3 > n2 && n2 > n1) {
			System.out.println("Segue em ordem decrescente : " + n3 + ", " + n2 + ", " + n1);
		} else if (n3 > n1 && n3 > n2 && n1 > n2) {
			System.out.println("Segue em ordem decrescente : " + n3 + ", " + n1 + ", " + n2);
		}

		sc.close();

	}
}
