package com.sunbeam.queone;

import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Factorial of 10 : "+Stream.iterate(1, e->e+1).limit(10).reduce(1,(x,y)->x*y));


	}

}
