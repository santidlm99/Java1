
package es.curso;

public class principal04Inf
 {

	public static void main(String[] args) {
		
		
		int[] lista= new int[] {1,2,3,4};
		
		for(int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i]);
		}
		int mayor= numeromayor(lista);
		System.out.println("****");
		System.out.println(mayor);
	}
		
 
	public static int numeromayor(int[]myarray) {
		
		int mayor=0;
		for(int i=0;i<myarray.length;i++) {
			if (myarray[i]>mayor) {
				
				mayor=myarray[i];
		
			}
		}
	return mayor;
	
}
}