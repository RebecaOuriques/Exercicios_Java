package main;

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2, quociente, resto;
		
		System.out.print("Informe o primeiro número (dividendo): ");
		n1 = sc.nextInt();
		System.out.print("Informe o segundo número (divisor): ");
		n2 = sc.nextInt();
		
		quociente = n1 / n2;
		resto = n1 % n2 ;
		
		System.out.println("O quociente é: " + quociente);
		System.out.println("O resto da divisão é: " + resto);
			
		sc.close();
		
	}
}
