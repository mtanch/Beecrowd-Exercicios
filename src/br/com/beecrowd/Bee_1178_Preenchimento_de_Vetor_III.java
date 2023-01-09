package br.com.beecrowd;

/* Leia um valor X. Coloque este valor na primeira posição de um vetor N[100]. 
 * Em cada posição subsequente de N (1 até 99), coloque a metade do valor 
 * armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.*/

import java.util.Scanner;

public class Bee_1178_Preenchimento_de_Vetor_III {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//	Valor que vai receber a entrada;
		double x;
		
		x = entrada.nextDouble();
		
		//	Vetor que vai armazenar os resultados das divisões;
		Double[] vetor = new Double[100];
		
		//	Primeiro valor atribuído ao vetor;
		vetor[0] = x;
		
		//	Calculando os valores e incluindo o resultado em suas respectivas posições no vetor;
		for (int i = 1 ; i < 100 ; i++) {
			//	Sempre vai ser a metade do valor atual 'x';
			x /= 2;
			//	Atribuindo 'x' ao vetor;
			vetor[i] = x;
		}
		
		//	Índice necessário para imprimir os valores do vetor;
		int i = 0;
		
		for (Double valor : vetor) {
			//	Imprimindo todos os valores do vetor;
			System.out.printf("N[%d] = %.4f\n", i, valor);
			//	Incrementando o valor do índice;
			i++;
		}
		entrada.close();
	}

}
