package Prueba1;

public class Ordenador {


    private boolean encendido;

    public boolean estaEncendido() {
        return encendido;
    }

    public void encender() {
        if(encendido!=true)
        encendido=true;
    }   
    public void apagar() {
        if(encendido!=true)
        encendido=false;
    }

    public Ordenador(boolean encendido) {
        this.encendido = encendido;
    }
}
