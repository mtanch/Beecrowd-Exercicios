package br.com.beecrowd;

import java.util.ArrayList;

/* O programa deve ler um valor inteiro X indefinidas vezes. 
 * (O programa irá parar quando o valor de X for igual a 0). 
 * Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par. 
 * Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação: 4+6+8+10+12, 
 * enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.*/

import java.util.Scanner;

public class Bee_1159_Soma_de_Pares_Consecutivos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x = entrada.nextInt();
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		while (x != 0){
			numeros.add(x);
			x = entrada.nextInt();
		}
		
		for (int i = 0; i < numeros.size(); i++) {
			
			boolean par = numeros.get(i) % 2 == 0;
			
			if ( par ) {
				x = numeros.get(i);
			} else {
				x = numeros.get(i) + 1;
			}
			
			int soma = x;
			
			for (int j = 1; j < 5; j++) {
				soma += 2;
				x += soma;
			}
			
			System.out.println(x);
		}
		
		entrada.close();
	}

}
