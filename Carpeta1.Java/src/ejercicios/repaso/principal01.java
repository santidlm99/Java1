package ejercicios.repaso;

import java.util.Scanner;

public class principal01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona p1=new persona();
		p1.edad=50;
		p1.nombre="ceci";

		persona p2=new persona();
		p2.edad=20;
		p2.nombre="catalina";

		
		// es una array;es una lista de personas y lleva corchetes
		//  persona[] mi lista = new persona[] {p1,p2}
		persona[] lista=new persona[] {p1,p2};
		lista[0]=p1;
		lista[1]=p2;
		
		int suma=0;
		int  contador=0;
 		for (int i=0;i<lista.length;i++) {
 	 		
 		System.out.println(lista[i].nombre);
 		System.out.println(lista[i].edad);
 		
 		//suma y añade la media
 		
 		suma=suma+lista[i].edad;
 		contador++;
 		}	
 		System.out.println("*****");
 		System.out.println(suma/contador);	
 	}	
 }		

