package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		Float weight = (float) 0, high = (float) 0, imc = (float) 0;
		String name = "";
		
		System.out.print("Informe seu nome: ");
		name = sc.next();
		System.out.print("Informe seu peso: ");
		weight = sc.nextFloat();
		System.out.print("Informe sua altura: ");
		high = sc.nextFloat();
		
		imc = weight / (high * high);
		
		if (imc < 18.5) {
			System.out.println( name + ", seu IMC é: "+ df.format(imc) + ". Você está Abaixo do peso (atenção)");
		} else if (imc > 18.5 && imc < 25) {
			System.out.println( name + ", seu IMC é: "+ df.format(imc) + ". Você está no Peso ideal (parabéns) ");
		} else if (imc > 25 && imc < 30) {
			System.out.println( name + ", seu IMC é: "+ df.format(imc) + ". Você está Levemente acima do peso (cuidado)");
		} else if (imc > 30 && imc < 35) {
			System.out.println( name + ", seu IMC é: "+ df.format(imc) + ". Você está Obesidade grau I (leve)");
		} else if (imc > 35 && imc < 40) {
			System.out.println( name + ", seu IMC é: "+ df.format(imc) + ". Você está Obesidade grau II (severa)");
		} else if(imc >= 40 ) {
			System.out.print( name + ", seu IMC é: "+ df.format(imc) + ". Você está Obesidade grau III (mórbida)");
		}
		
		sc.close();
		
		/*Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição 

			de acordo com a tabela abaixo:
			
			Fórmula do IMC = peso / (altura) ²
			
			Tabela Condições IMC
			
			 Abaixo de 18,5   | Abaixo do peso          
			
			 Entre 18,6 e 24,9 | Peso ideal (parabéns)  
			
			 Entre 25,0 e 29,9 | Levemente acima do peso
			
			 Entre 30,0 e 34,9 | Obesidade grau I 
			
			 Entre 35,0 e 39,9 | Obesidade grau II (severa)
			
			 Maior ou igual a 40 | Obesidade grau III (mórbida) 
		 */
	}
}
