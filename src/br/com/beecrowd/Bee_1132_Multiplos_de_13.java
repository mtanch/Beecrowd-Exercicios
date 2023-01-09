package br.com.beecrowd;

/*Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma 
dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.*/

import java.util.Scanner;
import java.util.ArrayList;

public class Bee_1132_Multiplos_de_13 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Integer> multiplos = new ArrayList<Integer>();
        
        for ( int i = -100 ; i <= 100 ; i++) {
            multiplos.add(i * 13);
        }
        
        int x, y, resultado = 0;
        
        x = entrada.nextInt();
        y = entrada.nextInt();
        
        boolean multiplo = false;
        if (x == y) {
            for ( int i = 0 ; i < multiplos.size() ; i++) {
                if (multiplos.get(i) == x) {
                    //  Verifica se o número [i] é igual a algum dos números presentes na ArrayList;
                    System.out.println(x);
                    break;
                }
            }
        } else if (x < y) {
            for ( int i = x ; i <= y ; i++) {
                //Define o número a ser verificado;
                for ( int j = 0 ; j < multiplos.size() ; j++) {
                    if (multiplos.get(j) == i) {
                        //  Verifica se o número [i] é igual a algum dos números presentes na ArrayList;
                        multiplo = true;
                        break;
                    }
                }
                if (!multiplo) {
                    //Soma o valor do número não múltiplo de 13
                    resultado += i;
                }
                multiplo = false;
            }
            System.out.println(resultado);
        } else {
            for ( int i = y ; i <= x ; i++) {
                //Define o número a ser verificado;
                for ( int j = 0 ; j < multiplos.size() ; j++) {
                    if (multiplos.get(j) == i) {
                        //  Verifica se o número [i] é igual a algum dos números presentes na ArrayList;
                        multiplo = true;
                        break;
                    }
                }
                
                if (!multiplo) {
                    //Soma o valor do número não múltiplo de 13
                    resultado += i;
                }
                multiplo = false;
            }
            System.out.println(resultado);
        }
        entrada.close();
    }
}
