package main;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		boolean a = true;
		boolean b = false;
		
		System.out.println("Informe o primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.println("Informe o primeiro valor: ");
		n2 = sc.nextInt();
		
		if (n1 >= 0 && n2 >= 0) {	
			System.out.println("Esses números são positivo? " + a);
			
		} else {
			System.out.println("Esses números são positivo? " + b);
		}
		
		if (n1 % 2 == 0 && n2 % 2 == 0) {	
			System.out.println("Esses números são pares? " + a);
			
		} else {
			System.out.println("Esses números são pares? " + b);
		}			
		sc.close();
		
		/*
		 * 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
		 */
	}
}
