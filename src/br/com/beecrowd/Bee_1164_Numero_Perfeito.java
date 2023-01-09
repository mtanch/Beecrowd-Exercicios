package br.com.beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee_1164_Numero_Perfeito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qtdCasos, numero = 0, somaDivisores = 0;
		
		qtdCasos = entrada.nextInt();
		
		if (qtdCasos < 1) {
			//	Não pode ser menor que 1;
			qtdCasos = 1;
		} else if (qtdCasos > 20) {
			//	Não pode ser maior que 20;
			qtdCasos = 20;
		}
		
		//	Armazena os números irá verificar se é perfeito ou não;
		ArrayList<Integer> numeros = new ArrayList<>();
		
		//	Armazena todos so divisores de cada números;
		//	Após terminar a verificação (se é perfeito ou não) a lista será resetada;
		ArrayList<Integer> divisores = new ArrayList<>();
		
		//	Recebe do teclado e adiciona na array todos os números para a verificação;
		for (int i = 0 ; i < qtdCasos ; i++) {
			numero = entrada.nextInt();
			numeros.add(numero);
		}
		
		for (int i = 0 ; i < qtdCasos ; i++) {
			
			for (int j = numeros.get(i) - 1 ; j > 0 ; j--) {
				//	É "multiplo" pq estou verificando o módulo da divisão.
				//	Um número A é divisor de B quando B é multiplo de A,
				//	ou seja, quando o resto da divisão (B / A) é exata (igual a Zero).
				boolean multiplo = numeros.get(i) % j == 0;
				
				if (multiplo) {
					divisores.add(j);
				}
			}
			
			//	Somando os divisores;
			for (Integer divisor : divisores) {
				somaDivisores += divisor;
			}
			
			//	Se a soma dos divisores for igual ao número principal ele é perfeito;
			if (somaDivisores == numeros.get(i)) {
				System.out.println(numeros.get(i) + " eh perfeito");
			} else {
				System.out.println(numeros.get(i) + " nao eh perfeito");
			}
			
			somaDivisores = 0;	//	reset
			divisores.clear();	//	reset
		}
		
		entrada.close();
	}

}
