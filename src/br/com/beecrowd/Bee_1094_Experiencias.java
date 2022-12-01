package br.com.beecrowd;
/*Exibir quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

	Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias 
utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

	Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em 
relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee_1094_Experiencias {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		int qtdTestes, coelhos = 0, ratos = 0, sapos = 0;
		
		double percentC, percentR, percentS;
		
		qtdTestes = entrada.nextInt();
		
		for (int i = 0 ; i < qtdTestes ; i++) {
			
			int quantia = entrada.nextInt();
			Character cobaia = entrada.next().charAt(0);
			
			if (quantia < 1) {
				quantia = 1;
			} else if (quantia > 15) {
				quantia = 15;
			}
			
			if (cobaia.equals('C')) {
				coelhos += quantia;
			} else if (cobaia.equals('R')) {
				ratos += quantia;
			} else if (cobaia.equals('S')) {
				sapos += quantia;
			}
			
		}
		
		percentC = coelhos * 100.0 / (coelhos + ratos + sapos);
		percentR = ratos * 100.0 / (coelhos + ratos + sapos);
		percentS = sapos * 100.0 / (coelhos + ratos + sapos);
		
		System.out.println("Total: " + (coelhos + ratos + sapos) + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.println("Percentual de coelhos: " + decimal.format(percentC) + " %");
		System.out.println("Percentual de ratos: " + decimal.format(percentR) + " %");
		System.out.println("Percentual de sapos: " + decimal.format(percentS) + " %");
		
		entrada.close();
	}
}
