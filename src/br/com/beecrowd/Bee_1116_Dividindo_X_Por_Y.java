package br.com.beecrowd;

import java.util.ArrayList;
import java.util.List;

//	Entrada
//	A entrada contém um número inteiro N. 
//	Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.
//	
//	Saída
//	Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, 
//	ou "divisao impossivel" caso não seja possível efetuar o cálculo.

import java.util.Scanner;

public class Bee_1116_Dividindo_X_Por_Y {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		List<Double> x = new ArrayList<>();
		List<Double> y = new ArrayList<>();
		
		int qtd = entrada.nextInt();
		
		for (int i = 0 ; i < qtd ; i++) {
				x.add(entrada.nextDouble());
				y.add(entrada.nextDouble());
		}
		
		
		for (int i = 0 ; i < x.size() ; i++) {
			if (y.get(i) == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f\n", x.get(i) / y.get(i));
			}
		}

		entrada.close();
	}
}
