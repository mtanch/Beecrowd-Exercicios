package br.com.beecrowd;

public class Bee_1097_Sequencia_IJ_3 {

	public static void main(String[] args) {
		
		for (int i = 1 ; i < 10 ; i = i + 2) {
			for (int j = (i + 6) ; j > (i + 3) ; j--) {
				System.out.println("I=" + i + " J=" + j);
			}
		}
	}
}
