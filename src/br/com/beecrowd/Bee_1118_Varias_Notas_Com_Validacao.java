package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1118_Varias_Notas_Com_Validacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Double nota1 = null, nota2 = null;
		
		boolean primeiraNotaValida, segundaNotaValida;
		int escolha = 0;
		
		do {
			
			do {
				nota1 = entrada.nextDouble();
				
				primeiraNotaValida = nota1 >= 0 && nota1 <= 10;
				if (primeiraNotaValida) {
					break;
				}
				
				System.out.println("nota invalida");
				
			} while (!primeiraNotaValida);
			
			do {
				nota2 = entrada.nextDouble();
				
				segundaNotaValida = nota2 >= 0 && nota2 <= 10;
				if (segundaNotaValida) {
					break;
				}
				
				System.out.println("nota invalida");
				
			} while (!segundaNotaValida);
			
			System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);
			
			do {
				System.out.println("novo calculo (1-sim 2-nao)");
				escolha = entrada.nextInt();
				if (escolha == 2) {
					System.exit(0);
				}
			} while (escolha != 1);
			
		} while(escolha == 1);
		entrada.close();
	}

}
