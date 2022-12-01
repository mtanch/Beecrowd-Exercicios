package br.com.beecrowd;

public class Bee_1098_Sequencia_IJ_4 {
	public static void main(String[] args) {
	    
		for (int i = 0 ; i <= 20 ; i = i + 2) {
			for (int j = 10 ; j <= 30 ; j = j + 10) {
				int soma = i + j;
				double somaDecimal = (double)(i + j) / 10;
				
				double iDecimal = (double)i / 10;
				
				boolean iTemCasaDecimal = i % 10 != 0;
				boolean jTemCasaDecimal = soma % 10 != 0;
				
				if (!iTemCasaDecimal) {
					
					System.out.print("I=" + i / 10);
					
					if (!jTemCasaDecimal) {
						System.out.println(" J=" + soma / 10);
					} else if (jTemCasaDecimal) {
						System.out.println(" J=" + somaDecimal);
					}
				} else {
					System.out.print("I=" + iDecimal);
					
					if (!jTemCasaDecimal) {
						System.out.println(" J=" + soma / 10);
					} else if (jTemCasaDecimal) {
						System.out.println(" J=" + somaDecimal);
					}
				} 
			}
		}
	}
}

/*	
I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?*/
