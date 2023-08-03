package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class QuestionList extends ConnectionJDBC{
	
	PreparedStatement prs=null;
	Connection con=null;
	public void insertQuestionDB(String questions, String option1, String option2, String option3, String option4 ,int correctopt){
		try {
			ConnectionJDBC connect= new ConnectionJDBC();
		    con = connect.getconnection();
		    PreparedStatement prs = con.prepareStatement( "insert into Question(questions,option1,option2,option3,option4,correctopt)" + "values(?,?,?,?,?,?)");
		    prs.setString(1, questions);
		    prs.setString(2, option1);
		    prs.setString(3, option2);
		    prs.setString(4, option3);
		    prs.setString(5, option4);
		    prs.setInt(6, correctopt);
		  
		    int i = prs.executeUpdate();
		      System.out.println("Question Added Successfully !!!\n ");
		      
		      prs.close();
		      con.close();
		}catch (Exception e) {
			e.printStackTrace();
			}
	}
}
