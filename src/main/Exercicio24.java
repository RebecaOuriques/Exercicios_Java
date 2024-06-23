package main;

import java.util.Scanner;

public class Exercicio24 {

	/*
	 * 24 - Faça um algoritmo que calcule a quantidade de litros de combustível
	 * gastos em uma viagem, sabendo que o carro faz 12km com um litro o usuário
	 * deverá fornecer o tempo gasto na viagem e a sua velocidade média. E retornar
	 * a distância percorrida e a quantidade de litros utilizados para fazer a
	 * viagem. Fórmula: distância = tempo x velocidade. litros usados = distância /
	 * 12
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tempo = 0, velocidadeMedia = 0;
		float quantidadeLitros = 0, distanciaPercorrida;
		String pontoDePartida, destino;

		System.out.println("Informe o seu ponto de partida: ");
		sc.skip("\\R?");
		pontoDePartida = sc.nextLine();
		System.out.println("Informe o seu destino: ");
		sc.skip("\\R?");
		destino = sc.nextLine();
		System.out.println("Informe a velocidade média: ");
		velocidadeMedia = sc.nextInt();
		System.out.println("Informe o tempo gasto: ");
		tempo = sc.nextInt();

		distanciaPercorrida = tempo * velocidadeMedia;
		quantidadeLitros = distanciaPercorrida / 12;

		System.out.printf("Você gastou %.2f litros nessa viagem.", quantidadeLitros);
		System.out.println("\nPara chegar em " + destino + " saindo de " + pontoDePartida + " com velocidade média de "
				+ velocidadeMedia + " km/h,\nvocê levará " + tempo + "h e terá percorrido " + distanciaPercorrida
				+ "km");

		sc.close();
	}
}
