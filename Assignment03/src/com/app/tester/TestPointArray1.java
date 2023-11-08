package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	
	public static void main(String args[]) {
		System.out.println("Enter the number of Points you want to plot : ");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		
		Point2D[] p=new Point2D[index]; 
		
		for(int i=0;i<index;i++ ) {
			p[i]=new Point2D();
			p[i].accept();
		}
		
		String s="Enter Correspnding Digit: \n"
				+"1.Display Specific Point.!\n"
				+"2.Display All points.!\n"
				+"3.Calculate Distance between Two point.!\n"
				+"4.Exit.!!!"
		;
		
		
		
		
		int h=0;
		while(h!=4) {
			System.out.println(s);
			h=sc.nextInt();
			switch(h) {
			case 1:
				// System.out.println();
				System.out.println("Enter Index of point");
				int q=sc.nextInt();
				if(q>0 && q<=index) {
				p[q-1].display();}else {
					System.out.println("Invalid Index. Plz enter value from 1 to "+index);
				}
				
				break;
			case 2:
				for(int i=0;i<index;i++ ) {
					p[i].display();;
				}
				break;
			case 3:
				System.out.println("Enter Index of point1");
				int i1=sc.nextInt();
				System.out.println("Enter Index of point2");
				int i2=sc.nextInt();
				
				if(i1>0&&i1<=index && i2>0&&i2<=index) {
					if(i1==i2) {
						System.out.println("Equal points..");
						break;
					}
					p[i1-1].getDistance(p[i2-1]);
				} else {
					System.out.println("Invalid Index. Plz enter value from 1 to "+index);
				}
				
				
				
				break;
			case 4:
				System.out.println("<Thanks>");
				break;
			default:
				System.out.println("Invalid Digit, Enter valid digit");
				break;
				
			}
		}
		
		
	}
	

}
