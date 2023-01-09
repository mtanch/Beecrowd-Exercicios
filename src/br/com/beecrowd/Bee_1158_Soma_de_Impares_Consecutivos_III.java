package br.com.beecrowd;

import java.util.Scanner;

/* Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. 
 * Cada caso de teste consiste de dois inteiros X e Y. 
 * Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar. 
 * Por exemplo:
 * 		para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
 * 		para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13*/

public class Bee_1158_Soma_de_Impares_Consecutivos_III {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n, x, y, numero = 0;
		
		//	Definindo quantidade de casos;
		n = entrada.nextInt();
		
		for (int i = 0; i < n; i++) {
			//	Recebendo valores;
			x = entrada.nextInt();
			y = entrada.nextInt();
			
			boolean impar = x % 2 != 0;
			
			//	 Se [x] for impar...;
			if ( impar ) {
				numero = x;
			} else if ( !impar ) {
				numero = x + 1;
				//	Transformando [x] no proximo impar para poder somar ao [numero] depois;
				x = numero;
			}
			
			//	Calculando os valores de saida;
			for (int j = 1; j < y; j++) {
				x += 2;
				numero += x;
				
			}
			//	Printando ultimo resultado;
			System.out.println(numero);
		}
		
		entrada.close();
	}

}
