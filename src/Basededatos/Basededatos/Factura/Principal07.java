
package Basededatos.Factura;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal07 {

	public static void main(String[] args) {

		FacturaRepository01V repo = new FacturaRepository01V();
		ResultSet rs = repo.buscarTodos();

		try {
			while (rs.next()) {
	System.out.println(rs.getString("numero"));
	System.out.println(rs.getString("concepto"));
	System.out.println(rs.getString("importe"));
}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
}	