package br.com.beecrowd;

import java.util.Scanner;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
 * Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
 * Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
 * O programa será encerrado quando o código informado for o número 4.
 * 
 * 	Saída
 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.*/

public class Bee_1134_Tipo_de_Combustivel {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tipoCombustivel = 0, alcool = 0, gasolina = 0, diesel = 0;
		
		do {
			
			try {
				tipoCombustivel = entrada.nextInt();
			} catch (IndexOutOfBoundsException e) {
				break;
			}
			
			switch (tipoCombustivel) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				//	Fim
				break;
			default:
				break;
			}
			
		} while(tipoCombustivel != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		entrada.close();
	}

}
