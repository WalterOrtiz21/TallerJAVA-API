package api;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class ProductoControl {
	public boolean agregarproducto(String nombre, String proveedor, int precio){
		Basededatos bd = new Basededatos();
		Connection conexion;
		try {
			conexion=bd.conectar();
			
			String sql = "INSERT INTO public.producto (nombre,proveedor,precio)"
					+"VALUES (?,?,?)";
			PreparedStatement sentencia= conexion.prepareStatement(sql);
			sentencia.setString(1,nombre);
			sentencia.setString(2, proveedor);
			sentencia.setInt(3, precio);
			int resultado= sentencia.executeUpdate();
			sentencia.close();
			if (resultado > 0)
				System.out.println("true");
				return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("false");
		return false;
	}
}
