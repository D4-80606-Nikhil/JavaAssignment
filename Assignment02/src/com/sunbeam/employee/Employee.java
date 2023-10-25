package com.sunbeam.employee;

public class Employee {
   String firstName;
   String lastName;
   double salary;
   
   {
	   firstName = "Default Name ";
	   lastName = "Default Last Name";
	   salary = 999999;
   }

public Employee() {
	// TODO Auto-generated constructor stub
}
   
 public Employee(String firstName, String lastName, double salary) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
 }

public final String getFirstName() {
	return firstName;
}

public final void setFirstName(String firstName) {
	this.firstName = firstName;
}

public final String getLastName() {
	return lastName;
}

public final void setLastName(String lastName) {
	this.lastName = lastName;
}

public final double getSalary() {
	return salary;
}

public final void setSalary(double salary) {
	this.salary = salary;
}
   
public void displayData(){
	 System.out.println("Name : "+this.firstName+" "+this.lastName);
	 System.out.println("Salary : "+this.salary);
 }
   
}
