package main;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int contador, multiplicador;
		System.out.print("Qual número você deseja saber a tabuada? ");
		contador = sc.nextInt();
		System.out.println("Essa é a tabuada do número " + contador + ".");
		System.out.println();
		
		
		for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
					System.out.println( contador + " X " + multiplicador + " = " + contador * multiplicador);
				}
	
		sc.close();
		
	}
}
