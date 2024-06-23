package main;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio15 {

	
	/* 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa já viveu. 
	 * Leve em consideração o ano com 365 dias e o mês com 30 dias. (Ex: 5 anos, 2 meses e 15 dias de vida) */

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		String born;	
		System.out.print("Informe sua data de nascimento dd/mm/aaaa: ");
		born = sc.next();
		
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dt1 = LocalDate.parse(born, dateFormat);
			LocalDate dt2 = LocalDate.now();
			Period periodo = Period.between(dt1,dt2);
			
			int dias = periodo.getDays();
			int meses = periodo.getMonths();
			int anos = periodo.getYears();
			
			System.out.println("Você viveu "+ anos + " anos, " + meses +" meses e " + dias + " dias de vida.");	
			sc.close();
		}
}
