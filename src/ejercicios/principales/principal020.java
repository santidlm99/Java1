package ejercicios.principales;
 import java.util.Scanner;

public class principal020 {

	public static void main(String[] args) {   
			
			 try(Scanner sc = new Scanner(System.in)){
			int numero1 = 0;
			do {
				System.out.println("dame una nota");
				numero1 = sc.nextInt();
				System.out.println(numero1);
			} while (numero1>0);
			
			System.out.println("fin");	
		}	
	}
 }

// de esta forma podemos dar notas y seguir permitiendo dar notas
// hasta que demos el 0 o numero negativo y el programa finaliza

