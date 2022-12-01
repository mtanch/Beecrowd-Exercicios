package br.com.beecrowd;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Bee_1051_Imposto_de_Renda
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    DecimalFormat decimal = new DecimalFormat("0.00");
	    
	    float salario, valorReajustado = 0, oitoPorcento = 0, dezoitoPorcento = 0;
	    
	    salario = entrada.nextFloat();
	    
	    if (salario >= 0 && salario <= 2000) {
	        System.out.println("Isento");
	    } else if (salario > 2000 && salario <= 3000) {
	        valorReajustado = salario - 2000f;
	        valorReajustado *= 0.92f;
	        valorReajustado += 2000f;
	        System.out.println("R$ " + decimal.format(salario - valorReajustado));
	    } else if (salario > 3000 && salario <= 4500) {
	        valorReajustado = salario - 3000f;
	        oitoPorcento = 1000f * 0.92f;
	        valorReajustado *= 0.82f;
	        valorReajustado += 2000f;
	        valorReajustado += oitoPorcento;
	        System.out.println("R$ " + decimal.format(salario - valorReajustado));
	    } else if (salario > 4500) {
	        valorReajustado = salario - 4500f;
	        oitoPorcento = 1000f * 0.92f;
	        dezoitoPorcento = 1500 * 0.82f;
	        valorReajustado *= 0.72f;
	        valorReajustado += 2000f;
	        valorReajustado += oitoPorcento;
	        valorReajustado += dezoitoPorcento;
	        System.out.println("R$ " + decimal.format(salario - valorReajustado));
	    }
	    entrada.close();
	}
	
}

//    0000.00   a   2000    =   isento
//    2000.01   a   3000    =   8%
//    3000.01   a   4500    =   18%
//    acima de 4500         =   28%
