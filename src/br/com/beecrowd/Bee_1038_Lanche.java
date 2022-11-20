package br.com.beecrowd;
import java.util.Scanner;

public class Bee_1038_Lanche
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    int codigo, qtd;
	    
	    Double item[] = new Double [] {4.00, 4.50, 5.00, 2.00, 1.50};
	    
	    codigo = entrada.nextInt() - 1;
	    qtd = entrada.nextInt();
	    
	    System.out.printf("Total: R$ %.2f\n", (item[codigo] * qtd));
	    
	    entrada.close();
	}
}
