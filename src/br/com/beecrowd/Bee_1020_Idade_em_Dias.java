package br.com.beecrowd;
import java.util.Scanner;
public class Bee_1020_Idade_em_Dias {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int dia, mes = 0, ano = 0;
		
		dia = input.nextInt();
		
		if (dia >= 365) {
			do {
				ano = dia / 365;
				dia %= 365;
			} while (dia >= 365);
		}
		if (dia >= 30) {
			do {
				mes = dia / 30;
				dia %= 30;
			} while (dia >= 30);
		}
		if (mes == 12) {
			mes = 0;
			ano++;
		}
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		input.close();
	}

}
