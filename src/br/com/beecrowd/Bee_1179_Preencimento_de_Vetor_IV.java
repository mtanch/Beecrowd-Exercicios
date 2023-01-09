package br.com.beecrowd;

import java.util.ArrayList;

/* Neste problema você deverá ler 15 valores colocá-los em 2 vetores conforme estes valores 
 * forem pares ou ímpares. Só que o tamanho de cada um dos dois vetores é de 5 posições. 
 * Então, cada vez que um dos dois vetores encher, você deverá imprimir todo o vetor e 
 * utilizá-lo novamente para os próximos números que forem lidos. Terminada a leitura, 
 * deve-se imprimir o conteúdo que restou em cada um dos dois vetores, imprimindo primeiro 
 * os valores do vetor impar. Cada vetor pode ser preenchido tantas vezes quantas for necessário.*/

import java.util.Scanner;

public class Bee_1179_Preencimento_de_Vetor_IV {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//	Índice base para printar os valores das arrays com Foreach;
		int j = 0;
		
		ArrayList<Integer> pares = new ArrayList<>(5);
		ArrayList<Integer> impares = new ArrayList<>(5);
		
		for (int i = 0 ; i < 15 ; i++) {
			//	Recebe os números;
			int numero = entrada.nextInt();
			
			boolean par = numero % 2 == 0;
			
			if (par) {
				pares.add(numero);
			} else {
				impares.add(numero);
			}
			
			//	Se a array tiver 5 itens, vai printar todos eles e limpar a lista;
			if (pares.size() == 5) {
				for (Integer valor : pares) {
					System.out.println("par[" + j + "] = " + valor);
					j++;
				}
				
				j = 0;	//	reset
				
				pares.clear();
			}
			
			//	Se a array tiver 5 itens, vai printar todos eles e limpar a lista;
			if (impares.size() == 5) {
				for (Integer valor : impares) {
					System.out.println("impar[" + j + "] = " + valor);
					j++;
				}
				
				j = 0;	//	reset
				
				impares.clear();
			}
		}
		
		for (Integer valor : impares) {
			System.out.println("impar[" + j + "] = " + valor);
			j++;
		}
		
		j = 0;
		
		for (Integer valor : pares) {
			System.out.println("par[" + j + "] = " + valor);
			j++;
		}
		
		entrada.close();
	}
}
