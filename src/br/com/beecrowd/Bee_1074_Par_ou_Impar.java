package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1074_Par_ou_Impar {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    int n = entrada.nextInt();
	    
	    Integer[] numero = new Integer[n];
        
        for (int i = 0 ; i < n ; i++) {
	        numero[i] = entrada.nextInt();
        }
	    
	    for (int i = 0 ; i < numero.length ; i++) {
    	    
    	    boolean par = numero[i] % 2 == 0;
    	    
    	    if (numero[i] == 0) {
                System.out.println("NULL");
    	    } else if (par) {
    	        System.out.print("EVEN ");
    	        if (numero[i] > 0) {
                    System.out.println("POSITIVE");
    	        } else {
    	            System.out.println("NEGATIVE");
    	        }
    	    } else if (!par) {
                System.out.print("ODD ");
                if (numero[i] > 0) {
                    System.out.println("POSITIVE");
    	        } else {
    	            System.out.println("NEGATIVE");
    	        }
    	    }
	    }
	    entrada.close();
	}
}
