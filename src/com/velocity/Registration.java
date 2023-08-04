package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.velocity.ConnectionJDBC;

public class Registration {

	PreparedStatement prs=null;
	Connection con=null;
	
	public void registration(String fname,String lname,String username,String password ,String city,String mailId,String phno){
		try {
		ConnectionJDBC connect= new ConnectionJDBC();
	     con = connect.getconnection();
	      PreparedStatement prs = con.prepareStatement( "insert into student(fname,lname,username,password,city,mailId,phno)" + "values(?,?,?,?,?,?,?)");
	      prs.setString(1, fname);
	      prs.setString(2, lname);
	      prs.setString(3, username);
	      prs.setString(4, password);
	      prs.setString(5, city);
	      prs.setString(6, mailId);
	      prs.setString(7, phno);
	      int i = prs.executeUpdate();
	      System.out.println("Registration is done !!!\n ");
	     // con.close();
	      prs.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}



//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class Registration extends ConnectionJDBC {
//	Connection con = null;
//	PreparedStatement ps =null;
//	
//	public void insertStudentData(String fname, String lname, String username, String password, String city, String mailId, String phno) {
//
//		try {
//			ConnectionJDBC connect = new ConnectionJDBC();
//			con = connect.getConnectionDetails();
//			String query = "insert into student(fname,lname,username,password,city,mailId,phno)" + "values(?,?,?,?,?,?,?)";
//			ps = con.prepareStatement(query);
//		
//			ps.setString(1, fname);
//			ps.setString(2, lname);
//			ps.setString(3, username);
//			ps.setString(4, password);
//			ps.setString(5, city);
//			ps.setString(6, mailId);
//			ps.setString(7, phno);
//			
//			
//			int i = ps.executeUpdate();
//			System.out.println("Registration is done !! " +i);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			}finally {
//			
//			try {
//				ps.close();
//				con.close();
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			
//		}
//	}
