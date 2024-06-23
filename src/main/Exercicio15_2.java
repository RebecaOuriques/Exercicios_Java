package main;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio15_2 {

	/*15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa já viveu. 
	 * Leve em consideração o ano com 365 dias e o mês com 30 dias. (Ex: 5 anos, 2 meses e 15 dias de vida). */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		
		int bornYear, bornMonth, bornDay, year, month, day;
		day = calendar.get(Calendar.DAY_OF_MONTH);
		month = calendar.get(Calendar.MONTH);
		year = calendar.get(Calendar.YEAR);
		
		System.out.print("Informe o dia do seu nascimento: ");
		bornDay = sc.nextInt();
		System.out.print("Informe o mês do seu nascimento: ");
		bornMonth = sc.nextInt();
		System.out.print("Informe o ano do seu nascimento: ");
		bornYear = sc.nextInt();
		
		
		int years = year - bornYear;
		int months = month - bornMonth;
		int days = day - bornDay;
		
		if(months < 0 ) {
			years = years-1;
			months = months + 12;			
		}
		if (days < 0) {
			days = days + 30;
		}
		
		//System.out.println("Hoje é dia: " + sdf.format(hoje.getTime()));
		System.out.println("Você viveu " + years + " anos, " + months + " meses e " + days + " dias de vida.");
		
		sc.close();
	}
}
