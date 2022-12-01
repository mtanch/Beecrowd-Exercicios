package br.com.beecrowd;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bee_1061_Tempo_de_um_Evento {

	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		
		int dias = 0;
		String horaIni, horaFinal, diaIni, diaFinal;
		long horasEmMilisegundos = 0, horas, minutos, segundos;
		
		diaIni = entrada.nextLine();
		horaIni = entrada.nextLine();
		diaFinal = entrada.nextLine();
		horaFinal = entrada.nextLine();
		
		diaIni = diaIni.replace("Dia ", "");		//	Substituindo caracteres indesejados na String
		diaFinal = diaFinal.replace("Dia ", "");	//	Substituindo caracteres indesejados na String
		horaIni = horaIni.replace(" ", "");
		horaFinal = horaFinal.replace(" ", "");
		
		Date h1 = format.parse(horaIni);	//	convertendo String para Date
		Date h2 = format.parse(horaFinal);	//	convertendo String para Date
		
		if (h1.getTime() > h2.getTime()) {		// verificando se a hora inicial é maior que a hora final
			dias = (Math.abs(Integer.parseInt(diaIni) - Integer.parseInt(diaFinal)) - 1); 	//	-1 pois ainda não completou as 24h para contar como um dia inteiro.
			horasEmMilisegundos = Math.abs((h2.getTime() - h1.getTime()) + 86400000);		//	convertendo as horas para milissegundos 
			//	86400000 milissegundos equivale a 24h.
			//	Somei para regular o horário 
			//	pois se a hora inicial for maior que a hora final o resultado sairia errado
			//	por exemplo: 
			//	Hora Inicial: 22:00:00 e Hora final = 02:00:00 
			//	Subtraindo, o resultado seria 20:00:00
			//	Mas o esperado é que ele inicie às 22h em um dia e finalize às 2h no dia seguinte
			//	Ou seja, Abs(22h - (2h + 24h))
			//	Totalizando 04:00:00 passadas.
		} else {
			horasEmMilisegundos = Math.abs(h2.getTime() - h1.getTime());					//	convertendo as horas para milissegundos
			dias = Math.abs(Integer.parseInt(diaIni) - Integer.parseInt(diaFinal));
		}
		
		horas = (horasEmMilisegundos / (60 * 60 * 1000)) % 24;		//	Definindo as horas
		minutos = (horasEmMilisegundos / (60 * 1000)) % 60;			//	Definindo os minutos
		segundos = (horasEmMilisegundos / 1000) % 60;				//	Definindo os segundos
		
		System.out.println(dias + " dia(s)\n" 
						+ horas + " hora(s)\n" 
						+ minutos + " minuto(s)\n" 
						+ segundos + " segundo(s)");
		
		entrada.close();
	}
}
