
package Basededatos.Factura;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Principal08 {

	public static void main(String[] args) {

PersonaRepository02 repo = new PersonaRepository02();
ArrayList<Factura> lista = repo.buscarTodos();
for (Factura f: lista) {

	System.out.println(f."getNumero"());
	System.out.println(f."getConcepto"());
	System.out.println(f."getImporte"());

			}
		}
	}

		