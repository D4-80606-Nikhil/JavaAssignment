package com.sunbeam.Shape;

public class Square extends Polygon{
     public Square() {
		
     }
     public Square(int side) {
    	 super(side);
     }
	@Override
	double calcArea() {
		return this.sides*this.sides;
	}
     
     
}
