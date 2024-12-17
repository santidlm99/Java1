	package ejercicios.Composicion.Turista;

	public class Principal01 {

		public static void main(String[] args) {

			Maletas m1 = new Maletas("ibm",15);
			Maletas m2 = new Maletas("lg",13);
			Turista t1 = new Turista("Carlos");
			t1.setMaleta1(m1);
			t1.setMaleta2(m2);
			//System.out.println(t1.pesototal());
			//System.out.println(t1.pesototal1(m1.getPeso(),m2.getPeso()));
			System.out.println(t1.pesototal2());
			System.out.println(t1.pesototal2(1));
			System.out.println(t1.pesototal2("ligera"));
		
		}
	
	}
	