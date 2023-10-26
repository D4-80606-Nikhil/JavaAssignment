package com.sunbeam.Shape;

public class Rectangle extends Polygon{
    int length,breadth;
    
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double calcArea() {
		return this.length*this.breadth;
	}

}
