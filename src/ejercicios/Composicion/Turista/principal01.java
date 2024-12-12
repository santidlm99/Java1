package ejercicios.Composicion.Turista;

public class principal01 {

  // La clase turista y la clase maleta: el turista tiene nombre y 
  // las maletas tienen modelo y peso, un turista puede llevar dos maletas
  // cuanto peso soporta el turista
	public static void main(String[] args) {
		
		Maleta m1= new Maleta("adidas",5);
		System.out.println(m1.getModelo());
		System.out.println(m1.getPeso());
		
		Maleta m2= new Maleta("nike",10);
		System.out.println(m2.getModelo());
		System.out.println(m2.getPeso());
		
		
		Turista o= new Turista("nombre");
		o.setMaleta1(m1);
		o.setMaleta2(m2);

        System.out.println(o.pesototal());
		

	}

}