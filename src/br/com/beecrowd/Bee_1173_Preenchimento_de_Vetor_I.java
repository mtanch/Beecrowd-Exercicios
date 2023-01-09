package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1173_Preenchimento_de_Vetor_I {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Integer[] valores = new Integer[10];
		
		int numero = entrada.nextInt();
		
		if (numero > 50) {
			numero = 50;
		}
		
		valores[0] = numero;
		System.out.println("N[" + 0 + "] = " + valores[0]);
		
		for (int i = 1 ; i < 10 ; i++) {
			valores[i] = numero * 2;
			numero *= 2;
			System.out.println("N[" + i + "] = " + valores[i]);
		}
		entrada.close();
	}

}
