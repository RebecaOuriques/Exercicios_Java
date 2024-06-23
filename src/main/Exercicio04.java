package main;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n;
		double n1;
		double n2;
		
		System.out.println("Informe um número: ");
		n = sc.nextDouble();
		
		n1 = n - 1;
		n2 = n + 1;
		
		System.out.println("O antecessor é: " + n1 + "O sucessor é: " + n2 );
		
		sc.close();
		
		/*
		 * 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
		 */
	}

}
