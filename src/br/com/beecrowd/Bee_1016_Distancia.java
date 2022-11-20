package br.com.beecrowd;
import java.util.Scanner;
public class Bee_1016_Distancia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float km, calculo;
		
		km = entrada.nextFloat();
		
		calculo = km * 2;
		
		System.out.printf("%.0f minutos\n", calculo);
		
		entrada.close();
	}
}
