package com.sunbeam.seven;

import java.util.LinkedHashMap;
import java.util.Map;

class Student{
	private String name;
	private int rollNo;
	private String subject;
	public Student(String name, int rollNo, String subject) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.subject = subject;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getRollNo() {
		return rollNo;
	}
	public final void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public final String getSubject() {
		return subject;
	}
	public final void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", subject=" + subject + "]";
	}
	
	
	
}

public class LinkedHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<Integer,Student> list  = new LinkedHashMap<Integer,Student>();
        
        Student s = new Student("Nikhil",12,"History");
        
        list.put(s.getRollNo(), s);
        
        Student s2 = new Student("Nikhil",12,"History");
        list.put(s2.getRollNo(), s2);
        
        System.out.println(list);
       
        
        
	}

}
