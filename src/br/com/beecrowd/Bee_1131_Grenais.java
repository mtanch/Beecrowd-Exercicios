package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1131_Grenais {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qtdGrenais = 0, golsGremio, golsInter, winGremio = 0, winInter = 0, empates = 0, escolha;
		
		do {
			qtdGrenais++;
			
			golsInter = entrada.nextInt();
			golsGremio = entrada.nextInt();
			
			if (golsGremio == golsInter) {
				empates++;
			} else if (golsGremio > golsInter) {
				winGremio++;
			} else {
				winInter++;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			escolha = entrada.nextInt();
			
			if (escolha == 2) {
				break;
			}
			
		} while (escolha == 1);
		
		System.out.println(qtdGrenais + " grenais");
		System.out.println("Inter:" + winInter);
		System.out.println("Gremio:" + winGremio);
		System.out.println("Empates:" + empates);
		
		if (winGremio > winInter) {
			System.out.println("Gremio venceu mais");
		} else if (winGremio < winInter) {
			System.out.println("Inter venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}
		
		entrada.close();
	}

}
