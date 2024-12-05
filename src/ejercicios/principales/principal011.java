package ejercicios.principales;
 import java.util.Scanner;

public class principal011 {

	public static void main(String[] args) {
		
		
		try (Scanner sc=new Scanner(System.in)) {
		
		System.out.println("eres mayor de edad");
		boolean esMayor= sc.nextBoolean();
		
		if(esMayor) {
			System.out.println("bienvenido al club");
		}else {
			System.out.println("te toca esperar");
		
			}
        }
		
	}

}
