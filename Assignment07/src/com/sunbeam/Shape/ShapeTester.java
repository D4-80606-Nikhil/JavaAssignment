package com.sunbeam.Shape;

public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundedShape shape = new Circle(5);
		System.out.printf("Area of Circle : %.4f \n",shape.calcArea());
		
		
		shape = new Triangle(3,4,5);
		System.out.println("Area of Triangle : "+shape.calcArea());
		
		
		shape = new Rectangle(6,7);
		System.out.println("Area of Rectangle : "+shape.calcArea());
		
		
		shape = new Square(6);
		System.out.println("Area of Square : "+shape.calcArea());
		

	}

}
