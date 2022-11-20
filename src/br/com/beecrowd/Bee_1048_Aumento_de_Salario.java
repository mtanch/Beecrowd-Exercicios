import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee_1048_Aumento_de_Salario {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        float salario, novoSalario = 0;
        
        salario = entrada.nextFloat();
        
        if (salario >= 0 && salario <= 400) {
            novoSalario = salario * 1.15f;
            System.out.println("Novo salario: " + decimal.format(novoSalario));
            System.out.println("Reajuste ganho: " + decimal.format(novoSalario - salario));
            System.out.println("Em percentual: 15 %");
        } else if (salario > 400 && salario <= 800) {
            novoSalario = salario * 1.12f;
            System.out.println("Novo salario: " + decimal.format(novoSalario));
            System.out.println("Reajuste ganho: " + decimal.format(novoSalario - salario));
            System.out.println("Em percentual: 12 %");
        } else if (salario > 800 && salario <= 1200) {
            novoSalario = salario * 1.1f;
            System.out.println("Novo salario: " + decimal.format(novoSalario));
            System.out.println("Reajuste ganho: " + decimal.format(novoSalario - salario));
            System.out.println("Em percentual: 10 %");
        } else if (salario > 1200 && salario <= 2000) {
            novoSalario = salario * 1.07f;
            System.out.println("Novo salario: " + decimal.format(novoSalario));
            System.out.println("Reajuste ganho: " + decimal.format(novoSalario - salario));
            System.out.println("Em percentual: 7 %");
        } else if (salario > 2000) {
            novoSalario = salario * 1.04f;
            System.out.println("Novo salario: " + decimal.format(novoSalario));
            System.out.println("Reajuste ganho: " + decimal.format(novoSalario - salario));
            System.out.println("Em percentual: 4 %");
        }
        entrada.close();
    }
 
}