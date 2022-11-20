package br.com.beecrowd;
import java.util.Scanner;

public class Bee_1019_Conversao_de_Tempo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float h = 0, m = 0, s = 0;
		
		s = input.nextFloat();
		m = s;
		h = s;
		
		h = (float)Math.floor(h / 3600);
		m = (float)Math.floor((m / 60) % 60);
		s = (float)Math.floor(s % 60);
		
		System.out.printf("%.0f:%.0f:%.0f\n", h, m, s);
		
		input.close();
	}

}
