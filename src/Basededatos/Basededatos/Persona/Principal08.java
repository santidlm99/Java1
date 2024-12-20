
package Basededatos.Persona;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal08 {

	public static void main(String[] args) {

		// instancio el repositorio
		PersonaRepository01 repo = new PersonaRepository01();
		//llamo al metodo buscarTodos()
		// ese metodo devuelve un resultSet
		// lo asocio
		ResultSet rs = repo.buscarTodos();

		//ya tengo un resultset 
		//lo recorro como lo recorri otras veces 
		try {
			while (rs.next()) {

				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString("apellidos"));
				System.out.println(rs.getInt("años"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
