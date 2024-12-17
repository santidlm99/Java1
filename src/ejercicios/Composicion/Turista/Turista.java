	package ejercicios.Composicion.Turista;

	public class Turista extends Superturista{

		private Maletas maleta1;
		private Maletas maleta2;
		
		public Maletas getMaleta1() {
			return maleta1;
		}
		public void setMaleta1(Maletas maleta1) {
			this.maleta1 = maleta1;
		}
		public Maletas getMaleta2() {
			return maleta2;
		}
		public void setMaleta2(Maletas maleta2) {
			this.maleta2 = maleta2;
		}
		
		public Turista(String nombre) {
			super();
			this.setNombre(nombre);
		}
		
		public double pesototal() {
			if(maleta1!=null && maleta2!=null) {
				return maleta1.getPeso()+maleta2.getPeso();
			}else if(maleta1!=null && maleta2==null) {
				return maleta1.getPeso();
			}else{
				return maleta2.getPeso();
			}
			
		}
		
		public double pesototal(double peso1, double peso2) {
			
			return peso1+peso2;
			
		}
		
		public double pesototal2() {
			double pesototal=0;
			if(maleta1!=null)
				pesototal=pesototal+maleta1.getPeso();
			if(maleta2!=null)
				pesototal=pesototal+maleta2.getPeso();
			return pesototal;
			
		}
		
		public double pesototal2(double sobrepeso) {
	
			return pesototal()+sobrepeso;
			
		}
		
		public double pesototal2(String tipocarcasa) {
			double pesototal=pesototal();
			if(tipocarcasa.equals("ligera")) {
				pesototal=pesototal+2;
			}else {
				pesototal=pesototal+4;
			}
			return pesototal;
			
		}
	
	}
	