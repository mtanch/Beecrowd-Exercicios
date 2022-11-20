package br.com.beecrowd;
import java.util.Scanner;
public class Bee_1041_Coordenadas_de_um_Ponto
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x, y;
		
		x = entrada.nextDouble();
		y = entrada.nextDouble();
		
		if (x == 0 && y == 0) {
		    System.out.println("Origem");
		} else if (x == 0) {
		    System.out.println("Eixo Y");
		} else if (y == 0) {
		    System.out.println("Eixo X");
		}
		
		if (x > 0) {
		    if (y > 0) {
		        System.out.println("Q1");
		    } else if (y < 0) {
		        System.out.println("Q4");
		    }
		} else if (x < 0) {
		    if (y > 0) {
		        System.out.println("Q2");
		    } else if (y < 0) {
		        System.out.println("Q3");
		    }
		}
		
		entrada.close();
	}
}
