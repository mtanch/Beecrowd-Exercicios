package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1143_Quadrado_e_ao_Cubo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeroLinhas = entrada.nextInt();
		
		for (int i = 1 ; i <= numeroLinhas ; i++) {
			
			System.out.println(i + " " + (i * i) + " " + (i * i * i));
			
		}
		
		entrada.close();
	}
}
