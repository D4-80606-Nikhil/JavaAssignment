package com.sunbeam.quethree;
import java.util.*;

public class EmployeeList {
  private int id;
  private String name;
  private int age;
  private double salary;
  
  public EmployeeList() {
	// TODO Auto-generated constructor stub
}

public EmployeeList(int id, String name, int age, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
}

public final int getId() {
	return id;
}

public final void setId(int id) {
	this.id = id;
}

public final String getName() {
	return name;
}

public final void setName(String name) {
	this.name = name;
}

public final int getAge() {
	return age;
}

public final void setAge(int age) {
	this.age = age;
}

public final double getSalary() {
	return salary;
}

public final void setSalary(double salary) {
	this.salary = salary;
}
 public void accept(){
	 Scanner scn = new Scanner(System.in);
	  System.out.println("Enter ID: ");
	  this.id = scn.nextInt();
	  
	  System.out.println("Enter Name : ");
	  this.name = scn.next();
	  
	  System.out.println("Enter Age : ");
	  this.age= scn.nextInt();
	  
	  System.out.println("Enter Salary : ");
	  this.salary = scn.nextDouble();
	  
  }
  
public void display(){
	System.out.println("-------------------");
	 System.out.println("ID : "+this.id);
	 System.out.println("Name : "+this.name);
	 System.out.println("Age : "+this.age);
	 System.out.println("Salary : "+this.salary);
	 System.out.println("-------------------");
 }

@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(obj instanceof EmployeeList) {
			EmployeeList emp = (EmployeeList)obj;
			if(emp.getId() == this.id) {
				return true;
			}
		}
		return false;
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Name"+this.name+"\nEmployee ID : "+this.id+"\nEmployee Age : "
				+this.age+"\nEmployee Salary:"+this.salary;
	}
 
}
