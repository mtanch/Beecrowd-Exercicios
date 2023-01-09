package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1180_Menor_e_Posicao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n, numero, menor = 0, posicao = 0;
		
		//	Tamanho do vetor X;
		n = entrada.nextInt();
		
		//	'n' é Maior que 1 e menor que 1000;
		if (n <= 1) {
			n = 2;
		} else if (n > 999) {
			n = 999;
		}
		
		Integer[] x = new Integer[n];
		
		for (int i = 0 ; i < n ; i++) {
			//	Recebendo e atribuindo os valores no vetor 'x';
			numero = entrada.nextInt();
			x[i] = numero;
		}
		
		//	Índice que vai verificar a posição do menor vetor;
		int i = 0;
		//	A verificação do menor valor começa com o primeiro valor do vetor;
		menor = x[0];
		
		for (Integer valor : x) {
			
			if (valor < menor) {
				//	Se o valor for menor que o atual, o menor valor será igual ao valor atual;
				menor = valor;
				//	Se não houver valor menor que o inicial a posição dele será igual a zero;
				posicao = i;
			}
			
			//	Serve de base para saber a posição dos valores;
			i++;
		}
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
		
		entrada.close();
	}

}
