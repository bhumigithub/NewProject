package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertQuestionData extends QuestionList{
	
//	Connection con = null;
//	PreparedStatement ps = null;
//	ResultSet rs = null;
	
	public void insertQuestions() {
		Scanner scr= new Scanner(System.in);
		QuestionList insert = new QuestionList();
		
	for(int i=1; i<=1; i++) {
		System.out.println("Enter Questions :");
		String questions = scr.nextLine();

		System.out.println("Enter 1st option :");
		String option1 = scr.nextLine();
 
		System.out.println("Enter 2nd option :");
		String option2 = scr.nextLine();

		System.out.println("Enter 3rd option :");
		String option3 = scr.nextLine();
		
		System.out.println("Enter 4th option :");
		String option4 = scr.nextLine();
		
		System.out.println("Enter the correct answer number :");
		int correctopt = scr.nextInt();
		insert.insertQuestionDB(questions, option1, option2, option3, option4, correctopt);
	}
		
	}
	
}

