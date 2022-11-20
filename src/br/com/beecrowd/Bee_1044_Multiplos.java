package br.com.beecrowd;
import java.util.Scanner;
public class Bee_1044_Multiplos
{
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a, b;
        boolean moduloZero;
        
        a = entrada.nextInt();
        b = entrada.nextInt();
        
        if (b > a) {
        	moduloZero = b % a == 0;
	        
	        if (moduloZero) {
	        	System.out.println("Sao Multiplos");
	        } else {      	
	        	System.out.println("Nao Sao Multiplos");
	        }
        } else if (a > b) {
        	moduloZero = a % b == 0;
        	
        	if (moduloZero) {
        		System.out.println("Sao Multiplos");
        	} else {      	
        		System.out.println("Nao Sao Multiplos");
        	}
        }
        entrada.close();
	}
}
