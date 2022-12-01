package br.com.beecrowd;

import java.util.Scanner;
public class Bee_1046_Tempo_de_Jogo
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    int horaInicial, horaFinal, duracao = 0;
	    
	    horaInicial = entrada.nextInt();
	    horaFinal = entrada.nextInt();
	    
	    if (horaInicial >= 0 && horaInicial <= 24 && horaFinal >= 0 && horaFinal <= 24) {
    	    if (horaInicial == horaFinal) {
    	        duracao = 24;
    	    } else if (horaInicial > horaFinal) {
    	        horaFinal += 24;
    	        duracao = horaFinal - horaInicial;
    	    } else if (horaInicial < horaFinal) {
    	        duracao = horaFinal - horaInicial;
    	    }
	    }
	    
	    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	    
	    entrada.close();
	}
}
