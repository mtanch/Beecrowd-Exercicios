package br.com.beecrowd;
/*Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.*/
import java.util.Scanner;

public class Bee_1073_Quadrado_de_Pares {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    int n = entrada.nextInt();
	    
	    if (n > 2000) {
	        n = 2000;
	    }
	    
	    for (int i = 2 ; i <= n ; i++) {
    	    
    	    boolean par = i % 2 == 0;
    	    
    	    if (par) {
    	        System.out.println(i + "^" + "2" + " = " + (i * i));
    	    }
	    }
	    entrada.close();
	}
}
