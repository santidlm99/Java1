package ejercicios.principales;
import java.util.Scanner;

public class principal007 {

	public static void main(String[] args) {
		// numeros enteros
		
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("introduce tu nombre");
		
		String nombre=scanner.next();
		
		System.out.println("has introducido el nombre: ");
		System.out.println("introduce tu nota: ");	
		
		int nota= scanner.nextInt();
		
		if (nota<5) {
			
			System.out.println("suspendido");
		}else if (nota>7 && nota<8) {
			System.out.println("notable");
		}else {
			
			System.out.println("sobresaliente");
			
			
		}
		

	}

}
