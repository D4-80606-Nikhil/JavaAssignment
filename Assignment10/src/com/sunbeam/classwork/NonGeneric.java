package com.sunbeam.classwork;

interface Displayable{
	void display();
}
class Person implements Displayable{
	private String name;
	private int age;
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(new StringBuffer().append("Name :").append(this.name)
				.append("\nAge : ").append(this.age).toString());
	}
	
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer().append("Name : ").append(this.name).append("\nAge : ")
				.append(this.age).toString();
	}
	
}

class Book implements Displayable{
	private String name;
	private double price;
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(new StringBuffer().append("Name : ").append(this.name).append("\nPrice : ")
				.append(this.price).toString());
		
	}

	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final double getPrice() {
		return price;
	}

	public final void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer().append("Name : ").append(this.name).append("\nPrice : ")
				.append(this.price).toString();
	}
	
	
}

class Car{
	private String name;
	private double price;
	
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final double getPrice() {
		return price;
	}

	public final void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer().append("Name : ").append(this.name).append("\nPrice : ")
				.append(this.price).toString();
	}
	
}

class Box<T extends Displayable>  {
	private T obj;
	public void display(){
		obj.display();
	}
	
	public void getValue(T obj) {
		System.out.println(obj.toString());
	}
	
}

public class NonGeneric {
	
	
   public static void main(String[] args) {
	   Box<Person> b1 = new Box<>();
	   b1.getValue(new Person("Nikhil",22));
	   
	   Box<Book> b2 = new Box<>();
	   b2.getValue(new Book("Imitation Game",345.67));
	   
   }
}
