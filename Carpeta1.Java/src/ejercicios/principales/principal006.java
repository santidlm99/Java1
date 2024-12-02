package ejercicios.principales;
import java.util.Scanner;

public class principal006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner= new Scanner(System.in);
		
		System.out.print("introduce tu nombre:");
		
		String nombre=scanner.next();
		
		System.out.println("has introducido el nombre: ");
		System.out.println("introduce tu edad: ");	
        int edad= scanner.nextInt();
		
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
