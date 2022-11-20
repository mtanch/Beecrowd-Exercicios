package br.com.beecrowd;
import java.util.Scanner;
public class Bee_2060_Desafio_de_Bino {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n, mult2 = 0, mult3 = 0, mult4 = 0, mult5 = 0;
		
		n = entrada.nextInt();
		
		Integer lista [] = new Integer[n];
		
		for (int i = 0 ; i < lista.length ; i++) {
			
			lista[i] = entrada.nextInt();
			
			for (int j = 1 ; j <= 1000 ; j++) {
				if (2 * j == lista[i]) {
					mult2++;
					break;
				}
			}
			for (int j = 1 ; j <= 1000 ; j++) {
				if (3 * j == lista[i]) {
					mult3++;
					break;
				}
			}
			for (int j = 1 ; j <= 1000 ; j++) {
				if (4 * j == lista[i]) {
					mult4++;
					break;
				}
			}
			for (int j = 1 ; j <= 1000 ; j++) {
				if (5 * j == lista[i]) {
					mult5++;
					break;
				}
				
			}
			
		}
		
		System.out.println(mult2 + " Multiplo(s) de 2");
		System.out.println(mult3 + " Multiplo(s) de 3");
		System.out.println(mult4 + " Multiplo(s) de 4");
		System.out.println(mult5 + " Multiplo(s) de 5");
		
		entrada.close();
	}
	
}


//quantos números da lista são múltiplos de 2, 3, 4 e 5.