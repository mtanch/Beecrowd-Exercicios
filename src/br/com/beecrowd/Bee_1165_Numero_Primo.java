package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1165_Numero_Primo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n, x, contagem = 0;
		boolean primo, divisaoExata;
		
		//	Quantidade de casos;
		n = entrada.nextInt();
		
		//	Não pode ser menor que 1 nem maior que 100;
		if (n < 1) {
			n = 1;
		} else if (n > 100) {
			n = 100;
		}
		
		for (int i = 0 ; i < n ; i++) {
			//	Recebe os números a serem analizados;
			x = entrada.nextInt();
			
			//	Preferi não verificar a divisão com o próprio número para economizar processamento,
			//	por isso os números vão ser primos sempre que a contagem de divisões exatas for igual a 1;
			for (int j = x - 1 ; j > 0 ; j--) {
				//	Verifica se o resto da divisão é Zero;
				divisaoExata = x % j == 0;
				
				//	Se for Zero, vai incrementar o valor da contagem de divisões exatas;
				if (divisaoExata) {
					//	Contagem de divisões exatas;
					contagem++;
				}
			}
			
			//	Se a contagem for 1 quer dizer quer o número é primo.
			if (contagem == 1) {
				primo = true;
			} else {
				primo = false;
			}
			
			if (primo == true) {
				System.out.println(x + " eh primo");
			} else {
				System.out.println(x + " nao eh primo");
			}
			contagem = 0;	//	reset
		}
		entrada.close();
	}
	
}
