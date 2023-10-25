package com.sunbeam.date;

public class Date {
	  private int month;
	  private int day;
	  private int year;
	  
	  public Date() {
		// TODO Auto-generated constructor stub
		  this.month = 1;
		  this.day=1;
		  this.year=2000;
	}
	  
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public final int getMonth() {
		return month;
	}

	public final void setMonth(int month) {
		this.month = month;
	}

	public final int getDay() {
		return day;
	}

	public final void setDay(int day) {
		this.day = day;
	}

	public final int getYear() {
		return year;
	}

	public final void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println("Date : "+this.day+"/"+this.month+"/"+this.year);
	}
	
	@Override
	public String toString() {
		return this.day+"/"+this.month+"/"+this.year;
	}  
	
	  
   
}
