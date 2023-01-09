package br.com.beecrowd;

import java.util.Scanner;

/*Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. 
 * Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim). 
 * Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). 
 * O programa ser� encerrado quando o c�digo informado for o n�mero 4.
 * 
 * 	Sa�da
 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel.*/

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
