package br.com.beecrowd;

/* Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os 
 * valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.*/

import java.util.Scanner;

public class Bee_1172_Substituição_em_Vetor_I {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		Integer[] valores = new Integer[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			numero = entrada.nextInt();
			
			if (numero >= 1) {
				valores[i] = numero;
			} else {
				valores[i] = 1;
			}
			
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("X[" + i + "] = " + valores[i]);
		}
		
		entrada.close();
	}
}
