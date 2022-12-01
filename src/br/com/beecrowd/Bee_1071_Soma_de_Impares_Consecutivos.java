package br.com.beecrowd;
/*Leia um valor inteiro X. 
Em seguida apresente os 6 valores ímpares consecutivos a partir de X, 
um valor por linha, inclusive o X ser for o caso.*/
import java.util.Scanner;

public class Bee_1071_Soma_de_Impares_Consecutivos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int x, y, somaImpares = 0;
        
        x = entrada.nextInt();
        y = entrada.nextInt();
        
        if (x < y) {
            for (int i = (x + 1) ; i < y ; ++i) {
                boolean impar = i % 2 != 0;
                if (impar) {
                    somaImpares += i;
                }
            }
            System.out.println(somaImpares);
        } else if (x > y) {
            for (int i = (x - 1) ; i > y ; --i) {
                boolean impar = i % 2 != 0;
                if (impar) {
                    somaImpares += i;
                }
            }
            System.out.println(somaImpares);
        } else if (x == y) {
            System.out.println(0);
        }
        
        entrada.close();
	}
}
