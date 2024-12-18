package Basededatos.Factura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FacturaRepository01 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * from Facturas";

	public void insertar(Factura  factura) {

		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();

			sentencia.executeUpdate("insert into facturas values ('" + factura.getNumero() + "','" + factura.getConcepto() + "'," + factura.getImporte() + ")");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void borrar(Factura factura) {
		
		try {
			 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement sentencia = conexion.createStatement();
		     
		     String consultaborrar="delete from facturas where numero='"+factura.getNumero()+"' and concepto='"+factura.getConcepto()+"' and importe="+factura.getImporte()+";";
		     
		     System.out.println(consultaborrar);
		     
		     sentencia.executeUpdate(consultaborrar);
		   {		      
		  
		  }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}

}