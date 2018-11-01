package api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Basededatos {
	private Connection conexion=null;
	private String user="postgres";
	private String pass="@lumno123";
	private String bd="jdbc:postgresql://localhost:5432/prueba";
	
	public Connection conectar() throws SQLException, ClassNotFoundException{
		try {
			Class.forName("org.postgresql.Driver");
			conexion=DriverManager.getConnection(bd,user,pass);
			System.out.println("Conectamos");
			return conexion;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
			throw e;
		}
		
	}
}
