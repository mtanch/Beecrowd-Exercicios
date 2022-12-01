package br.com.beecrowd;
/*Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas informa��es.*/
import java.util.Scanner;

public class Bee_1072_Intervalo_2 {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    int qtd, in = 0, out = 0;
	    
	    qtd = entrada.nextInt();
	    
	    Integer[] inOut = new Integer[qtd];
	    
	    for (int i = 0 ; i < qtd ; i++) {
	        
	        inOut[i] = entrada.nextInt();
	        
	        if (inOut[i] >= 10 && inOut[i] <= 20) {
	            in++;
	        } else {
	            out++;
	        }
	    }
	    
	    System.out.println(in + " in");
	    System.out.println(out + " out");
	    
	    entrada.close();
	}
}
