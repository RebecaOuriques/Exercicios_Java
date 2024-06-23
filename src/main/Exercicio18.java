package main;

public class Exercicio18 {

	public static void main(String[] args) {
		/*
		 * 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem
		 * 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima
		 * na tela em quantos anos serão necessários para que Sara seja maior que
		 * Francisco.
		 */

		double altFrancisco = 1.50;
		double altSara = 1.10;
		int contador = 0;

		while (altSara < altFrancisco) {

			altFrancisco = altFrancisco + 0.02;
			altSara = altSara + 0.03;
			contador++;
		}

		System.out.println("Levaram " + contador + " anos para Sara ficar maior que Francisco.");
		System.out.printf("Altura de Francisco é: %.02f\n", altFrancisco);
		System.out.printf("Altura de Sara  é: %.02f\n", altSara);

	}

}
