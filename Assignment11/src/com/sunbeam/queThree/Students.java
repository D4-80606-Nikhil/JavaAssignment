package com.sunbeam.queThree;

public class Students implements Comparable<Students>{
	
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

	public Students(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public final int getRoll() {
		return roll;
	}

	public final void setRoll(int roll) {
		this.roll = roll;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getCity() {
		return city;
	}

	public final void setCity(String city) {
		this.city = city;
	}

	public final double getMarks() {
		return marks;
	}

	public final void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Students arg0) {
	    int diff = (-1)*this.city.compareTo(arg0.city);
	    if(diff ==  0) {
	    	diff = (-1)*Double.compare(this.marks, arg0.marks);
	    	if(diff==0) {
	    		diff = this.name.compareTo(arg0.name);
	    	}
	    }
		return diff;
	}

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	

}
