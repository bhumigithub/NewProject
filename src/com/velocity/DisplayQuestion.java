package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayQuestion {
	
	PreparedStatement prs=null;
	//PreparedStatement ps=null;
	Connection con=null;
	
	

	public void display() {
		
	    try {
	    	ConnectionJDBC connect= new ConnectionJDBC();
		    con = connect.getconnection();
			PreparedStatement prs = con.prepareStatement( "select * from Question " );
			ResultSet rs = prs.executeQuery();
			Scanner scr = new Scanner(System.in);
			String answer ="";
			int count =0;
			int i=1;
			while(rs.next()) {
				
				System.out.println("\nQ." +i+ " "+ rs.getString(2));
				System.out.println("1 "+rs.getString(3));
				System.out.println("2 "+rs.getString(4));
				System.out.println("3 "+rs.getString(5));
				System.out.println("4 "+rs.getString(6));
				
				System.out.println("Enter your answer :");
				answer = scr.next();
				if(rs.getString(7).equals(answer)) {
					count++;
				}
				i++;
			}
			//System.out.println(count);
			PreparedStatement ps = con.prepareStatement( "insert into result(count)" + "values(?)");
			ps.setInt(1,count);
			ps.executeUpdate();
			
			System.out.println(" ==========Your Answer is Sumbitted !!!=============");
			
			System.out.println(" Your Quiz score is : " +count);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
