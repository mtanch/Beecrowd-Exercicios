package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1186_Abaixo_da_Diagonal_Secundaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float soma = 0, media = 0;
		Character operacao;
		boolean ehSoma, ehMedia;
		
		Float[][] tabela = new Float[12][12];
		
		operacao = entrada.nextLine().charAt(0);
		
		ehSoma = operacao.equals('S');
		ehMedia = operacao.equals('M');
		
		for (int l = 0 ; l < 12 ; l++) {
			for (int c = 0 ; c < 12 ; c++) {
				tabela[l][c] = entrada.nextFloat();
			}
		}
		
		for (int l = 1 ; l < 12 ; l++) {
			for (int c = (12 - l) ; c < 12 ; c++) {
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
