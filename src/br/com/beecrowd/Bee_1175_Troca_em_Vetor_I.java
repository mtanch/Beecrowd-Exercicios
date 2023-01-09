package br.com.beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

/* Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, 
 * o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.*/

public class Bee_1175_Troca_em_Vetor_I {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, backup = 0;
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for (int i = 0 ; i < 20 ; i++) {
			numero = entrada.nextInt();
			numeros.add(numero);
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			backup = numeros.get(i);
			numeros.set(i, numeros.get(19 - i));
			numeros.set(19 - i, backup);
		}
		
		int i = 0;
		
		for (Integer valores : numeros) {
			System.out.println("N[" + i + "] = " + valores);
			i++;
		}
		
		entrada.close();
	}

}
