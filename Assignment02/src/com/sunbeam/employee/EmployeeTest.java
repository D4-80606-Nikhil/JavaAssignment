package com.sunbeam.employee;
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		Employee[] employee = new Employee[2];
		employee[0] = new Employee();
	    System.out.print("Enter Employee Details : \n First Name : ");
	    String firstName = scn.next();
	    System.out.print("Last Name : ");
	    String lastName =  scn.next();
        System.out.print("Enter Salary : ");
        double salary = scn.nextDouble();
        
        if(salary <= 0) {
        	System.out.println("Wrong Salary Input");
        } else {
        	employee[0].setFirstName(firstName);
        	employee[0].setLastName(lastName);
        	employee[0].setSalary(salary);
        }
       
        System.out.println("----------------------");
        System.out.println("Employee Details : \n");
        System.out.println("Name : "+employee[0].getFirstName()+" "+employee[0].getLastName());
        System.out.println("Salary : "+employee[0].getSalary());
        
       
        System.out.println("Enter Salary : ");
        double salary2 = scn.nextDouble();
        if(salary2 <= 0.0) {
        	System.out.println("Wrong Salary Input");
        } else {
        	employee[1] = new Employee("Rajesh","Chauhan",salary2);
            employee[1].displayData(); 
        }
        
        
         
        
	}

}
