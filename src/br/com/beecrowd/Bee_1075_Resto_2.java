package br.com.beecrowd;
/*Entrada
A entrada cont�m um valor inteiro N (N < 10000).

Sa�da
Imprima todos valores dos n�meros entre 1 e 10000 que 
quando divididos por N d�o resto = 2, um por linha.*/

import java.util.Scanner;

public class Bee_1075_Resto_2 {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    int numero = entrada.nextInt();
        
        for (int i = 0 ; i < 10000 ; i++) {
            
            boolean resto2 = i % numero == 2;
            
            if (resto2) {
                System.out.println(i);
            }
        }
	    entrada.close();
	}
}
