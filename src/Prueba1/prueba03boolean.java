package Prueba1;

public class prueba03boolean {

	public static void main(String[] args) {

// crear una clase ordenador que contiene la propiedad encendido de tipo boolean, crear 
// un metodo para encenderlo y otro para apagarlo y otro para comprobar si esta encendido
     
        Ordenador o=new Ordenador(false);
    System.out.println(o.estaEncendido());
    o.encender();
    System.out.println(o.estaEncendido());
    o.apagar();


    }	
}	
 