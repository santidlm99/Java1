	package ejercicios.Composicion.Turista;
	
		import java.util.ArrayList;

		public class TuristaRico extends Superturista {
		
			private ArrayList<Maletas> maletas = new ArrayList<Maletas>();
		
			public ArrayList<Maletas> getMaletas() {
				return maletas;
			}
		
			public void setMaletas(ArrayList<Maletas> maletas) {
				this.maletas = maletas;
			}
		
			public TuristaRico(String nombre) {
				super();
				this.setNombre(nombre);
			}
		
			public void addMaletas(Maletas maletita) {
				
				maletas.add(maletita);
				
			}
			
		}
	