package main;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n;
		double n2;
		double sal = 1293.20;
		System.out.println("Informe seu salário: ");
		n = sc.nextDouble();
		
		n2 = n / sal;
		
		System.out.println("Esse usuário ganha " + Math.round(n2) + " salários mínimos");
		
		sc.close();
		
		/*
		 * 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos 
		 * salários mínimos esse usuário ganha e  imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
		 */
	}

}
