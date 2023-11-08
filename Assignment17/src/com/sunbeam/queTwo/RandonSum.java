package com.sunbeam.queTwo;

import java.util.stream.Stream;

public class RandonSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          System.out.println("Random Sum of 10 Elements : "+ Stream.generate(()->Math.random()
//        		  ).limit(10).reduce((x,y)->x+y));
		
	int x = 	Stream.iterate(1, e->(int)(Math.random()*100)).limit(10).reduce(1,(a,b)->a+b);
	System.out.println("Sum of 10 Element is : "+x);
	}

}
