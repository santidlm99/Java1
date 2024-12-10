package ejercicios.principales;
 import java.util.Scanner;

public class principal013Clase {

	public static void main(String[] args) {
		
		int notafinal=0;
		
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("asistir a clase:");
		boolean asiste=sc.nextBoolean();
		if(asiste) {
			
		notafinal= notafinal+2;
		
		}
		
		System.out.println("hizo los deberes:");
		boolean deberes=sc.nextBoolean();
		if(deberes) {
		
			notafinal= notafinal+3;
			}
			System.out.println(notafinal);
	
		}	
	}	
				
}
	