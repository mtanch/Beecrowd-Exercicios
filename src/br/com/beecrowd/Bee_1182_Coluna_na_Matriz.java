package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1182_Coluna_na_Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int coluna;
		Character operacao;
		float soma = 0, media = 0;
		
		Float[][] tabela = new Float[12][12];
		
		coluna = entrada.nextInt();
		entrada.nextLine();	//	Buffering
		operacao = entrada.nextLine().charAt(0);
		
		for (int l = 0 ; l < 12 ; l++) {
			for (int c = 0 ; c < 12 ; c++) {
				tabela[l][c] = entrada.nextFloat();
			}
		}
		
		if (operacao.equals('S')) {	
			for (int i = 0 ; i < 12 ; i++) {
				soma += tabela[i][coluna];
			}
			System.out.printf("%.1f\n", soma);
			
		} else if (operacao.equals('M')) {
			for (int i = 0 ; i < 12 ; i++) {
				soma += tabela[i][coluna];
			}
			media = soma / 12;
			System.out.printf("%.1f\n", media);
		}
		entrada.close();
	}

}
