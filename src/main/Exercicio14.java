package main;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		
		System.out.print("Informe um para A: ");
		a = sc.nextDouble();
		System.out.print("Informe um para B: ");
		b = sc.nextDouble();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("O valor atual de A é: " + a);
		System.out.println("O valor atual de B é: " + b);
		
		/*
		 * 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B
		 *  e o valor de B por A e imprima na tela os valores.
		 */
		sc.close();

	}
}
