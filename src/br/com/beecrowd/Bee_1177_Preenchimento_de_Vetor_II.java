package br.com.beecrowd;
/* Fa�a um programa que leia um valor T e preencha um vetor N[1000] com a sequ�ncia de 
 * valores de 0 at� T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.*/
import java.util.Scanner;

public class Bee_1177_Preenchimento_de_Vetor_II {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor, contador = 0;
		
		valor = entrada.nextInt();
		
		Integer[] valores = new Integer[1000];
		
		for (int i = 0 ; i < 1000 ; i++) {
			valores[i] = contador;
			System.out.println("N[" + i + "] = " + valores[i]);
			
			contador++;
			
			if (contador == valor) {
				contador = 0;
			}
		}
		entrada.close();
	}
}
