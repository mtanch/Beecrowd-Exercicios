package br.com.beecrowd;

/* A seguinte sequ�ncia de n�meros 0 1 1 2 3 5 8 13 21... � conhecida como s�rie de Fibonacci. 
 * Nessa sequ�ncia, cada n�mero, depois dos 2 primeiros, � igual � soma dos 2 anteriores. 
 * Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros n�meros dessa s�rie.*/

import java.util.Scanner;

public class Bee_1151_Fibonacci_Facil {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, numAnterior = 0, numAtual = 1, backup;
		
//		O arquivo de entrada cont�m um valor inteiro N (0 < N < 46).
		numero = entrada.nextInt();
		
		if (numero > 45) {
			//	limitando numero maximo para 45;
			numero = 45;
		} else if (numero <= 0) {
			//	limitando numero minimo para 1;
			numero = 1;
		}
		
		System.out.print(numAnterior);
		
		for (int i = 1 ; i < numero ; i++) {
			System.out.print(" " + numAtual);
			//	salvando numAtual para atualizar o numAnterior;
			backup = numAtual;
			numAtual += numAnterior;
			numAnterior = backup;
		}
		
		System.out.println();
		
		entrada.close();
	}
}
