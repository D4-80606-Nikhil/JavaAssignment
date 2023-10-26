package com.sunbeam.People;

public class Program {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date d1 = new Date(12,8,2002);
		
		Person p1 = new Person("Nikhil",180.0,d1);
        p1.displayDetails();
        System.out.println("__________________");
        Person p2 = p1.clone();
        p2.getBithday().setMonth(5);
        p2.displayDetails();
	}

}
