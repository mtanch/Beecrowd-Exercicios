package br.com.beecrowd;

/* Faça um algoritmo para ler um valor A e um valor N. 
 * Imprimir a soma de A + i para cada i com os valores (0 <= i <= N-1). 
 * Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.*/

import java.util.Scanner;

public class Bee_1149_Somando_Inteiros_Consecutivos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valorA, valorN, soma = 0;
		
		valorA = entrada.nextInt();
		valorN = entrada.nextInt();
		
		while (valorN <= 0) {
			valorN = entrada.nextInt();
		}
		
		for (int i = 0 ; i < valorN ; i++) {
			soma += valorA;
			valorA += 1;
		}
		
		System.out.println(soma);
		
		entrada.close();
	}
}
