package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1150_Ultrapassando_Z {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x, z, iMaisUm, contagem = 1;
		
		x = entrada.nextInt();
		z = entrada.nextInt();
		
		iMaisUm = x;
		
		while(z <= x) {
			z = entrada.nextInt();
		}
		
		int i = x;	//	para a iteração;
		
		do {
			iMaisUm++;	//	para incrementar com [i];
			i += iMaisUm;
			contagem++;	//	quantidade de valores somados;
		} while(i < z);
		
		System.out.println(contagem);
		
		entrada.close();
	}

}
