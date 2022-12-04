package br.com.beecrowd;

import java.util.Scanner;

/*	Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

	Saída
Imprima a soma de todos valores ímpares entre X e Y.*/

public class Bee_1099_Soma_de_Impares_Consecutivos_II {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numDeCasos, x, y;
		
		numDeCasos = entrada.nextInt();
		Integer[] resultadoSoma = new Integer[numDeCasos];
		
		for (int i = 0 ; i < numDeCasos ; i++) {
			
			resultadoSoma[i] = 0;
			
			x = entrada.nextInt();
			y = entrada.nextInt();
			
			for (int j = (x + 1) ; j < y ; j++) {
				
				boolean impar = j % 2 != 0;
				
				if (impar) {
					resultadoSoma[i] += j;
				}
			}
			for (int j = y + 1 ; j < x ; j++) {
				
				boolean impar = j % 2 != 0;
				
				if (impar) {
					resultadoSoma[i] += j;
				}
			}
		}
		entrada.close();
		for (int i = 0 ; i < numDeCasos ; i++) {
			System.out.println(resultadoSoma[i]);
		}
	}
}
