
package Basededatos;



public class Principal06 {

	public static void main(String[] args) {

PersonaRepository02 repo = new PersonaRepository02();
Persona01 p = new Persona01("Juanito","Gomez",20);
repo.insertar(p);
repo.borrar(p);

	}
}