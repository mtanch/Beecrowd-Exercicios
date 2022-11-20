package br.com.beecrowd;
import java.util.Scanner;
public class Bee_1013_O_Maior {
		
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		int maiorAB, maiorABC, a, b, c;
		
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		maiorAB = (a + b + Math.abs(a - b))/2;
		maiorABC = (maiorAB + c + Math.abs(maiorAB - c))/2;
//			System.out.println(maiorAB);
		
		System.out.println(maiorABC + " eh o maior");
		
		entrada.close();
	}
}
