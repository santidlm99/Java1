	package ejercicios.Composicion.Turista;

	import java.util.ArrayList;
	import java.util.Iterator;
	
	public class principal37 {
	
		public static void main(String[] args) {
	
			TuristaRico pepito=new TuristaRico("pepito");
			
			Maletas m1=new Maletas("sansonite",12);
			Maletas m2=new Maletas("benzi",5);
			
			pepito.addMaletas(m1);
			pepito.addMaletas(m2);
			
			ArrayList<Maletas> maletas=pepito.getMaletas();
			
			for(int i=0;i<maletas.size();i++) {
				
				Maletas maletaR=maletas.get(i);
				
				System.out.println(maletaR.getModelo());
				System.out.println(maletaR.getPeso());
				
				System.out.println(maletas.get(i).getModelo());
				System.out.println(maletas.get(i).getPeso());
				
			}
			
			for (Maletas m :maletas) {
				
				System.out.println(m.getModelo());
				System.out.println(m.getPeso());
				
			}
			
			Iterator<Maletas> it=maletas.iterator();
			
			while(it.hasNext()) {
				
				System.out.println(it.next().getModelo());
				System.out.println(it.next().getPeso());
				
			}
		
		}
	
	}