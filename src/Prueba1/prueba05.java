package Prueba1;

public class prueba05 {

 
    
//Disponemos de un array de números  imprimir por la 
//consola el numero mas grande del array
    
    public static void main(String[] args) {

        int[] lista= new int[] {1,2,3,4,5};
    
        int i=0;
        int letras =0;
        while (i<lista.length) {
                                       
        if (lista[i]>letras){
    
        letras=lista[i];}
                 
            i++;
        }
 
        System.out.println("el numero mas grande del array es: "+(letras));
    }	
            
}	