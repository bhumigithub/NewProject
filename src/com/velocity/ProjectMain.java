package com.velocity;

import java.util.Scanner;

public class ProjectMain {
	
	Scanner scr = new Scanner(System.in);
	
	public void userOpration() {
			int num=0;
		do {
			System.out.println("1. Student Registration ");
			System.out.println("2. Student login ");
			System.out.println("3. Display the list of quections");
			System.out.println("4. Store Quiz result into database");
			System.out.println("5. Display Quiz result");
			System.out.println("6. Exit ");
			System.out.println("\n Enter your choice >>");
			num= scr.nextInt();
			
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
			default:
				System.out.println(" Enter the correct number !!\n");
			}
		}while(num!=6);
	}
	
	public void adminOperation() {
		
		String Id="Admin";
		String password ="Admin@123";
		
		System.out.println("Enter ID :");
		String adminId = scr.next();
		System.out.println("Enter password :");
		String adminPassword = scr.next();
		
		
		int num = 0;
		
		if((Id.equals(adminId)) && (password.equals(adminPassword))) {
			do {
				System.out.println("1. Display all students score as per ascending order");
				System.out.println("2. Fetch student score by using id");
				System.out.println("3. Add question with 4 options into database");
				System.out.println("4. Exit ");
				System.out.println("\n Enter your choice >>");
				num = scr.nextInt();
				
				switch(num) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					InsertQuestionData que = new InsertQuestionData();
					que.insertQuestions();
					break;
				case 4:
					break;
				default:
					System.out.println(" Enter the correct number \n");
				}
			}while(num!=4);
			
		}else {
			System.out.println("Enter correct ID and Password !!");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("==========================================================");
		System.out.println("========== Welcome to Quiz Based Application =============");
		System.out.println("==========================================================");
		
		do {
			System.out.println(" 1 . User Operation");
			System.out.println(" 2 . Admin Operation ");
			
			System.out.println("\n Enter your choice >>");
			Scanner scr = new Scanner(System.in);
			int num= scr.nextInt();
			ProjectMain pro = new ProjectMain();
			
			switch(num) {
			case 1:
				pro.userOpration();
				break;
			case 2:
				pro.adminOperation();
				break; 
			default:
				System.out.println(" Enter the correct number !!\n");	
			}
		}while(true);
	}
}
