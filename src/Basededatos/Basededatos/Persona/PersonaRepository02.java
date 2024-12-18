package Basededatos.Persona;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Basededatos.Persona.Persona01;

@SuppressWarnings("unused")
public class PersonaRepository02{

	   static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
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
		     
		     String consultaborrar="delete from personas where nombre='"+persona.getNombre()+"' and apellidos='"+persona.getApellidos()+"' and edad="+persona.getEdad()+";";
		     
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
