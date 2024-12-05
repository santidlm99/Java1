package ejercicios.repaso;

public class ejercicio08 {

		// tenemos un array con textos o cadenas imprimir por la consola 
		// de mayor longitud utilizando un bucle while

		public static void main(String[] args) {

         //                                           //lista
			String [] lista = new String[] {"hola amigo","que tal","yo bien y tu"};

			int i=0;
			int letras =0;
			while (i<lista.length) {
				//                          te indica el numero de posiciones de la lista
				                         //System.out.println(lista[i].length());
			
			if (lista[i].length()>letras){

				letras=lista[i].length();}

				// de uno en uno
				i++;
			}
			System.out.println("la cadena mas larga es: "+letras);
			System.out.println("la palabra es: "+(letras));
		}	
	
		
	}	

			


