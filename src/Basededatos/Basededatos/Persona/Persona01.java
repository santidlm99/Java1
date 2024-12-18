package Basededatos.Persona;

public class Persona01 {
    
    private String nombre;
    private String apellidos;
    private int edad;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Persona01(String nombre, String apellidos, int edad) {
    
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    }
    


