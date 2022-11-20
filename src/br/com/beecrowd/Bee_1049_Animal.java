import java.util.Scanner;
public class Bee_1049_Animal
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    String classificacao = null, tipo = null, caracteristicaAlimentar = null;
	    
	    classificacao = entrada.nextLine();
	    
	    if (classificacao.equals("vertebrado")) {
	        tipo = entrada.nextLine();  //---------------
	        if (tipo.equals("ave")) {
	            caracteristicaAlimentar = entrada.nextLine();   //---------------
	            if (caracteristicaAlimentar.equals("carnivoro")) {
	                System.out.println("aguia");   //Resultado
	            } else if (caracteristicaAlimentar.equals("onivoro")) {
	                System.out.println("pomba");   //Resultado
	            }
	        } else if (tipo.equals("mamifero")) {
	            caracteristicaAlimentar = entrada.nextLine();   //---------------
	            if (caracteristicaAlimentar.equals("onivoro")) {
	                System.out.println("homem");   //Resultado
	            } else if (caracteristicaAlimentar.equals("herbivoro")) {
	                System.out.println("vaca");   //Resultado
	            }
	        }
	    } else if (classificacao.equals("invertebrado")) {
	        tipo = entrada.nextLine();  //---------------
	        if (tipo.equals("inseto")) {
	            caracteristicaAlimentar = entrada.nextLine();   //---------------
	            if (caracteristicaAlimentar.equals("hematofago")) {
	                System.out.println("pulga");   //Resultado
	            } else if (caracteristicaAlimentar.equals("herbivoro")) {
	                System.out.println("lagarta");   //Resultado
	            }
	        } else if (tipo.equals("anelideo")) {
	            caracteristicaAlimentar = entrada.nextLine();   //---------------
	            if (caracteristicaAlimentar.equals("hematofago")) {
	                System.out.println("sanguessuga");   //Resultado
	            } else if (caracteristicaAlimentar.equals("onivoro")) {
	                System.out.println("minhoca");   //Resultado
	            }
	            
	        }
	        
	    }
	    entrada.close();
	}
	
}
