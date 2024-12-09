package Prueba1;

public class prueba03 {

	public static void main(String[] args) {

// crear una clase ordenador que contiene la propiedad encendido de tipo boolean, crear 
// un metodo para encenderlo y otro para apagarlo y otro para comprobar si esta encendido
    
private boolean encendido;

    public Ordenador() {
        this.encendido = false;
    }
    public void encender() {
        this.encendido = true;
        System.out.println("El ordenador está encendido.");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("El ordenador está apagado.");
    }
    public boolean estaEncendido() {
        return this.encendido;
    
    }
}	
 