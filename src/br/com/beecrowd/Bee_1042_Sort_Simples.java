package br.com.beecrowd;
import java.util.Scanner;
import java.util.Arrays;
public class Bee_1042_Sort_Simples
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Integer[] oldArray = new Integer[3];
	    Integer[] newArray = new Integer[3];
	    
	    oldArray[0] = entrada.nextInt();
	    oldArray[1] = entrada.nextInt();
	    oldArray[2] = entrada.nextInt();
	    
	    for (int i = 0 ; i < oldArray.length ; i++) {
	        newArray[i] = oldArray[i];
	    }
	    
	    Arrays.sort(oldArray);
	    
		for(int n : oldArray) {
		    System.out.println(n);
		}
		System.out.println();
		for(int n : newArray) {
		    System.out.println(n);
		}
		entrada.close();
	}
}
