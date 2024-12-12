package ejercicios.publicclass;
public class principal02 {

	public static void main(String[] args) {
		
		Persona paula= new Persona ();
		paula.edad=28;
		paula.nombre="paula";
		
		Persona manu= new Persona();
		manu.edad=26;
		manu.nombre="manu";
		
		Persona[] alumnos = new Persona [] {paula,manu};
		
 		for (int i=0;i<alumnos.length;i++) {
 		
 		System.out.println(alumnos[i].nombre);
 		System.out.println(alumnos[i].edad);
 		}
	}
}