package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1142_PUM {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeroLinhas, contagem = 0;
		
		numeroLinhas = entrada.nextInt();
		
		for (int i = 0 ; i < numeroLinhas ; i++) {
			//	Número de linhas
			for (int j = 0 ; j <= 3 ; j++) {
				//	Define a contagem
				contagem++;
				
				if (j == 3) {
					//	Para que haja um salto no quarto número antes da proxima linha
					//	Ex.: 1 2 3 PUM
					//		 5 6 7 PUM
					// 		 . . . PUM
					break;
				}
				
				System.out.print((contagem) + " ");
			}
			//	"PUM" fora do laço para que não interfira na sequencia dos três números
			System.out.println("PUM");
		}
		entrada.close();
	}

}
