package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentLogin extends ConnectionJDBC {
	Connection con=null;
	PreparedStatement ps=null;
	
	public void login() {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the username : ");
		String username =src.next();
		
		System.out.println("Enter the password");
		String password =src.next();	
		
		try {
			ConnectionJDBC connect= new ConnectionJDBC();
		    con = connect.getconnection();
			String sql = "select * from student ";
			ps = con.prepareStatement(sql);
			PreparedStatement ps= con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				if(rs.getString(4).equals(username) && (rs.getString(5).equals(password))) {
						System.out.println("Login Successfully !!\n");
						break;
					}else {
						System.out.println("Enter correct username and password ");
					}
			}		
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	public static void main(String[] args) {
		StudentLogin log = new StudentLogin();
		log.login();
	}
		
}
