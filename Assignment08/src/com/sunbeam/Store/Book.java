package com.sunbeam.Store;

public class Book extends Products{
    String isbn;
    String author;
    String subject;
    
    public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String isbn, String author, String subject,String title, double price) {
		super(title,price);
		this.isbn = isbn;
		this.author = author;
		this.subject = subject;
	}
	
    
    
	
}
