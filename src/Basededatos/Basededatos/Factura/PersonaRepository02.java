package Basededatos.Factura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Basededatos.Persona.Persona01;

public class PersonaRepository02{

	   static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
	   static final String USER = "root";
	   static final String PASS = "";
	   static final String QUERY = "SELECT * from Personas";

	public void insertar(Persona01 persona) {
		
		try {
			 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement sentencia = conexion.createStatement();
		     sentencia.executeUpdate("insert into personas values ('"+persona.getNombre()+"','"+persona.getApellidos()+"',"+persona.getEdad()+");");
		   {		      
		  
		  }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
	
	public void borrar(Persona01 persona) {
		
		try {
			 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement sentencia = conexion.createStatement();
		     
		     String consultaborrar="delete from personas where nombre='"+persona.getNombre()+"' and apellidos='"+persona.getApellidos()+"' and edad="+persona.getEdad();
		     
		     System.out.println(consultaborrar);
		     
		     sentencia.executeUpdate(consultaborrar);
		   		      
		  
		  
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

}

	public  ArrayList<Factura> lista buscarTodos() {

		ResultSet rs=null;
		Connection conexion=null;
		ArrayList<Factura> lista = new ArrayList<Factura>();
		try {
			//conecto a la base de datos
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			//preparo la sentencia
			Statement sentencia = conexion.createStatement();
			//ejecuto
			rs = sentencia.executeQuery("select * from Personas");
			
			while (rs.next()) {
				Factura f = new Factura(rs.getInt("numero"),rs.getString("concepto"),rs.getDouble("importe"));
				lista.add(f);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{

			if (conexion!=null) {
				try {
			conexion.close();
				} catch (SQLException e) {
				e.printStackTrace();
				}
			}
}

		return lista;
	}
}
