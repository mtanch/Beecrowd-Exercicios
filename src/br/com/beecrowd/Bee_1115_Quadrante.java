package br.com.beecrowd;
import java.util.Scanner;
import java.util.ArrayList;
public class Bee_1115_Quadrante {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		for(int i = 0;;i++) {
			x.add(entrada.nextInt());
			y.add(entrada.nextInt());
			if ((x.get(i)) == 0 || (y.get(i)) == 0) {
				break;
			}
		}
		
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i) > 0 && y.get(i) > 0) {
				System.out.println("primeiro");
			} else if (x.get(i) > 0 && y.get(i) < 0) {
				System.out.println("quarto");
			} else if (x.get(i) < 0 && y.get(i) < 0) {
				System.out.println("terceiro");
			} else if (x.get(i) < 0 && y.get(i) > 0) {
				System.out.println("segundo");
			}
		
		}
		entrada.close();
	}

}
