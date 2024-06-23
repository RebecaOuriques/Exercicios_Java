package main;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int numero2;
		int numero3;
		int soma;
		
		System.out.println("Digite o primeiro número: ");
		numero = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		numero3 = sc.nextInt();
				
		soma = numero + numero2;
		
		if(soma > numero3){
		     
		     System.out.println("É maior");;
		 
		} else {
		 
		     System.out.println("É menor que");
		}
		
		System.out.println("A soma é: " + soma );
		
		sc.close();
		
		/*1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre 
		 * se a soma é menor que C.
		 * 
		 */
	}

}
