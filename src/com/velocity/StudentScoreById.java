package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentScoreById {
	
	ResultSet rs = null;
	PreparedStatement prs=null;
    Connection con=null;
	public void scoreById() {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Student ID : ");
		int studentId = scr.nextInt();
		ProjectMain pm = new ProjectMain();
		try {
			ConnectionJDBC connect= new ConnectionJDBC();
		    con = connect.getconnection();
			//PreparedStatement prs = con.prepareStatement( "select student.id,student.username,result.count from student right join result on student.id = result.id where student.id ='?'" );
		    PreparedStatement prs = con.prepareStatement( "select * from result where id = ? " );
					
				
		    		prs.setInt(1,studentId);
		    	
		    		ResultSet rs = prs.executeQuery();		
		    		
			while(rs.next()) {
				//if(rs.getInt(1)==(studentId)) {
					System.out.println(" ID : "+rs.getInt(1)+ "\t Score : "+rs.getInt(2));
					//System.out.println(" ID : "+rs.getInt(1)+"\t userName : " +rs.getString(2) + "\t Score : "+rs.getInt(3));
				//}
			}
		
		con.close();
		prs.close();	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
