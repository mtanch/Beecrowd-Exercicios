package br.com.beecrowd;
import java.util.Scanner;

public class Bee_1037_Intervalo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		
		double numero = input.nextDouble();
		
		if (numero > 100 || numero < 0) {
			System.out.println("Fora de intervalo");
		} else {
			if (numero >= 0 && numero <= 25) {
				System.out.println("Intervalo [0,25]");
			} else if (numero > 25 && numero <= 50) {
				System.out.println("Intervalo (25,50]");
			} else if (numero > 50 && numero <= 75) {
				System.out.println("Intervalo (50,75]");
			} else if (numero > 75 && numero <= 100) {
				System.out.println("Intervalo (75,100]");
			}
			
		}
		input.close();
	}

}
