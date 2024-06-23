package main;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n;
		double n1;
		double n2;
		
		
		System.out.println("Informe um valor: ");
		n = sc.nextDouble();
		
		n1 = n * 0.05;
		n2 = n1 + n;
		System.out.println("O novo valor é: " + n2);
		
		sc.close();
		/*
		 * 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
		 */
	}

}
