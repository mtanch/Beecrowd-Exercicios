package br.com.beecrowd;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee_1040_Media_3
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    DecimalFormat decimal = new DecimalFormat("##0.0");
	    
	    double n1, n2, n3, n4, nExame, media;
	    int p1 = 2, p2 = 3, p3 = 4, p4 = 1;
	    
	    n1 = input.nextDouble();
	    n2 = input.nextDouble();
	    n3 = input.nextDouble();
	    n4 = input.nextDouble();
	    
	    media = ((n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4)) / (p1 + p2 + p3 + p4);
	    
	    System.out.println("Media: " + decimal.format(media));
	    
	    if (media >= 7.0) {
	        System.out.println("Aluno aprovado.");
	    } else if (media < 5.0) {
	        System.out.println("Aluno reprovado.");
	    } else if (media >= 5.0 && media <= 6.9) {
	        System.out.println("Aluno em exame.");
	        nExame = input.nextDouble();
	        System.out.println("Nota do exame: " + decimal.format(nExame));
	        media = (media + nExame) / 2;
	        if (media >= 5.0) {
	            System.out.println("Aluno aprovado.");
	        } else if (media < 5.0) {
	            System.out.println("Aluno reprovado.");
	        }
	        System.out.println("Media final: " + decimal.format(media));
	    }
	    input.close();
	}
	
}
