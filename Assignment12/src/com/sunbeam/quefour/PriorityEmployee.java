package com.sunbeam.quefour;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import com.sunbeam.quethree.EmployeeList;

public class PriorityEmployee {
	
	public static int menu() {
		int choice;
		Scanner scn = new Scanner(System.in);
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Display All Employee");
		System.out.println("0. Exit");
		choice = scn.nextInt();
		return choice;
	}
	
	public static void main(String ...args) {
		
		PriorityQueue<EmployeeList> list = new PriorityQueue<>();
		int menuChoice;
		EmployeeList emp;
		
		while((menuChoice=menu())!=0) {
			switch(menuChoice) {
			case 1://add employee
				emp = new EmployeeList();
				emp.accept();
				list.add(emp);
				break;
			case 2://delete employee
				emp = list.poll();
				System.out.println("Deleted Element : ");
				emp.display();
				break;
			case 3://display all employee
				Iterator<EmployeeList> itr = list.iterator();
				for(EmployeeList emp1:list) {
					System.out.println(emp1);
				}
				break;
			case 0://exit
				break;
			default://wrong
				System.out.println("Wrong Choice");
				break;
			}
		}
		
		
		
		
	}
  
}
