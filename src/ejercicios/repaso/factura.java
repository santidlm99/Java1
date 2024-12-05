package ejercicios.repaso;

public class factura {
	// private 
	private double importe;
	// selecciono int numero
	private int numero; 
 	// Clik derecho accion codigo Getters and Setters > Selecciono ambas
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	// Clik derecho accion codigo Constructor > Selecciono ambas



// LO INDICO YO AL PRINCIPIO

	public double calcularconIVA(double importe) {
		
		return importe * 1.21;
		
	}
	public factura(double importe, int numero) {
		this.importe = importe;
		this.numero = numero;
	}
	public double calcularSoloIVA (double importe) {
		
		return importe * 0.21;
	// VOY AL EJERCICIO
	}
}

