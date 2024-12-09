package Prueba1;

public class prueba02 {

	public static void main(String[] args) {

// crea un array de tipo doble con 5 numeros y usar un bucle while para
// recorrerlo y sumar todos los elementos, imprimir la suma por la consola
         
               double[] lista= new double[] {1,2,3,4,5};

               double suma=0; 
               int i=0;

               while (i<lista.length) {
                   suma=suma+lista[i]; 
                i++;
            }
            System.out.println(suma);

    }	
}	
   