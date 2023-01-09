package br.com.beecrowd;

/*Este programa deve ler uma variável inteira X inúmeras vezes 
 * (deve parar quando o valor no arquivo de entrada for igual a zero). 
 * Para cada valor lido imprima a sequência de 1 até X, com um espaço entre cada número e seu sucessor.*/

import java.util.Scanner;

public class Bee_1146_Sequencias_Crescentes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x = entrada.nextInt();
		
		while (x != 0) {
			
			for (int i = 1 ; i < x ; i++) {
				System.out.print(i + " ");
			}
			
			System.out.println(x);
			
			x = entrada.nextInt();
		}
		entrada.close();
	}
	
}
