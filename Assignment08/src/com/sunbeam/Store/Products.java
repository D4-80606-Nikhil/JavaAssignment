package com.sunbeam.Store;

abstract public class Products {

	String title;
	double price;
	
	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public final String getTitle() {
		return title;
	}

	public final void setTitle(String title) {
		this.title = title;
	}

	public final double getPrice() {
		return price;
	}

	public final void setPrice(double price) {
		this.price = price;
	}
	
	
}
