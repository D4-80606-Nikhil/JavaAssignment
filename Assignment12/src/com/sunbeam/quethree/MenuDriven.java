package com.sunbeam.quethree;
import java.util.*;

public class MenuDriven {
	
	public static int menu() {
		int choice;
		Scanner scn = new Scanner(System.in);
		System.out.println("1. Add Employee\n");
		System.out.println("2. Delete Employee\n");
		System.out.println("3. Find Employee\n");
		System.out.println("4. Sort Employee\n");
		System.out.println("5. Edit Employee Details\n");
		System.out.println("0. Exit\n");
		
		choice = scn.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		List<EmployeeList> list = new LinkedList<>();
		int menuChoice ;
		EmployeeList emp;
		int id;
		
		while((menuChoice=menu())!=0) {
			switch(menuChoice) {
			case 0://to Exit
				break;
			case 1://add employee
				emp = new EmployeeList();
				emp.accept();
				list.add(emp);
				break;
			case 2://delete employee
				emp = new EmployeeList();
				System.out.println("Enter ID :");
				id = scn.nextInt();
				emp.setId(id);
				if(list.contains(emp)) {
					System.out.println("Employee Removed : "+list.remove(emp));
				}else {
					System.out.println("Employee not found");
				}	
				break;
			case 3://find employee
				emp = new EmployeeList();
				System.out.println("Enter ID :");
				id = scn.nextInt();
				emp.setId(id);
				if(list.indexOf(emp)!=-1) {
					emp = list.get(list.indexOf(emp));
					emp.display();
//					System.out.println("Element found at :"+list.indexOf(emp));
				}else {
					System.out.println("Employee not found");
				}
				break;
			case 4://sort employee
				list.sort(new IDComparator());
				break;
			case 5://edit employee
				System.out.println("Enter Employee ID :");
				id = scn.nextInt();
				emp = new EmployeeList();
				emp.setId(id);
				int index = list.indexOf(emp);
				if(index == -1) {
					System.out.println("Employee Not Found :(");
				}else {
					EmployeeList listemp = list.get(index);
					System.out.println("Employee Found : "+listemp);
					int editChoice = 0;
					System.out.println("You Want to edit : \nPress 1 for Yes \nPress 2 for No");
					editChoice = scn.nextInt();
					if(editChoice == 1) {
						listemp.accept();
						System.out.println("Final Details :\n"+listemp);
					}else {
						System.out.println("Thank you . Your Details is saved as it is. Here is the details : "
								+listemp);
					}
				}
				break;
		    default:
		    	System.out.println("Wrong Choice");
		    	break;
			}
		}
		

	}

}
