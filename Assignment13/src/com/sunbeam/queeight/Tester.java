package com.sunbeam.queeight;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	    Employee [] arr = new Employee[5];
	    
	    arr[0] = new Manager(5000,3400);
	    arr[1]=new Manager(20000,5000);
	    arr[2] = new Clerk(5000);
	    arr[3] = new Labor(2,1000);
	    arr[4] = new Labor(1,400);
	    
	    System.out.println(Employee.calcTotalIncome(arr));
	}

}
