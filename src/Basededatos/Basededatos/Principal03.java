
package Basededatos;

public class Principal03 {

public static void main(String[] args) {
		
	System.out.println("pepito");
	
	String nombre="menganito";
	String apellido1="gomez";
	String apellido2="perez";
	
	System.out.println(nombre);
	
	System.out.println("soy 'menganito'");
	System.out.println ("insert into persona values ('menganito')");
	
	System.out.println("soy '"  + nombre   + "'");
	
	System.out.println ("insert into persona values ('"  + nombre +   "')");

	System.out.println("soy 'menganito'''' $"    +apellido1+    "$ "+  apellido2 );
}
}