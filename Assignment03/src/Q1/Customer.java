package Q1;

import java.util.Scanner;

public class Customer {
	int accNo;
	int monthlyPendingBalance;
	int totalItemCharges;
	int totalCreditApplied;
	int allowedLimit;
	Scanner sc=new Scanner(System.in);
	
	public Customer(int accNo, int monthlyPendingBalance, int totalItemCharges, int totalCreditApplied,
			int allowedLimit) {
		
		this.accNo = accNo;
		this.monthlyPendingBalance = monthlyPendingBalance;
		this.totalItemCharges = totalItemCharges;
		this.totalCreditApplied = totalCreditApplied;
		this.allowedLimit = allowedLimit;
	}
	
	public Customer() {
		this(-1,0,0,0,0);
	}
	
	public void acceptData() {
		System.out.println("------------------------------------------------");
		
		System.out.println("Enter your account Number");
		this.accNo=sc.nextInt();
		
		System.out.println("Enter Monthly Pending Balance");
		this.monthlyPendingBalance=sc.nextInt();
		System.out.println("Enter Total Item Charge");
		this.totalItemCharges=sc.nextInt();
		System.out.println("Enter Total credit Applied");
		this.totalCreditApplied=sc.nextInt();
		System.out.println("Enter Allowed Limit");
		this.allowedLimit=sc.nextInt();
		
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getMonthlyPendingBalance() {
		return monthlyPendingBalance;
	}

	public void setMonthlyPendingBalance(int monthlyPendingBalance) {
		this.monthlyPendingBalance = monthlyPendingBalance;
	}

	public int getTotalItemCharges() {
		return totalItemCharges;
	}

	public void setTotalItemCharges(int totalItemCharges) {
		this.totalItemCharges = totalItemCharges;
	}

	public int getTotalCreditApplied() {
		return totalCreditApplied;
	}

	public void setTotalCreditApplied(int totalCreditApplied) {
		this.totalCreditApplied = totalCreditApplied;
	}

	public int getAllowedLimit() {
		return allowedLimit;
	}

	public void setAllowedLimit(int allowedLimit) {
		this.allowedLimit = allowedLimit;
	}

	public void checkLimit() {
		if(accNo==-1) {
			System.out.println("Your account is not been initialized");
			return;
		}
		int newBalance=this.monthlyPendingBalance+this.totalItemCharges-this.totalCreditApplied;
		System.out.println("Your new Balance is = "+newBalance);
		if(newBalance<this.allowedLimit) {
			System.out.println("Your Account has not Exceeded the limit");
		}else {
			System.out.println("Your Account has Exceeded the limit of "+ this.allowedLimit);
				
		}
		
	} 
	
	
	
	
	
	
}
