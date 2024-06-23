package main;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		
		System.out.println("Informe o primeiro número: ");
		number1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		number2 = sc.nextInt();
		
		if(number1 == number2) {
			number3 = number1 + number2;
			System.out.println("A soma dos valores é: " + number3);
		} else {
			number3 = number1 * number2;
			System.out.println("A multiplicação é: " + number3);
		}
			
		sc.close();
		/*
		 * 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, 
		 * 		deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos 
		 * 		cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
		 */
	}

}
