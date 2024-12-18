package Basededatos.Factura;


public class Principal02 {

		   public static void main(String[] args) {

			FacturaRepository01 Repo = new FacturaRepository01();
			Factura f = new Factura (2,"teclado",5.2);
			Repo.insertar(f);
			


		   }}