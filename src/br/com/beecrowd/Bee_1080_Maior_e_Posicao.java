package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1080_Maior_e_Posicao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor, maiorNumero = 0, posicao = 0;
		
		for(int i = 1 ; i <= 100 ; i++) {
			valor = entrada.nextInt();
			if (valor > maiorNumero) {
				maiorNumero = valor;
				posicao = i;
			}
		}
		
		System.out.println(maiorNumero);
		System.out.println(posicao);
		
		entrada.close();
	}

}
