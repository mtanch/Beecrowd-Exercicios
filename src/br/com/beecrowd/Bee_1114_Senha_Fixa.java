package br.com.beecrowd;

import java.util.Scanner;

//	Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
//	Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
//	Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
//	Considere que a senha correta é o valor 2002.
public class Bee_1114_Senha_Fixa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int senha = 2002, input;
		
		do {
			input = entrada.nextInt();
			
			if (input == senha) {
				System.out.println("Acesso Permitido");
				entrada.close();
				System.exit(0);
			} else {
				System.out.println("Senha Invalida");
			}
			
		} while (true);		
	
	}
}
