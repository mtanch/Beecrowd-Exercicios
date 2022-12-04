package br.com.beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee_1113_Crescente_e_Decrescente {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		
		int m, n;
		
		ArrayList<Integer> valoresM = new ArrayList<>();
		ArrayList<Integer> valoresN = new ArrayList<>();
		
		do {
			m = entrada.nextInt();
			n = entrada.nextInt();
			
			if (m == n) {
				break;
			}
			
			valoresM.add(m);
			valoresN.add(n);
		} while (true);
		
		for (int i = 0 ; i < valoresM.size() ; i++) {
			if (valoresM.get(i) > valoresN.get(i)) {
				System.out.println("Decrescente");
			}
			if (valoresN.get(i) > valoresM.get(i)) {
				System.out.println("Crescente");
			}
		}
		
		entrada.close();
	}

}
