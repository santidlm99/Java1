package es.curso;

public class principal02 {

	public static void main(String[] args) {
	
		int numero1=5;
		int numero2=7;
		int numero3=3;
	// invocación de la funcion
	//asignar el resultado
		
		System.out.println("el resultado de la suma es:"+sumar(numero1,numero2,numero3));
		

		int numero4=9;
		int numero5=10;
	//recibo el resultado y lo imprimo
		System.out.println ("el resultado de la suma es:"+sumar(numero3,numero4,numero5));
		
 	}
		
		//no es sencillo de entender
		
		public static int sumar(int n1, int n2, int n3) {
			
			int suma=n1+n2+n3;
			return suma;
		}
			
		public static int restar(int n1, int n2) {
				
			int resta=n1-n2;
			
			return resta;
	}

}
