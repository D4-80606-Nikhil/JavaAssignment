package com.sunbeam.Shape;

abstract public class Polygon extends BoundedShape {
	protected int sides;
	
	public Polygon() {
		// TODO Auto-generated constructor stub
	}

	public Polygon(int sides) {
		this.sides = sides;
	}   
}
