package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {
	
	/*
	 *  11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, 
	 *  imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado
	 *   sua média final deve ser maior ou igual a 7.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		String name;
		double n1,n2,n3,n4,media;
		
		System.out.print("Informe o nome do aluno(a): ");
		name = sc.nextLine();
		System.out.println("Informe as notas :");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if (media >= 7) {
			System.out.println("O aluno " + name + " foi " + "Aprovado, com média " + df.format(media));
		} else {
			System.out.println("O aluno " + name + " foi " + "Reprovado, com média " + df.format(media));
		}
		
		sc.close();
		
	}

}
