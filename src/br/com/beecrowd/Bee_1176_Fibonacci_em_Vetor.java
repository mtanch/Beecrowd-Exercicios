package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1176_Fibonacci_em_Vetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		long casos, numero, valorAnterior = 0, valorAtual = 1, backup = 0;
		
		//	N� de casos;
		casos = entrada.nextInt();
		
		for (int i = 0 ; i < casos ; i++) {
			//	numero de vezes que o la�o vai rodar;
			numero = entrada.nextInt();

			if (numero == 0) {
				System.out.println("Fib(" + numero + ") = " + numero);
			} else if (numero == 1) {
				System.out.println("Fib(" + numero + ") = " + numero);
			} else {
				for (int j = 1 ; j < numero ; j++) {
					//	Backup para n�o perder o valorAtual e atualizar o valorAnterior;
					backup = valorAtual;
					valorAtual += valorAnterior;
					valorAnterior = backup;
				}
				//	Printando resultado;
				System.out.println("Fib(" + numero + ") = " + valorAtual);
			}
			valorAnterior = 0;	//	reset
			valorAtual = 1;		//	reset
		}
		entrada.close();
	}
}
