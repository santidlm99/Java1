package ejercicios.repaso;

public class ejercicio02 {
	
	//Recorrer la cadena "hola amigo que tal estas" o imprimir todo por la consola

	public static void main(String[] args) {

   // establecer cadena de palabras (string palabra)
		String nombre="hola amigo que tal estas";

	//para ello usamos el bucle for
	// i=0, empieza desde la posicion 0, en este caso la h
	// seleccionamos la palabra que vamos a recorrer
	// length que calcule la longitud de la lista
	// i++ que vaya de uno en uno
		for (int i=0;i<nombre.length();i++) {

		//charAt > caracter que esta en la posicion seleccionada()
		System.out.println(nombre.charAt(i));
		
		}
		
	
	}
	
}
