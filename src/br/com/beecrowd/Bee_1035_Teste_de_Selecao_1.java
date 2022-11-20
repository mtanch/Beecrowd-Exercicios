package br.com.beecrowd;
import java.util.Scanner;

public class Bee_1035_Teste_de_Selecao_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
        int a, b, c, d;
        
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();
        
        boolean moduloA = a % 2 == 0;
        
        if (b > c) {
            if (d > a) {
                if ((c + d) > (b + a)) {
                    if (c > 0 && d > 0) {
                        if (moduloA) {
                            System.out.println("Valores aceitos");
                        } else {
                            System.out.println("Valores nao aceitos");
                        }
                    } else {
                        System.out.println("Valores nao aceitos");
                    }
                } else {
                    System.out.println("Valores nao aceitos");
                }
            } else {
                System.out.println("Valores nao aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }
        
        entrada.close();
	}

}
