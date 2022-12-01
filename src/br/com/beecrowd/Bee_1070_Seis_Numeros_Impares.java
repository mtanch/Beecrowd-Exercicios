package br.com.beecrowd;
/*Leia um valor inteiro X. 
Em seguida apresente os 6 valores ímpares consecutivos a partir de X, 
um valor por linha, inclusive o X ser for o caso.*/
import java.util.Scanner;

public class Bee_1070_Seis_Numeros_Impares {
    
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
        
        int x = entrada.nextInt();
        
        for (int i = x ; i < (x + 12) ; i++) {
            boolean impar = i % 2 != 0;
            if (impar) {
                System.out.println(i);
            }
        }
        
        entrada.close();
	}
}
