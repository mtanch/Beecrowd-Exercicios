package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1165_Numero_Primo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n, x, contagem = 0;
		boolean primo, divisaoExata;
		
		//	Quantidade de casos;
		n = entrada.nextInt();
		
		//	N�o pode ser menor que 1 nem maior que 100;
		if (n < 1) {
			n = 1;
		} else if (n > 100) {
			n = 100;
		}
		
		for (int i = 0 ; i < n ; i++) {
			//	Recebe os n�meros a serem analizados;
			x = entrada.nextInt();
			
			//	Preferi n�o verificar a divis�o com o pr�prio n�mero para economizar processamento,
			//	por isso os n�meros v�o ser primos sempre que a contagem de divis�es exatas for igual a 1;
			for (int j = x - 1 ; j > 0 ; j--) {
				//	Verifica se o resto da divis�o � Zero;
				divisaoExata = x % j == 0;
				
				//	Se for Zero, vai incrementar o valor da contagem de divis�es exatas;
				if (divisaoExata) {
					//	Contagem de divis�es exatas;
					contagem++;
				}
			}
			
			//	Se a contagem for 1 quer dizer quer o n�mero � primo.
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
