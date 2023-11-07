package com.sunbeam.queeight;

interface Employee {
	double getsal();
	
	default double calcIncentive() {
		return 0.0;
	}
	
	static double calcTotalIncome(Employee [] arr) {
		double sumIncome=0;
		for(Employee ele:arr) {
			sumIncome = sumIncome+ele.getsal()+ele.calcIncentive();
		}
		return sumIncome;
	}
}

public class Manager implements Employee{

	private double basicSalary;
	private double dearanceAllowance;
	
	
	
	
	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	@Override
	public double getsal() {
		// TODO Auto-generated method stub
		return basicSalary+dearanceAllowance;
	}
	@Override
	public double calcIncentive() {
		return 0.20*basicSalary;
	}
}
