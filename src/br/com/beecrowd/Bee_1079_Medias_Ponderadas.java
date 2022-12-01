package br.com.beecrowd;
/*Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha. 
Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

Saída
Imprima a média ponderada para cada um destes conjuntos de 3 valores, 
sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.*/

import java.util.Scanner;

public class Bee_1079_Medias_Ponderadas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int qtd, peso1 = 2, peso2 = 3, peso3 = 5;
        double valor1 = 0, valor2 = 0, valor3 = 0;
        
        qtd = entrada.nextInt();
        
        Double[] resultado = new Double[qtd];
        
        for (int i = 0 ; i < qtd ; i++) {
            valor1 = entrada.nextDouble();
            valor2 = entrada.nextDouble();
            valor3 = entrada.nextDouble();
            resultado[i] = ((valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3)) / (peso1 + peso2 + peso3);
        }
        for (double valores : resultado) {
            System.out.printf("%.1f\n", valores);
        }
        
        entrada.close();
	}
}
