package model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class MyConnection {
	private static String serveurBD = "jdbc:mysql://127.0.0.1:3306/gestion_medecin?autoReconnect=true&useSSL=false";
	private static String login = "root";
	private static String motPasse = "";
	private static Connection con;

	private MyConnection() {

	}

	public static Connection getConnection() {
		if (con == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(serveurBD, login, motPasse);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return con;
	}

	
}
