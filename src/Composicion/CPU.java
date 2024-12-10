package Composicion;

public class CPU {

    private String marca;
    private String procesador;
    private String precio;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public CPU(String marca, String procesador, String precio) {
        this.marca = marca;
        this.procesador = procesador;
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMarca() {

        return marca;
    
    }
}
