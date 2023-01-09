package br.com.beecrowd;

/*Ler um número inteiro N e calcular todos os seus divisores.*/

import java.util.Scanner;

public class Bee_1157_Divisores_I {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			boolean inteiro = numero % i == 0;
			
			if (inteiro) {
				System.out.println(i);
			}
		}
		
		entrada.close();
	}

}
