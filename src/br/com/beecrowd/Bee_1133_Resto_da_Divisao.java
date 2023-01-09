package br.com.beecrowd;

import java.util.Scanner;

/*Escreva um programa que leia 2 valores X e Y e que imprima todos os valores 
 * entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.*/

public class Bee_1133_Resto_da_Divisao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x, y;
		
		boolean restoDois, restoTres;

		x = entrada.nextInt();
		y = entrada.nextInt();
		
		boolean xMaiorQueY = x > y;
		boolean yMaiorQueX = x < y;
		
		if (xMaiorQueY) {
			for (int i = (y + 1) ; i < x ; i++) {	//	(y + 1) pois são considerados apenas os resultados ENTRE X e Y, desconsiderando os mesmos
				restoDois = i % 5 == 2;
				restoTres = i % 5 == 3;
				
				if (restoDois || restoTres) {
					System.out.println(i);
				}
			}
		} else if (yMaiorQueX) {
			for (int i = (x + 1) ; i < y ; i++) {	//	(y + 1) pois são considerados apenas os resultados ENTRE X e Y, desconsiderando os mesmos
				restoDois = i % 5 == 2;
				restoTres = i % 5 == 3;
				
				if (restoDois || restoTres) {
					System.out.println(i);
				}
			}
		}
		entrada.close();
	}
}
