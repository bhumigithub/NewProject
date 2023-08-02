package com.velocity;

import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) {
		
		
		System.out.println("==========================================================");
		System.out.println("========== Welcome to Quiz Based Application =============");
		System.out.println("==========================================================");
		do {
			System.out.println("User Operation");
			System.out.println("1. Student Registration ");
			System.out.println("2. Student login ");
			System.out.println("3. Display the list of quections");
			System.out.println("4. Store Quiz result into database");
			System.out.println("5. Display Quiz result");
			System.out.println("\n Admin Operation ");
			System.out.println("6. Display all students score as per ascending order");
			System.out.println("7. Fetch student score by using id");
			System.out.println("8. Add question with 4 options into database");
			
			System.out.println("\n Enter your choice >>");
			Scanner scr = new Scanner(System.in);
			int num= scr.nextInt();
			
			switch(num) {
			case 1:
				InsertStudentData in = new InsertStudentData();
				in.registerdata();
				break;
			case 2:
				StudentLogin log = new StudentLogin();
				log.login();
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				InsertQuestionData que = new InsertQuestionData();
				que.insertQuestions();
				break;
			default:
				System.out.println("Sorry !! Enter the correct number >>");	
			}
		}while(true);
	}
}
