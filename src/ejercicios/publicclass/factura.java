package ejercicios.publicclass;

public class factura {
	
	public double importe;
	public double calcularconIVA(double importe) {
		
		return importe * 1.21;
		
	}
	public double calcularSoloIVA (double importe) {
		
		return importe * 0.21;
	
	}
}

