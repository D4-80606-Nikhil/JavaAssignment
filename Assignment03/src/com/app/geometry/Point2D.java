package com.app.geometry;

import java.util.Scanner;
import java.lang.*;

public class Point2D {
double x;
double y;

public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public Point2D(double x, double y) {
	
	this.x = x;
	this.y = y;
}
public Point2D() {
	this(0,0);
}

public void setCoord(double x,double y) {
	this.x=x;
	this.y=y;
}


public void display() {
	System.out.println("-------------------------------------------------------------");
	System.out.println("Co-ordinate of your points is (X,Y):  ("+this.x+","+this.y+")");
}

public String getDetials() {
	return "("+x+","+y+")";
}

public void accept() {
	System.out.println("-------------------------------------------------------------");
	System.out.println("Enter the Co-ordinate of your points is (X,Y): ");
	System.out.println("Enter the X- Co-ordinate : ");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	this.x=x;
	System.out.println("Enter the Y- Co-ordinate : ");
	int y=sc.nextInt();
	this.y=y;
	
}

public boolean isEqual(Point2D p2) {
	boolean flag=false;
	if(this.x==p2.getX() && this.y==p2.getY() ) {
		flag=true;
	}
	return flag;
	
}

public double getDistance(Point2D p2) {
	double x2=p2.getX();
	double y2=p2.getY();
	double dist= Math.sqrt( Math.pow(Math.abs(this.x-x2),2) +Math.pow(Math.abs(this.y-y2),2) );
	System.out.println("The distance between given points is :"+dist);
	return dist;
}











}