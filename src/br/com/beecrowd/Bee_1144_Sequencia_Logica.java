package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1144_Sequencia_Logica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeroLinhas = entrada.nextInt();
		
		for (int i = 1 ; i <= numeroLinhas ; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.println(i + " " + (quadrado) + " " + (cubo));
			System.out.println(i + " " + (quadrado + 1) + " " + (cubo + 1));
			
		}
		
		entrada.close();
	}
}
