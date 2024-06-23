package main;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		/*17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau 
		 * Celsius. Imprima na tela as duas temperaturas. Fórmula: C = (5 * ( F-32) / 9)*/
		
		Scanner sc = new Scanner(System.in);
		
		int tempCel, tempFah;
		
		
		System.out.print("Informe a temperatura em Fahrenheit: ");
		tempFah = sc.nextInt();
		
		tempCel = (5 * (tempFah-32) / 9);
		
		System.out.printf("A temperatura em Celsius é: %d \nA temperatura em Fahrenheit é: %d " , tempCel, tempFah);

		
		sc.close();
		
	}
}
