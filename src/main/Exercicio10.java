package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	/*
	 * 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na
	 * tela a média das notas.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		double n1 = 0, n2 = 0, n3 = 0, media = 0;
		String name;

		System.out.print("Informe o nome do aluno(a): ");
		name = sc.nextLine();
		System.out.println("Informe as notas: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();

		media = (n1 + n2 + n3) / 3;

		System.out.println("A média de notas do(a) aluno(a) " + name + " é " + df.format(media) + ".");
		sc.close();
	}

}
