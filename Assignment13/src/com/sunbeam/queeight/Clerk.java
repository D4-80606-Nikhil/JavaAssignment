package com.sunbeam.queeight;

public class Clerk implements Employee{

	private double Salary ;

	
	
	public Clerk(double salary) {
		super();
		Salary = salary;
	}



	@Override
	public double getsal() {
		// TODO Auto-generated method stub
		return Salary;
	}
	
	
	
}
