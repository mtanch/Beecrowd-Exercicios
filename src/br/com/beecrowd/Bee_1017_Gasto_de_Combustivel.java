package br.com.beecrowd;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Bee_1017_Gasto_de_Combustivel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("###.000");
		
		float tempoPercorrido, velMedia, calculo, kmPorLitro = 12.0f;
		
		tempoPercorrido = input.nextFloat();
		velMedia = input.nextFloat();
		
		calculo = (tempoPercorrido * velMedia) / kmPorLitro;
		
		System.out.println(decimal.format(calculo));
		
		input.close();
	}
}
