package main;

import java.util.Scanner;

public class Exercicio16 {
	 /*16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo 
	  * 	e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.  */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.print("Informe o primeiro valor: " );
		a = sc.nextInt();
		System.out.print("Informe o segundo valor: " );
		b = sc.nextInt();
		System.out.print("Informe o terceiro valor: " );
		c = sc.nextInt();
				
			if (a == b || a == c) {
				System.out.println("Seu triângulo é equilátero.");
			} else if (a != b || b != c | a != c) {
				System.out.println("Seu triângulo é escaleno.");
			} else {
				System.out.println("Seu triângulo é isósceles");
			}
		
				sc.close();
	}
}
