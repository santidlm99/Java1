package ejercicios.publicclass;

public class Bombilla {


private int intensidad;
// lo que se vaya a usar tiene que ser una funcion publica
//void es para que me modifique el valor. con el int y con el double te da un valor


	public int getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(int i) {
		if (i >= 0 && i <= 3)
			intensidad = i;
	}

	public void incrementar() {
        // setIncrementar es para que vuelva a pasar por el if y se cumpla la funcion

		setIntensidad(intensidad+1);
		//intensidad = intensidad + 1;
	}

	public void decrementar() {
		setIntensidad(intensidad-1);
		//intensidad = intensidad - 1;
	}

}
