package br.com.beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

//	Entrada
//	O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai conter um número nulo ou negativo.
//
//	Saída
//	Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.

public class Bee_1101_Sequencia_de_Numeros_e_Soma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int m, n, soma = 0;
		
		ArrayList<Integer> valoresM = new ArrayList<>();
		ArrayList<Integer> valoresN = new ArrayList<>();
		
		do {
			m = entrada.nextInt();
			n = entrada.nextInt();
			
			if (m <= 0 || n <= 0) {
				break;
			}
			
			valoresM.add(m);
			valoresN.add(n);
		} while (true);
		
		for (int i = 0 ; i < valoresM.size() ; i++) {
			if (valoresM.get(i) > valoresN.get(i)) {
				for (int j = valoresN.get(i) ; j <= valoresM.get(i) ; j++) {
					System.out.print(j + " ");
					soma += j;
				}
				System.out.println("Sum=" + soma);
				soma = 0;
			}
			if (valoresN.get(i) > valoresM.get(i)) {
				for (int j = valoresM.get(i) ; j <= valoresN.get(i) ; j++) {
					System.out.print(j + " ");
					soma += j;
				}
				System.out.println("Sum=" + soma);
				soma = 0;
			}
			if (valoresN.get(i) == valoresM.get(i)) {
				System.out.println(valoresN.get(i) + " Sum=" + valoresN.get(i));
			}
		}
		
		entrada.close();
	}
}
