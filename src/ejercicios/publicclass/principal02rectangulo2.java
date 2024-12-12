package ejercicios.publicclass;
public class principal02rectangulo2 {

	public static void main(String[] args) {
		
		rectangulo r1= new rectangulo ();
		r1.lado1=2;
		r1.lado2=3;
		
		rectangulo r2= new rectangulo ();
		r2.lado1=2;
		r2.lado2=3;
		
		rectangulo r3= new rectangulo ();
		r3.lado1=2;
		r3.lado2=3;
		
		rectangulo r4= new rectangulo ();
		r4.lado1=2;
		r4.lado2=3;
		
		rectangulo[] lista= new rectangulo[] {r1,r2,r3,r4};
		double areaTotal=0;
		for(int i=0;i<lista.length;i++) {
			
		     System.out.println(lista[i].calcularArea());
		     areaTotal=areaTotal+lista[i].calcularArea();
		}
		
		System.out.println(areaTotal);
		
	}
}
