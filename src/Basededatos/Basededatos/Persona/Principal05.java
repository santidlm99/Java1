
package Basededatos.Persona;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Principal05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Path ruta = Paths.get("hola.txt");

		try {
			List<String> lineas = Files.readAllLines(ruta);

			for (String linea : lineas) {

				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("hola majo que no va no hay fichero");
		}finally {
			System.out.println("cerrar");
		}

	}
}