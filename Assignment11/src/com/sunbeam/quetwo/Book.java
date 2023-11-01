package com.sunbeam.quetwo;

import java.util.Scanner;

public class Book{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	private int id;
	
	public Book(String isbn, double price, String authorName, int quantity, int id) {
		this.id = id;
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getIsbn() {
		return isbn;
	}

	public final Book setIsbn(String isbn) {
		this.isbn = isbn;
		return this;
	}

	public final double getPrice() {
		return price;
	}

	public final void setPrice(double price) {
		this.price = price;
	}

	public final String getAuthorName() {
		return authorName;
	}

	public final void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public final int getQuantity() {
		return quantity;
	}

	public final void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	Book accept() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter ISBN : ");
		this.isbn = scn.next();
		System.out.println("Enter the price of Book : ");
		this.price = scn.nextDouble();
		System.out.println("Enter Author Name : ");
		this.authorName = scn.next();
		System.out.println("Enter Quantity : ");
		this.quantity = scn.nextInt();
		return this;
	}
	
	void display() {
		System.out.println("ISBN : "+this.isbn);
		System.out.println("Price : "+this.price);
		System.out.println("Author Name : "+this.authorName);
		System.out.println("Quantity : "+this.quantity);
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("mineee");	
		if(this == obj) {
			return true;
		}
		if(obj instanceof Book) {
			Book ob = (Book)obj;
			if(this.isbn.compareTo(ob.getIsbn())==0) {
				return true;
			}
		}
		return false;
		
	}
}
