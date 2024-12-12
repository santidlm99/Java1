package ejercicios.publicclass;

public class principal01factura {
	
	public static void main(String[] args) {
	
	factura f= new factura();
	f.importe=100;
	System.out.println(f.importe);
	System.out.println(f.calcularconIVA(100));
	System.out.println(f.calcularSoloIVA(100));

	}
}