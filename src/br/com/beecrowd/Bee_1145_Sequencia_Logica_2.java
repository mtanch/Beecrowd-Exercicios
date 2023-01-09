package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1145_Sequencia_Logica_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x, y, contagem = 0;
		
		x = entrada.nextInt();
		y = entrada.nextInt();
		
		if (x >= 20) {
			//	1 < X < 20
			x = 19;
		}
		
		if (y < x) {
			//	X < Y < 100000
			y = 20;
		} else if (y >= 100000) {
			y = 99999;
		}
		
		do {
			
			for (int j = 0 ; j < x ; j++) {
				//	Quantidade da sequencia num�rica por linha informada no X
				System.out.print(++contagem);
				
				if (j < (x - 1)) {
					//	Garante que o espa�o fique apenas entre os n�meros, n�o no final da linha
					System.out.print(" ");
				}
				
			}
			System.out.println();
		} while (contagem < y);
		
		entrada.close();
	}
}
