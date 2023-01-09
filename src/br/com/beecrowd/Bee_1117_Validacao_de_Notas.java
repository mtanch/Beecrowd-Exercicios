package br.com.beecrowd;

import java.util.Scanner;

//	Fa�a um programa que leia as notas referentes �s duas avalia��es de um aluno. 
//	Calcule e imprima a m�dia semestral. Fa�a com que o algoritmo s� aceite notas v�lidas 
//	(uma nota v�lida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
//
//	Entrada
//	A entrada cont�m v�rios valores reais, positivos ou negativos. 
//	O programa deve ser encerrado quando forem lidas duas notas v�lidas.
//
//	Sa�da
//	Se uma nota inv�lida  for lida, deve ser impressa a mensagem "nota invalida".
//	Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do c�lculo. 
//	O valor deve ser apresentado com duas casas ap�s o ponto decimal.

public class Bee_1117_Validacao_de_Notas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Double nota1 = null, nota2 = null;
		
		boolean primeiraNotaValida, segundaNotaValida;
		
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
		
		entrada.close();
	}

}
