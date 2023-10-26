package com.sunbeam.Shape;

public class Circle extends BoundedShape{
    
	int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Circle(int radius) {
		this.radius = radius;
	}

    
	@Override
	double calcArea() {
		return Math.PI*radius*radius;
	}
   
}
