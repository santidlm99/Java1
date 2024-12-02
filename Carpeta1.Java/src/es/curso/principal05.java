package es.curso;

public class principal05 {
	public static void main(String[] args) {
	
	int[] lista= new int[] {2,5,6,7};
	int suma=0;

	
	for(int i=0;i<lista.length;i++) {
		
		System.out.println(lista[i]);
	
		suma=suma+lista[i];
     	}
			
		System.out.println(suma);
	 }
}
