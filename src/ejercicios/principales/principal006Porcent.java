
package ejercicios.principales;

import java.util.Scanner;

public class principal006Porcent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        try (Scanner sc= new Scanner(System.in)){
		
		System.out.print("introduce tu nombre:");
		
		String nombre=sc.next();
		System.out.println(nombre);
		System.out.println("has introducido el nombre: ");
		System.out.println("introduce tu edad: ");	
        int edad= sc.nextInt();
		
		if (edad<18) {
			
		    System.out.println("es gratis campeon");  
		}else {

			if (edad>18 && edad<30) {
			
			System.out.println("te hacemos un 20%");
		}else if (edad>30 && edad<50) {
			System.out.println("te hacemos un 20%");
		}else {
			
			System.out.println("te hacemos un 10%");
			}
		}
	 }
  }

}
