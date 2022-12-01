package br.com.beecrowd;
/*Leia um valor inteiro X (1 <= X <= 1000). 
Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.*/
import java.util.Scanner;

public class Bee_1067_Numeros_Impares {
    
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    int numero = entrada.nextInt();
	    
	    if (numero > 1000) {
	        numero = 1000;
	    }
	    
	    for (int i = 0 ; i <= numero ; i++) {
	        boolean impar = i % 2 != 0;
	        if (impar) {
	            System.out.println(i);
	        }
	    }
	    
	    entrada.close();
	}
}
