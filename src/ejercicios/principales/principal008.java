package ejercicios.principales;
import java.util.Scanner;

public class principal008 {

	public static void main(String[] args) {
		// decimales
		
	try (Scanner sc=new Scanner(System.in)) {
		System.out.println("mete el valor");
		
		double numero=sc.nextDouble();
		System.out.println(numero);
		
		if (numero>=0 && numero<5) {
		System.out.println("has suspendido");
	   }else {
		System.out.println("has aprobado");
	  }
    } catch (Exception e) {

		//todo auto-generated catch block
		System.out.println("oye que lo tienes mal");
	
			}	
        }
		
	}


