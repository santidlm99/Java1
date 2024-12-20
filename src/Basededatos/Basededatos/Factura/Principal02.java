package Basededatos.Factura;


public class Principal02 {

		   public static void main(String[] args) {

			FacturaRepository01V Repo = new FacturaRepository01V();
			Factura f = new Factura (2,"teclado",5.2);
			Repo.insertar(f);
			


		   }}