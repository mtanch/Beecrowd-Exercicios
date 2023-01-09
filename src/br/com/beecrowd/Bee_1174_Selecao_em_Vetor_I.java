package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1174_Selecao_em_Vetor_I {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float numero;
		
		Float[] valores = new Float[100];
		
		for (int i = 0 ; i < 100 ; i++) {
			numero = entrada.nextFloat();
			valores[i] = numero;
		}
		
		for (int i = 0 ; i < 100 ; i++) {
			if (valores[i] <= 10) {
				System.out.printf("A[%d] = %.1f\n", i, valores[i]);
			}
		}
		entrada.close();
	}
}
