package br.com.beecrowd;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Bee_1036_Formula_de_Bhaskara {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("##0.00000");
		
		double r1, r2, a, b, c, delta;
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		if (a == 0) {
			System.out.println("Impossivel calcular");
		} else {
			delta = Math.pow(b, 2) - 4 * a * c;
			
			if (delta < 0) {
				System.out.println("Impossivel calcular");
			} else {
				r1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
				r2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
				
				System.out.println("R1 = " + decimal.format(r1));
				System.out.println("R2 = " + decimal.format(r2));
			}
		}
		
		input.close();
	}

}
