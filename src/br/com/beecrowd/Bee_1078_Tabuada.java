package br.com.beecrowd;
/*Entrada
A entrada contém um valor inteiro N (2 < N < 1000).

Saída
Imprima a tabuada de N, de 1 até 10.
Ex.: 1 x 140 = 140*/

import java.util.Scanner;

public class Bee_1078_Tabuada {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    int numero = entrada.nextInt();
	    
	    if (numero < 2) {
	        numero = 2;
	    } else if (numero > 1000) {
	        numero = 1000;
	    }
	    
	    for (int i = 1 ; i <= 10 ; i++) {
	        System.out.println(i + " x " + numero + " = " + (i*numero));
	    }
	    
	    entrada.close();
	}
}
