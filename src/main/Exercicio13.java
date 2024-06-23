package main;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("Informe seu nome: ");
		name = sc.next();
		System.out.print("Informe a sua idade: ");
		age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println(name +" você é maior de idade");
		} else {
			System.out.println(name +" você é menor de idade");
		}
		

		sc.close();
		
		/* 13 - Faça algoritmo que leia o nome e a idade de uma pessoa
		 *  e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
		 */
	}

}
