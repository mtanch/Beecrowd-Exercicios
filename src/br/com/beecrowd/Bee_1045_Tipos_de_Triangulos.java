package br.com.beecrowd;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bee_1045_Tipos_de_Triangulos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float a, b, c;
		boolean retangulo, obtusangulo, acutangulo, equilatero, isosceles;
		
		Float[] valores = new Float[3];
		
		for (int i = 0 ; i < valores.length ; i++) {
			valores[i] = entrada.nextFloat();
		}
		
		Arrays.sort(valores, Collections.reverseOrder());
		
		a = valores[0];
		b = valores[1];
		c = valores[2];
		
		retangulo = (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2));
		obtusangulo = ((Math.pow(b, 2) + Math.pow(c, 2)) < Math.pow(a, 2));
		acutangulo = ((Math.pow(b, 2) + Math.pow(c, 2)) > Math.pow(a, 2));
		equilatero = ((a == b) && (a == c));
		isosceles = (((a == b) && (a != c)) || ((a == c) && (a != b)) || ((b == c) && (b != a)));
		
		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
			System.exit(0);
		}
		if (retangulo) {
			System.out.println("TRIANGULO RETANGULO");
		} 
		if (obtusangulo) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if (acutangulo) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (equilatero) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if (isosceles) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		
		entrada.close();
	}
}

//Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, 
//de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que 
//estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
	//se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
	//se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
	//se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
	//se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
	//se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
	//se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES