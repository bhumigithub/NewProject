package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayQuestion {
	
	PreparedStatement prs=null;
	Connection con=null;
	
	public void display() {
		
	    try {
	    	ConnectionJDBC connect= new ConnectionJDBC();
		    con = connect.getconnection();
			PreparedStatement prs = con.prepareStatement( "select questions form Question " );
			ResultSet rs = prs.executeQuery();
			
			for(int i=1; i<=10; i++) {
				System.out.println(rs.getString(2));
				
				rs.next();
			}
			
		} catch (Exception e) {


			e.printStackTrace();
		} 
	}
}
