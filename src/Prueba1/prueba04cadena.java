package Prueba1;

public class prueba04cadena {

    public static void main(String[] args) {
        
        // Disponemos de la cadena "hola me llamo pepe y soy informatico" .  Queremos recorrer
        // la cadena con un bucle y obtener el numero de letras "e" que el texto contiene
                                   
               String cadena = "hola me llamo pepe y soy informatico";
             int contador=0;

             for (int i=0;i<cadena.length();i++) {

                 if (cadena.charAt(i)=='e') {
                     System.out.println(cadena.charAt(i));
                    contador++;
            }	
        }	
            System.out.println("Numero de veces la vocal e repetida: ");
    System.out.println(contador);
   
    }
}	           