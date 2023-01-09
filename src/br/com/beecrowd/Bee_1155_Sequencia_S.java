package br.com.beecrowd;

public class Bee_1155_Sequencia_S {

	public static void main(String[] args) {
		
		float s = 1;
		
		for (float i = 2 ; i <= 100 ; i++) {
			s += (1 / i);
		}
		
		System.out.printf("%.2f\n", s);
	}
}
