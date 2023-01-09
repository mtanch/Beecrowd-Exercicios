package br.com.beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee_1154_Idades {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int inputIdade, somaIdades = 0;
		double media;
		
		ArrayList<Integer> idades = new ArrayList<Integer>();
		
		do {
			//	Adicionando idades na ArrayList
			inputIdade = entrada.nextInt();
			idades.add(inputIdade);
			
		} while(inputIdade >= 0);
		
		//	Removendo o �ltimo numero da Array (� um n�mero negativo)
		idades.remove(idades.size() - 1);
		
		//	Somando todas as idades e guardando numa vari�vel
		for (Integer idade : idades) {
			somaIdades += idade;
		}
		
		//	definindo a m�dia das idades
		media = (double)somaIdades / (double)idades.size();
		
		//	Imprimindo m�dia com duas casas decimais
		System.out.printf("%.2f\n", media);
		
		entrada.close();
	}
}
