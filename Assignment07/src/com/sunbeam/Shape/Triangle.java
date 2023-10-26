package com.sunbeam.Shape;

public class Triangle extends Polygon{
    int sideOne,sideTwo,sideThree;
    
    public Triangle() {
		// TODO Auto-generated constructor stub
	}
    
	public Triangle(int sideOne, int sideTwo, int sideThree) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
    
    private double semiPeri() {
    	return (double)(sideOne+sideTwo+sideThree)/2.0;
    }
	
	@Override
	double calcArea() {
		double semiPerimeter = semiPeri();
		double area = semiPerimeter*(semiPerimeter-sideOne)*(semiPerimeter-sideTwo)*(semiPerimeter-sideThree);
		return Math.sqrt(area);
     }
	
}
  

