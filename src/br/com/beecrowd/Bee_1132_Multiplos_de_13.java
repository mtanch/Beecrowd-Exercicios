package br.com.beecrowd;

/*Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma 
dos n�meros que n�o s�o m�ltiplos de 13 entre X e Y, incluindo ambos.*/

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
                    //  Verifica se o n�mero [i] � igual a algum dos n�meros presentes na ArrayList;
                    System.out.println(x);
                    break;
                }
            }
        } else if (x < y) {
            for ( int i = x ; i <= y ; i++) {
                //Define o n�mero a ser verificado;
                for ( int j = 0 ; j < multiplos.size() ; j++) {
                    if (multiplos.get(j) == i) {
                        //  Verifica se o n�mero [i] � igual a algum dos n�meros presentes na ArrayList;
                        multiplo = true;
                        break;
                    }
                }
                if (!multiplo) {
                    //Soma o valor do n�mero n�o m�ltiplo de 13
                    resultado += i;
                }
                multiplo = false;
            }
            System.out.println(resultado);
        } else {
            for ( int i = y ; i <= x ; i++) {
                //Define o n�mero a ser verificado;
                for ( int j = 0 ; j < multiplos.size() ; j++) {
                    if (multiplos.get(j) == i) {
                        //  Verifica se o n�mero [i] � igual a algum dos n�meros presentes na ArrayList;
                        multiplo = true;
                        break;
                    }
                }
                
                if (!multiplo) {
                    //Soma o valor do n�mero n�o m�ltiplo de 13
                    resultado += i;
                }
                multiplo = false;
            }
            System.out.println(resultado);
        }
        entrada.close();
    }
}
