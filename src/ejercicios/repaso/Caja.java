package ejercicios.repaso;

public class Caja {

// selecciono private en las 3 variables
	private double alto;
	private double ancho;
	private double largo;
	//// Clik derecho accion codigo Getters and Setters > Selecciono ambas
	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
// Clik derecho accion codigo Constructor > Selecciono ambas
	public Caja(double alto, double ancho, double largo) {
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double calcularCaja() {
		

		// indico el calculo
		return alto*ancho*largo;

	}
}
	
	


