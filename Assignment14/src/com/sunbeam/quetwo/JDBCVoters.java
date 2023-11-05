package com.sunbeam.quetwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class JDBCVoters {
	
	private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/JavaEmployee";

	public static int menu() {
		int choice;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("0. Exit\n");
		System.out.println("1. Insert new user(Voter)\n");
		System.out.println("2. Display all users.\n");
		System.out.println("3. Delete voter with given id.\n");
		System.out.println("4. Change status of voter with given id to true.\n");
		System.out.println("5. Change the name and birth date of voter.\n");
		choice = scn.nextInt();
		
		return choice;
	}
	
	static {
		try {
			Class.forName(DB_Driver);
		}catch(Exception ex) {
			ex.printStackTrace();
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menuChoice,status; String firstname,lastname,email,password,role,dob;
		Scanner scn = new Scanner(System.in);
		
		try(Connection con = DriverManager.getConnection(DB_URL,"D4_80606_Nikhil","sunbeam")){
		while((menuChoice = menu())!=0) {
			switch(menuChoice) {
			case 0://exit
				break;
			case 1://Insert new user
				System.out.println("Enter First Name : ");
				firstname = scn.next();
				
				System.out.println("Enter last Name :");
				lastname = scn.next();
				
				System.out.println("Enter Email :");
				email = scn.next();
				
				System.out.println("Enter Password :");
				password = scn.next();
				
				System.out.println();
				
				break;
			case 2://Display all users
				break;
			case 3://Delete voter with given id.
				break;
			case 4://Change Status of voter with given id to true.
				break;
			case 5://change the name and birth date of voter.
				break;
			default:
				System.out.println("Wrong Choice.");
				break;
			}
		}
		}
		catch(Exception e) {
		    e.printStackTrace();	
		}
        
	}

}
