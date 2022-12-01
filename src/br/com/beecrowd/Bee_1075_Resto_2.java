package br.com.beecrowd;
/*Entrada
A entrada contém um valor inteiro N (N < 10000).

Saída
Imprima todos valores dos números entre 1 e 10000 que 
quando divididos por N dão resto = 2, um por linha.*/

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
