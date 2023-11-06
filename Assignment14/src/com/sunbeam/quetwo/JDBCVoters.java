package com.sunbeam.quetwo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
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
				
				System.out.println("Enter Date: (dd-mm-yyyy)");
				dob = scn.next();
				
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date date =null;
				
				try {
				 date = format.parse(dob);
				} catch(Exception e) {
					e.printStackTrace();
				    System.exit(0);
				}
				
				String query = "INSERT INTO users Values(default,?,?,?,?,?,0,'voter')";
				try(PreparedStatement stmt = con.prepareStatement(query)){
					stmt.setString(1,firstname);
					stmt.setString(2, lastname);
					stmt.setString(3, email);
					stmt.setString(4, password);
					Date parsedDate = new Date(date.getTime());
				    stmt.setDate(5, parsedDate);	
				    
				    int count = stmt.executeUpdate();
				    if(count!=0) {
				    	System.out.println("No. of Rows "+ count+" affected");
				    }else {
				    	System.out.println("No rows affected.");
				    }
				}
				
				
				break;
			case 2://Display all users
			    query = "Select * from users";
			    try(PreparedStatement stmt = con.prepareStatement(query)){
			    	ResultSet rs = stmt.executeQuery();
			    	
			    	while(rs.next()) {
			    		System.out.println();
			    		int id = rs.getInt("id");
			    		firstname = rs.getString("first_name");
			    		lastname = rs.getString("last_name");
			    		email = rs.getString("email");
			    		password = rs.getString("password");
			    		Date fetchedDate = new Date(rs.getDate("dob").getTime());
			    		
			    		System.out.println(" "+id+" "+firstname+" "+lastname+" "+email+" "+password
			    				+" "+fetchedDate);
			    	}
			    }
				
				
				break;
			case 3://Delete voter with given id.
				query = "delete from users where id = ?";
				try(PreparedStatement stmt = con.prepareStatement(query)){
					System.out.print("\nEnter id : ");
					int id = scn.nextInt();
					stmt.setInt(1, id);
					int count = stmt.executeUpdate();
					if(count != 0) {
						System.out.println("No. of Rows "+ count+" affected");
					}else {
						System.out.println("No rows affected.");
					}
				}
				break;
			case 4://Change Status of voter with given id to true.
				query = "Update users set status = 1 where id =?";
				System.out.println("Enter ID : ");
			    int id = scn.nextInt();
				try(PreparedStatement stmt = con.prepareStatement(query)){
					stmt.setInt(1, id);
					int count = stmt.executeUpdate();
					if(count != 0) {
						System.out.println("No. of Rows "+ count+" affected");
					}else {
						System.out.println("No rows affected.");
					}
						
				}
				break;
			case 5://change the name and birth date of voter.
				
				System.out.print("\nEnter ID : ");
				id = scn.nextInt();
				
				
				System.out.print("\nEnter Name : ");
				String name = scn.next();
				
				System.out.print("\nEnter DOB : (dd-mm-yyyy) ");
				String DOB = scn.next();
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date dateOfVoter =null;
				try {
					dateOfVoter = dateFormat.parse(DOB);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				String DOBQuery = "Update users set first_name = ? , dob = ? where id = ?";
				
				try(PreparedStatement stmt = con.prepareStatement(DOBQuery)){
					stmt.setInt(3, id);
					stmt.setString(1, name);
					Date d = new Date(dateOfVoter.getTime());
					stmt.setDate(2, d);
                    int count = stmt.executeUpdate();
                    
                    if(count != 0) {
						System.out.println("No. of Rows "+ count+" affected");
					}else {
						System.out.println("No rows affected.");
					}
				}
				
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
