package com.sunbeam.quethree;

import java.util.stream.IntStream;

public class Intstream {
   
	public static void main(String ...args) {
		
		System.out.println("All Details : "+ IntStream.iterate(1, e->e+1).limit(10).summaryStatistics());
	}
}
