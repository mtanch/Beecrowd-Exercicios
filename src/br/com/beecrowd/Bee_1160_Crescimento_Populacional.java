package br.com.beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee_1160_Crescimento_Populacional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Integer anos = 0;
		float t, valorPa = 0, valorPb = 0, valorG1 = 0, valorG2 = 0;
		
		//	Quantidade de casos a serem processados;
		t = entrada.nextInt();
		
		if (t <= 0) {
			//	Não podem ser menores que 1;
			t = 1;
		} else if (t > 3000) {
			//	Não podem ser maiores que 3000;
			t = 300;
		}
		
		ArrayList<Float> pa = new ArrayList<>();	//	População da cidade A;
		ArrayList<Float> pb = new ArrayList<>();	//	População da cidade B;
		
		ArrayList<Float> g1 = new ArrayList<>();	//	Taxa de crescimento populacional da cidade A (Ao Ano);
		ArrayList<Float> g2 = new ArrayList<>();	//	Taxa de crescimento populacional da cidade B (Ao Ano);
		
		for (int i = 0 ; i < t ; i++) {
			
			valorPa = entrada.nextFloat();	//	Recebe os valores da população da cidade A;
			valorPb = entrada.nextFloat();	//	Recebe os valores da população da cidade B;
			
			pa.add(valorPa);
			pb.add(valorPb);
			
			valorG1 = entrada.nextFloat();	//	Recebe a taxa de crescimento da população da cidade A;
			valorG2 = entrada.nextFloat();	//	Recebe a taxa de crescimento da população da cidade B;
			
			g1.add(valorG1);
			g2.add(valorG2);
		}
		
		for (int i = 0 ; i < pa.size() ; i++) {
			
			while (valorPa <= valorPb) {
				
				//	Para ficar mais explicativo;
				float nroPopulacaoA = pa.get(i);
				float nroPopulacaoB = pb.get(i);

				//	Para ficar mais explicativo;
				float porcentCrescimendoCidadeA = (g1.get(i) / 100) + 1;
				float porcentCrescimendoCidadeB = (g2.get(i) / 100) + 1;
				
				//	Calculo dos valores: (Número da população atual * Porcentagem de crescimento da população Ao Ano);
				valorPa = (int) (nroPopulacaoA * porcentCrescimendoCidadeA);
				pa.set(i, valorPa);
				
				//	Calculo dos valores: (Número da população atual * Porcentagem de crescimento da população Ao Ano);
				valorPb = (int) (nroPopulacaoB * porcentCrescimendoCidadeB);
				pb.set(i, valorPb);
				
				anos++;
				
				if (anos > 100) {
					break;
				}
			}
			
			if (anos > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.println(anos + " anos.");
			}
			
			anos = 0;		//	reset
			valorPa = 0;	//	reset
			valorPb = 1;	//	reset
		}
		entrada.close();
	}

}
