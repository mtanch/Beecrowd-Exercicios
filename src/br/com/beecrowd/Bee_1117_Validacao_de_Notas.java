package br.com.beecrowd;

import java.util.Scanner;

//	Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
//	Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas 
//	(uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
//
//	Entrada
//	A entrada contém vários valores reais, positivos ou negativos. 
//	O programa deve ser encerrado quando forem lidas duas notas válidas.
//
//	Saída
//	Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
//	Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. 
//	O valor deve ser apresentado com duas casas após o ponto decimal.

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
