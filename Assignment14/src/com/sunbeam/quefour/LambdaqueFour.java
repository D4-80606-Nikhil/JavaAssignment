package com.sunbeam.quefour;

import java.util.Scanner;

interface Arithmetic<T>{
	T calc(T x,T y);
}

public class LambdaqueFour {
	
	public static <T> T calculate(T numOne,T numTwo, Arithmetic<T> oper) {
		T result = null;
		result = oper.calc(numOne, numTwo);
		return result;
	}
	
	public static int menu() {
		int choice;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("0. Exit");
		System.out.println("1. Add Two Numbers");
		System.out.println("2. Subtract two Numbers");
		System.out.println("3. Multiply two Numbers");
		System.out.println("4. Divide two Numbers.");
	    choice = scn.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int menuChoice;
		while((menuChoice = menu())!=0) {
			switch(menuChoice) {
			case 0://exit
				break;
			case 1://addition
				System.out.print("\nEnter First Number : ");
				Double num1 = scn.nextDouble();
				
				System.out.print("\nEnter First Number : ");
				Double num2 = scn.nextDouble();
				
//				double result = calculate(num1,num2,new Arithmetic<Double>() {
//				public Double calc(Double x,Double y) {
//					return x+y;
//				}
//				});
				
				double result = calculate(num1,num2, (x,y) -> x+y);
				System.out.println("Result : "+result);
				break;
			case 2://subtract
				System.out.print("\nEnter First Number : ");
			    num1 = scn.nextDouble();
				
				System.out.print("\nEnter First Number : ");
				num2 = scn.nextDouble();
				
				System.out.println(calculate(num1,num2,(x,y)->x-y));
				
				break;
			case 3://multiply
				System.out.print("\nEnter First Number : ");
			    num1 = scn.nextDouble();
				
				System.out.print("\nEnter First Number : ");
				num2 = scn.nextDouble();
				
				System.out.println(calculate(num1,num2,(x,y)->x*y));
				break;
			case 4://divide
				System.out.print("\nEnter First Number : ");
			    num1 = scn.nextDouble();
				
				System.out.print("\nEnter First Number : ");
				num2 = scn.nextDouble();
				
				System.out.println(calculate(num1,num2,(x,y)->x/y));
				break;
			}
		}
        
	}

}
