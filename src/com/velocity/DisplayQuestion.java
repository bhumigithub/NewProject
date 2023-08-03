package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayQuestion {
	
	PreparedStatement prs=null;
	PreparedStatement ps=null;
	Connection con=null;
	
	public void display() {
		
	    try {
	    	ConnectionJDBC connect= new ConnectionJDBC();
		    con = connect.getconnection();
			PreparedStatement prs = con.prepareStatement( "select * from Question " );
			ResultSet rs = prs.executeQuery();
			Scanner scr = new Scanner(System.in);
			//int answer ;
			int count =0;
			for(int i=1; i<=10; i++) {
					rs.next();
					System.out.println("\nQ." +i+ " "+ rs.getString(2));
					System.out.println("1 "+rs.getInt(3));
					System.out.println("2 "+rs.getInt(4));
					System.out.println("3 "+rs.getInt(5));
					System.out.println("4 "+rs.getInt(6));
					
					int result = rs.getInt(7);
					System.out.println("Enter your answer :");
					int answer = scr.nextInt();
					if(rs.getInt("correctopt")==(answer)) {
						count++;
					}
			}
			
			
			//System.out.println(count);
			PreparedStatement ps = con.prepareStatement( "insert into result(count)" + "values(?)");
			ps.setInt(1,count);
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public static void main(String []args) {
		DisplayQuestion d = new DisplayQuestion();
		d.display();
	}
}
