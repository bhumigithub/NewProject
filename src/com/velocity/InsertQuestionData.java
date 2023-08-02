package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertQuestionData extends QuestionList{
	
	Scanner sc= new Scanner(System.in);
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public void insertQuestions() {
	
		System.out.println("Enter Questions :");
		String question=sc.next();

		System.out.println("Enter 1st option :");
		String option1=sc.next();

		System.out.println("Enter 2nd option");
		String option2=sc.next();

		System.out.println("Enter 3rd option");
		String option3=sc.next();
		
		System.out.println("Enter 4th option");
		String option4=sc.next();
		
		System.out.println("Enter the correct answer number :");
		int correctopt=sc.nextInt();
		
		QuestionList insert = new QuestionList();
		insert.insertQuestionDB(question, option1, option2, option3, option4, correctopt);
	}
	
}

