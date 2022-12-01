package br.com.beecrowd;

import java.util.Scanner;

public class Bee_1065_Pares_entre_Cinco_Numeros {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contagem = 0, numero = 0;

        for (int i = 0 ; i < 5 ; i++) {
            numero = entrada.nextInt();
            boolean par = numero % 2 == 0;
            if (par) {
                contagem++;
            }
        }

        System.out.println(contagem + " valores pares");

        entrada.close();
    }
}