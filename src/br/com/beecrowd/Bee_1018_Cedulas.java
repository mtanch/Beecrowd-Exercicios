package br.com.beecrowd;
import java.util.Scanner;
public class Bee_1018_Cedulas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, qtd100 = 0, qtd50 = 0, qtd20 = 0, qtd10 = 0, qtd5 = 0, qtd2 = 0, qtd1 = 0;
		
		numero = entrada.nextInt();
		
		System.out.println(numero);
		
		if (numero >= 100) {
			qtd100 = numero / 100;
			numero %= 100;
		}
		System.out.printf("%d nota(s) de R$ 100,00\n", qtd100);
		if (numero >= 50) {
			qtd50 = numero / 50;
			numero %= 50;
		}
		System.out.printf("%d nota(s) de R$ 50,00\n", qtd50);
		if (numero >= 20) {
			qtd20 = numero / 20;
			numero %= 20;
		}
		System.out.printf("%d nota(s) de R$ 20,00\n", qtd20);
		if (numero >= 10) {
			qtd10 = numero / 10;
			numero %= 10;
		}
		System.out.printf("%d nota(s) de R$ 10,00\n", qtd10);
		if (numero >= 5) {
			qtd5 = numero / 5;
			numero %= 5;
		}
		System.out.printf("%d nota(s) de R$ 5,00\n", qtd5);
		if (numero >= 2) {
			qtd2 = numero / 2;
			numero %= 2;
		}
		System.out.printf("%d nota(s) de R$ 2,00\n", qtd2);
		if (numero >= 1) {
			qtd1 = numero / 1;
			numero %= 1;
		}
		System.out.printf("%d nota(s) de R$ 1,00\n", qtd1);
		
		entrada.close();
	}

}
