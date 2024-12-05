package ejercicios.principales;
 import java.util.Scanner;

public class principal021 {

	public static void main(String[] args) {   
	
    	try (Scanner sc = new Scanner(System.in)){
    	
			int i=0;
			int suma=0;
			int numero=0;
			
			do {
				System.out.println("dame un numero");
				numero = sc.nextInt();
				suma=suma+numero;
				i++;

			}	while (numero!=-1);
			
			System.out.println(suma/i);
			
		}
	}	
 }

