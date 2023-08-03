package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.velocity.ConnectionJDBC;

public class InsertStudentData extends Registration{

	
	Scanner sc= new Scanner(System.in);
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public void registerdata() {
	
		System.out.println("Enter the first name :");
		String fname=sc.next();

		System.out.println("Enter the last name");
		String lname=sc.next();

		System.out.println("Enter the username");
		String username=sc.next();

		System.out.println("Enter the password");
		String password=sc.next();
		
		System.out.println("Enter the city");
		String city=sc.next();
		
		System.out.println("Enter the mailId");
		String mailId=sc.next();
				
		System.out.println("Enter the Mobile number");
		String phno = sc.next();
		
		InsertStudentData insert=new InsertStudentData();
		insert.registration(fname, lname, username, password, city, mailId, phno);
	}
	
}

