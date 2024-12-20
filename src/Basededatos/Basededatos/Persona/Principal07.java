
package Basededatos.Persona;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal07 {

	public static void main(String[] args) {

		PersonaRepository01 repo = new PersonaRepository01();
		ResultSet rs = repo.buscarTodos();

		try {
			while (rs.next()) {
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString("apellido"));
				System.out.println(rs.getInt("años"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}