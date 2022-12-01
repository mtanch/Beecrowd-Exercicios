package br.com.beecrowd;

public class Bee_1095_Sequencia_IJ_1 {

	public static void main(String[] args) {
		
		int i = 1, j = 60;
		
		do {
			System.out.println("I=" + i + " J=" + j);
			i += 3;
			j -= 5;
		} while (j >= 0);	
	}
}
