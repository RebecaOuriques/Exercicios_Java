package main;

public class Exercicio19 {

	public static void main(String[] args) {
		// 19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
		
		
		int contador, multiplicador;
		
		System.out.println("Segue tabuada:");		
		
		for (contador = 1; contador <= 10; contador++) {
			System.out.println();
			System.out.println("Tabuada do " + contador);
			for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
				System.out.println( contador + " X " + multiplicador + " = " + contador * multiplicador);
			} 
				
	}
		
	}
}
