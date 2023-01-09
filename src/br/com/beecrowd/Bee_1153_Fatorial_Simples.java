package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1153_Fatorial_Simples {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		for (int i = numero ; i > 1; i--) {
			numero *= (i - 1);
		}
		
		System.out.println(numero);
		
		entrada.close();
	}

}
