package connect;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dbConnection {
	public static Connection connect() {
	try {
		String url="jdbc:mysql://localhost:3306/gestion_medecin?autoReconnect=true&useSSL=false";
		String username="root";
		String password="";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, username, password);
		
		return conn;
	}catch(ClassNotFoundException |SQLException e) {
		Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE,null,e);
		
	}
		return null;
		
	}

}
