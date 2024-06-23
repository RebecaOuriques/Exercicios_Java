package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String product, type;
		Double value, fvalue = 0.0;
		int vezes;
		
		value = 0.0;
		fvalue = 0.0;
		vezes = 0;
		
		System.out.print("Informe o produto: ");
		product = sc.nextLine();
		System.out.print("Informe o valor do produto: ");
		value = sc.nextDouble();
		System.out.println("O valor do produto " + product +" é " + value);
		System.out.print("Informe a forma de pagamento: A) Dinheiro, B) Pix ou C) Cartão de Crédito?  ");
		type = sc.next();
		
		if (type.equals("A") || type.equals("a") ||type.equals("B") || type.equals("b") ) {
			fvalue = value - (value * 0.15);
			System.out.print("O valor a ser pago é " + df.format(fvalue) + ".");
		} else if (type.equals("C") || type.equals("c") ) {
			System.out.print("A) Á vista ou B) Parcelado? ");
			type = sc.next(); 			
			if(type.equals("A") || type.equals("a") ) {
				fvalue = value - (value * 0.10);
				System.out.print("O valor a ser pago é " + df.format(fvalue) + ".");
			} else if (type.equals("B") || type.equals("b") ) {
				System.out.print("Em quantas vezes? ");
				vezes = sc.nextInt();
				
				if (vezes <= 1) {
					fvalue = value - (value * 0.10);
					System.out.print("O valor a ser pago é " + df.format(fvalue) + ".");
				}  else if (vezes <= 2) {
					fvalue = value;
				System.out.print("O valor a ser pago é " + df.format(fvalue) + ".");
				} else if (vezes >= 3) 
				{
					fvalue = value + (value * 0.10);
					System.out.print("O valor a ser pago é " + df.format(fvalue) + ".");
				}
			}
		}
		
		/*
		  	12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, 
		  	conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a 
		  	ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

			 Tabela de Código de Condições de Pagamento 
			
			 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
			
			 2 - À Vista no cartão de crédito, recebe 10% de desconto
			
			 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
			
			 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
		 */
		sc.close();
	}
}
