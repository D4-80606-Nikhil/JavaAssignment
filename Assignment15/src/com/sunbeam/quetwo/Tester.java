package com.sunbeam.quetwo;

import java.util.List;
import java.util.Scanner;

public class Tester {
	
	public static int menu() {
		int choice=0;
		
		System.out.print("\n0. Exit");
		System.out.print("\n1. Add User");
		System.out.print("\n2. Update User");
		System.out.print("\n3. Delete User");
		System.out.print("\n4. Display Users\n");
		Scanner scn = new Scanner(System.in);
		
		choice = scn.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menuChoice = 0;
		Scanner scn = new Scanner(System.in);
		
		while((menuChoice = menu())!=0) {
			switch(menuChoice) {
			case 0://exit
				break;
			case 1://add user
				
				System.out.println("Enter id : ");
				int id = scn.nextInt();
				
				System.out.println("Enter firstname : ");
				String firstname = scn.next();
				
				System.out.println("Enter lastname : ");
				String lastname = scn.next();
				
				System.out.println("Enter email : ");
				String email  = scn.next();
				
				System.out.println("Enter password : ");
				String password = scn.next();
				
				System.out.println("Enter DOB | (dd-mm-yyyy) : ");
				String dob = scn.next();
				
				Users usr = new Users(id,firstname,lastname,email,password,dob);
				
				try(UserDao uD = new UserDao()){		
				 int count = uD.save(usr);	
				 
				 if(count != 0) {
	    			 System.out.println("No. of Rows Affected : "+count);
	    		 }else {
	    			System.out.println("No rows Affected "); 
	    		 }
				 
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				break;
			case 2://update user
				System.out.println("Enter id : ");
			    id = scn.nextInt();
				
				System.out.println("Enter firstname : ");
				firstname = scn.next();
				
				System.out.println("Enter lastname : ");
				lastname = scn.next();
				
				System.out.println("Enter email : ");
				email  = scn.next();
				
				System.out.println("Enter password : ");
				password = scn.next();
				
				System.out.println("Enter DOB | (dd-mm-yyyy) : ");
				dob = scn.next();
				
				usr = new Users(id,firstname,lastname,email,password,dob);
				
				try(UserDao uD = new UserDao()){		
				 int count = uD.save(usr);	
				 
				 if(count != 0) {
	    			 System.out.println("No. of Rows Affected : "+count);
	    		 }else {
	    			System.out.println("No rows Affected "); 
	    		 }
				 
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
				
				break;
			case 3://delete user
				
				System.out.println("Enter id : ");
				id = scn.nextInt();
				
				try(UserDao u = new UserDao()){
					int count = u.delete(id);
					
					if(count != 0) {
		    			 System.out.println("No. of Rows Affected : "+count);
		    		 }else {
		    			System.out.println("No rows Affected "); 
		    		 }
				
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
			case 4://display users
				
				List<Users> list ;
				try(UserDao u = new UserDao()){
					
					list = u.display();
					
					list.forEach(c -> System.out.println(c));
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
			default:
				System.out.println("Wrong Choice ");
				break;
			}
		}
		System.out.println("Bye Bye.");

	}

}
