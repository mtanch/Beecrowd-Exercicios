package br.com.beecrowd;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;
public class Bee_1021_Notas_e_Moedas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormatSymbols dfs = new DecimalFormatSymbols (Locale.US);
		DecimalFormat decimal = new DecimalFormat("###,##0.00", dfs);
		
		Double notas[] = new Double [] {100000.0, 50000.0, 20000.0, 10000.0, 5000.0, 2000.0};
		Double moedas[] = new Double [] {1000.0, 500.0, 250.0, 100.0, 50.0, 10.0};
		
		double reais;
		
		reais = input.nextDouble() * 1000;
		System.out.println("NOTAS:");
		for (int i = 0 ; i < notas.length ; i++) {
			if (reais >= notas[i]) {
				System.out.println((int)(reais / notas[i]) + " nota(s) de R$ " + decimal.format(notas[i] / 1000) + "");
				reais %= notas[i];
			} else {
				System.out.println(0 + " nota(s) de R$ " + decimal.format(notas[i] / 1000) + "");
			}
		}
		
		System.out.println("MOEDAS:");
		for (int i = 0 ; i < moedas.length ; i++) {
			if (reais >= moedas[i]) {
				System.out.println((int)(reais / moedas[i]) + " moeda(s) de R$ " + decimal.format(moedas[i] / 1000) + "");
				reais %= moedas[i];
			} else {
				System.out.println(0 + " moeda(s) de R$ " + decimal.format(moedas[i] / 1000) + "");
			}
			
		}
		input.close();
	}

}
