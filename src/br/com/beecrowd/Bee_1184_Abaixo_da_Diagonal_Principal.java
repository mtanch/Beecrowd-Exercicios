package br.com.beecrowd;

/* Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. 
 * Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão 
 * abaixo da diagonal principal da matriz.*/

import java.util.Scanner;

public class Bee_1184_Abaixo_da_Diagonal_Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//	Operações;
		float soma = 0, media = 0;
		Character operacao;
		
		Float[][] tabela = new Float[12][12];
		
		//	Recebe a letra da operação (S = soma / M = media);
		operacao = entrada.nextLine().charAt(0);
		
		boolean ehSoma = operacao.equals('S');
		boolean ehMedia = operacao.equals('M');
		
		//	Atribui valores à matriz;
		for (int l = 0 ; l < 12 ; l++) {
			for (int c = 0 ; c < 12 ; c++) {
				tabela[l][c] = entrada.nextFloat();
			}
		}
		
		for (int l = 1 ; l < 12 ; l++) {
			for (int c = 0 ; c < l ; c++) {
				//	Somando os respectivos valores da tabela;
				soma += tabela[l][c];
			}
		}
		
		if (ehSoma) {
			System.out.printf("%.1f\n", soma);
		} else if (ehMedia) {
			media = soma / 66;
			System.out.printf("%.1f\n", media);
		}
		
		entrada.close();
	}
}
