package ejercicios.principales;
import java.util.Scanner;

public class principal007nota {

	public static void main(String[] args) {
		
		try(Scanner sc= new Scanner(System.in)) {
		
		System.out.print("introduce tu nombre");
		
		String nombre=sc.next();
		System.out.println(nombre);
		System.out.println("has introducido el nombre: ");
		System.out.println("introduce tu nota: ");	
		
		int nota= sc.nextInt();
		
		if (nota<5) {
			
			System.out.println("suspendido");
		}else if (nota>7 && nota<8) {
			System.out.println("notable");
		}else {
			
			System.out.println("sobresaliente");
			
			}
		}
		

	}

}
