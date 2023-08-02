package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

public class ConnectionJDBC {
	
    Connection connection=null;
	public Connection getconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			return connection;
	}

}

//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class ConnectionJDBC {
//	
//	Connection connection = null;
//	public Connection getConnectionDetails() {
//		try {
//			Class.forName("con.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","root");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return connection;
//	}
//
//}







