package ejercicios.repaso;

public class ejercicio03 {
	
	//Recorrer la cadena "hola amigo que tal estas" o imprimir sus vocales por la consola

	public static void main(String[] args) {

   // establecer cadena de palabras (string palabra)
		String nombre="hola amigo que tal estas";

		for (int i=0;i<nombre.length();i++) {
		 //charAt > caracter que esta en la posicion()

		if (nombre.charAt(i)=='a'||nombre.charAt(i)=='e'||nombre.charAt(i)=='i'||nombre.charAt(i)=='o'||nombre.charAt(i)=='u') {
			
			System.out.println(nombre.charAt(i));
			}
		}
	}
}

