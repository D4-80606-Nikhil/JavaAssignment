package com.sunbeam.queone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCCandidate {
	private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/JavaEmployee";
	
	static {
		try {
			Class.forName(DB_Driver);
		}catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static int menu() {
		int choice;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("0. Exit\n");
		System.out.println("1. Insert new Candidate.");
		System.out.println("2. Display all Candidate.");
		System.out.println("3. Increment votes of Candidate with given id.");
		System.out.println("4. Delete Candiate with given id.");
		System.out.println("5. Find Candidate with given id.");
		System.out.println("6. Find Candidate of given Party.");
		System.out.println("7. Display total votes for each Party.");
		
		choice = scn.nextInt();
	   return choice;	
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int menuChoice,votes,id; String query,name,party;
		Scanner scn = new Scanner(System.in);
		
		
		try(Connection con = DriverManager.getConnection(DB_URL,"D4_80606_Nikhil","sunbeam")){
			
		while((menuChoice = menu())!=0) {
			switch(menuChoice) {
			case 0://exit
				break;
				
			case 1:// Insert New Candidates into DATABASE
				
				System.out.println("Enter Name : ");
				name = scn.next();
				System.out.println("Enter Party : ");
				party = scn.next();
				System.out.println("Enter Votes : ");
				votes = scn.nextInt();
				
				query = "INSERT INTO candidates VALUES(default,?,?,?);";
				try(PreparedStatement stmt = con.prepareStatement(query)){
					stmt.setString(1, name);
					stmt.setString(2, party);
					stmt.setInt(3, votes);
					int count = stmt.executeUpdate();
					if(count != 0) {
						System.out.println("Database Updated with "+count+" no. of rows");
					}else {
						System.out.println("No Changes Updated");
					}
				}
				break;
			
			case 2:// Display ALL Candidates
				
				query = "Select * from candidates";
				try(PreparedStatement stmt = con.prepareStatement(query)){
					ResultSet result = stmt.executeQuery();
					
					while(result.next()) {
						id = result.getInt("id");
						name = result.getString("name");
						party = result.getString("party");
						votes = result.getInt("votes");
						System.out.println(id+" "+name+" "+party+" "+votes);
					}
				}
				break;
			
			case 3: //Increment votes of Candidate with given id.
				System.out.println("\nEnter ID : ");
				id = scn.nextInt();
				query = "update candidates set votes = ? where id = ?";
				System.out.println("Enter Updated Votes : ");
				votes = scn.nextInt();
				
				try(PreparedStatement stmt = con.prepareStatement(query)){
					stmt.setInt(1, votes);
					stmt.setInt(2, id);
					
					int count = stmt.executeUpdate();
					if(count != 0) {
						System.out.println("Database Updated with "+count+" no. of rows");
					}else {
						System.out.println("No Changes Updated");
					}
					
				}
				break;
				
			case 4: //Delete Candidate with given id;
				
				System.out.println("Enter ID : ");
				id = scn.nextInt();
				query = "Delete from candidates where id = ?";
				
				try(PreparedStatement stmt = con.prepareStatement(query)){
					stmt.setInt(1, id);
					
					int count = stmt.executeUpdate();
					if(count != 0) {
						System.out.println("Database Updated with "+count+" no. of rows");
					}else {
						System.out.println("No Changes Updated");
					}
					
				}
				break;
			
			case 5: //Find candidate with given id
				
				System.out.println("Enter ID : ");
				id = scn.nextInt();
				query = "select * from candidates where id = ?";
				
				try(PreparedStatement stmt = con.prepareStatement(query)){
					stmt.setInt(1, id);
					
					 ResultSet result = stmt.executeQuery();
					 while(result.next()) {
							name = result.getString("name");
							party = result.getString("party");
							votes = result.getInt("votes");
							System.out.println(id+" "+name+" "+party+" "+votes);
						}
					
				}
				break;
			
			case 6: //find candidate of given party;
				
				System.out.println("Enter Party Name : ");
				party = scn.next();
				query = "select * from candidates where party = ?";
				
				try(PreparedStatement stmt = con.prepareStatement(query)){
					stmt.setString(1, party);
					
					 ResultSet result = stmt.executeQuery();
					 while(result.next()) {
							name = result.getString("name");
							party = result.getString("party");
							votes = result.getInt("votes");
							System.out.println(" "+name+" "+party+" "+votes);
						}
					
				}
				break;
			
			case 7://display total votes for each party
				
				query = "select party,sum(votes) from candidates group by party";
				
				try(PreparedStatement stmt = con.prepareStatement(query)){
					
					 ResultSet result = stmt.executeQuery();
					 while(result.next()) {
							party = result.getString("party");
							votes = result.getInt("sum(votes)");
							System.out.println(" "+party+" "+votes);
						}
					
				}
				break;
			default :
				System.out.println("Wrong Choice");
				break;
				
				
			
			}
		}
		
			}
		 catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
