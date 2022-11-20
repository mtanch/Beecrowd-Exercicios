package br.com.beecrowd;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Bee_1043_Triângulo
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.0");
		
		double a, b, c, maior = 0;
		
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		
		if (a > b) {
		    maior = a;
		    if (a < c) {
		        maior = c;
		    }
		} else if (b > a) {
		    maior = b;
		    if (b < c) {
		        maior = c;
		    }
		} else if (c > a) {
		    maior = c;
		    if (c < b) {
		        maior = b;
		    }
		}
		
		if ((a + b) > maior && (a + c) > maior && (b + c) > maior) {
		    System.out.println("Perimetro = " + decimal.format(a + b + c));
		} else {
		    System.out.println("Area = " + decimal.format(((a + b) * c) / 2));
		}
		
		entrada.close();
	}
}
