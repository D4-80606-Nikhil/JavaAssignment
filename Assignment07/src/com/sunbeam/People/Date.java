package com.sunbeam.People;

public class Date implements Cloneable{
   private int day , month, year;

public Date(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}

 public void displayDate(){
	 System.out.println("\nDate : "+day+"/"+month+"/"+year);
 }
 
 
 
 public final int getDay() {
	return day;
}

public final void setDay(int day) {
	this.day = day;
}

public final int getMonth() {
	return month;
}

public final void setMonth(int month) {
	this.month = month;
}

public final int getYear() {
	return year;
}

public final void setYear(int year) {
	this.year = year;
}


@Override
	public Date clone() throws CloneNotSupportedException {
	    Date obj = (Date)super.clone();
		return obj;
	}
 
}
   

