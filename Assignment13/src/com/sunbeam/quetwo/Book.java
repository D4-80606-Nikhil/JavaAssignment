package com.sunbeam.quetwo;
import java.util.Scanner;

public class Book{
   private String isbn;
   private double price;
   private String authorName;
   private int quantity;
   
   public Book() {
	// TODO Auto-generated constructor stub
}

public Book(String isbn, double price, String authorName, int quantity) {
	super();
	this.isbn = isbn;
	this.price = price;
	this.authorName = authorName;
	this.quantity = quantity;
}

public void accept() {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter ISBN: ");
	this.isbn = scn.next();
	
	System.out.println("Enter Price: ");
	this.price = scn.nextDouble();
	
	System.out.println("Enter Author Name : ");
	this.authorName = scn.next();
	
	System.out.println("Enter Quantity : ");
	this.quantity = scn.nextInt();
}

public final String getIsbn() {
	return isbn;
}

public final void setIsbn(String isbn) {
	this.isbn = isbn;
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

@Override
public String toString() {
	return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity + "]";
}

public void display() {
	System.out.println("ISBN : "+this.isbn);
	System.out.println("Author Name : "+this.authorName);
	System.out.println("Price : "+this.price);
	System.out.println("Quantity : "+this.quantity);
}

@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Object.hash(this.isbn);
	}

@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	    if(this==obj) {
	    	return true;
	    }
	    if(obj == null) {
	    	return false;
	    }
	    if(obj instanceof Book) {
	    	Book book = (Book)obj;
	    	if(this.isbn.equals(book.getIsbn())) {
	    		return true;
	    	} 
	    	
	    }
		return false;
	}

}
   
   
   

