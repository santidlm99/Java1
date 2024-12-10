package ejercicios.principales;
 import java.util.Scanner;

public class principal012Gastos {

	public static void main(String[] args) {
		
		System.out.println("dame un gasto comida:");
		 try (Scanner sc=new Scanner(System.in)) {
		int gasto1 =sc.nextInt();
		//System.out.println(gasto1);
		
		System.out.println("dame un gasto desayunos:");
		int gasto2 =sc.nextInt();
		//System.out.println(gasto2);
		
		System.out.println("dame una cena:");
		int gasto3 =sc.nextInt();
		//System.out.println(gasto3);
		
	
		System.out.println("la comida es:"+ gasto1);
		System.out.println("los cafes y los desayunos son:"+ gasto2);
		System.out.println("la cena es:"+ gasto3);
		
		if (gasto1>100) {
			System.out.println("estas despedido");
		}else {
			
			int comidaDesayuno=gasto1+gasto2;
			
			if (comidaDesayuno>110) {
				System.out.println("estas despedido simpatico");
				
			int todo=gasto1+gasto2+gasto3;
			
			if (todo>150) {
				
				System.out.println("super perdido");
				
					}
				
				}
		
			}
		
		}
	}
}
