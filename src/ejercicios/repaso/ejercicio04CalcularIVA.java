package ejercicios.repaso;

public class ejercicio04CalcularIVA {

	public static void main(String[] args) {

   // la clase factura con numero o importe y un constructor y un metodo que calcula el IVA


   // seleciono la clase factura y su improte X
   factura f= new factura(100,4);

   System.out.println(f.calcularconIVA(f.getImporte()));
   System.out.println(f.calcularSoloIVA(f.getImporte()));

   }
}