package br.com.beecrowd;

public class Bee_1156_Sequencia_S_II {
	public static void main(String[] args) {
		
		float s = 1;
		float j = 2;
		
		for (float i = 3 ; i <= 39 ; i = i + 2) {
			s += (i / j);
			j = j * 2;
		}
		
		System.out.printf("%.2f\n", s);
	}
}
