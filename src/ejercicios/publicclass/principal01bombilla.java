package ejercicios.publicclass;

public class principal01bombilla {

	public static void main(String[] args) {
		Bombilla b = new Bombilla();
		b.incrementar();
		b.incrementar();
		System.out.println(b.getIntensidad());
		b.decrementar();
		System.out.println(b.getIntensidad());

	}

}