package br.com.beecrowd;

/* A primeira linha de entrada contem um n�mero L (0 <= L <= 11) 
 * indicando a linha que ser� considerada para opera��o. 
 * A segunda linha de entrada cont�m um �nico caractere 
 * Mai�sculo T ('S' ou 'M'), indicando a opera��o (Soma ou M�dia) 
 * que dever� ser realizada com os elementos da matriz. 
 * Seguem os 144 valores de ponto flutuante que comp�em a matriz, 
 * sendo que a mesma � preenchida linha por linha, 
 * da linha 0 at� a linha 11, sempre da esquerda para a direita.*/

import java.util.Scanner;

public class Bee_1181_Linha_na_Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int linha;
		Character operacao;
		float soma = 0, media = 0;
		
		Float[][] tabela = new Float[12][12];
		
		linha = entrada.nextInt();
		entrada.nextLine();	//	Buffering
		operacao = entrada.nextLine().charAt(0);
		
		for (int l = 0 ; l < 12 ; l++) {
			for (int c = 0 ; c < 12 ; c++) {
				tabela[l][c] = entrada.nextFloat();
			}
		}
		
		if (operacao.equals('S')) {	
			for (int i = 0 ; i < 12 ; i++) {
				soma += tabela[linha][i];
			}
			System.out.printf("%.1f\n", soma);
			
		} else if (operacao.equals('M')) {
			for (int i = 0 ; i < 12 ; i++) {
				soma += tabela[linha][i];
			}
			media = soma / 12;
			System.out.printf("%.1f\n", media);
		}
		entrada.close();
	}

}
