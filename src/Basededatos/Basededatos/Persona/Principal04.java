
package Basededatos.Persona;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal04 {
		
		   static final String DB_URL = "jdbc:mysql://localhost:8889/cie1";
		   static final String USER = "root";
		   static final String PASS = "root";
		   static final String QUERY = "SELECT * from Personas";

		   public static void main(String[] args) {
		      // Open a connection
		    try {
					 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				     Statement sentencia = conexion.createStatement();
				     
				     String nombre="ceci1";
				     String apellidos="alvarez";
				     int edad=50;
				     
				     sentencia
				     .executeUpdate("insert into personas values ('ceci','alvarez',50)");
				     
				     sentencia
				     .executeUpdate("insert into personas values ('" +  nombre+"','"+apellidos+"',"+edad+")");
				
				  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		   }
		

}