package Stuff;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB {
	private static DB DB = new DB();
	private static Connection conn;
	private String driverDB = "org.postgresql.Driver";
	 private String dbName = "zoo";
	private String urlDB = "jdbc:postgresql://localhost:5432/" + this.dbName;
	private String userDB = "postgres";
	private String passDB = "admin"; 

	 private DB(){
	try {
	Class.forName(driverDB);
	conn = DriverManager.getConnection(urlDB, userDB, passDB);
	System.out.println("Conexion establecida");
	} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
	}
	}
	
	 public static Connection getConnection(){
		 
		    if (conn == null){
		 new DB();
		    }
		 
		    return conn;
		}
}
