package main;

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float valorHoraAula, numeroAulas, percentualINSS, salarioLiquido,salarioBruto;
		String professor;
		
		System.out.print("Informe o nome do(a) professor(a): ");
		professor = sc.next();
		System.out.print("Informe o número de aulas lecionadas: ");
		numeroAulas = sc.nextFloat();
		System.out.print("Informe o valor da hora/aula: ");
		valorHoraAula = sc.nextFloat();
		System.out.print("Informe o percentual de desconto do INSS: ");
		percentualINSS = sc.nextFloat();
		
		salarioBruto = (valorHoraAula * numeroAulas);
		salarioLiquido = salarioBruto - (( percentualINSS / 100) * salarioBruto);
		
		System.out.printf("O salário líquido do(a) professor(a) %s é : R$ %.2f ", professor, salarioLiquido);
		sc.close();
	}
}
