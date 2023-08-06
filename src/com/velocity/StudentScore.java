package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentScore {
	
	    PreparedStatement prs=null;
	    Connection con=null;
		public void score() {
			try {
				ConnectionJDBC connect= new ConnectionJDBC();
			    con = connect.getconnection();
				PreparedStatement prs = con.prepareStatement( "select student.id,student.username,result.id,result.count\r\n" + 
						"from student\r\n" + 
						"right join result\r\n" + 
						"on student.id = result.id\r\n" + 
						"ORDER BY result.count asc; " );
				ResultSet rs = prs.executeQuery();
				System.out.println("\n++++++++++++ SCORE OF ALL STUDENTS ++++++++++++++\n");
				int i=1;
				while(rs.next()) {
					System.out.println(i+ " userName : " +rs.getString(2) + "\t Score : "+rs.getString(4));
					i++;
				}
				System.out.println("\n");
			con.close();
			prs.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		public static void main(String []args) {
			StudentScore src = new StudentScore();
			src.score();
		}
}
