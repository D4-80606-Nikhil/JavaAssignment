package com.sunbeam.quethree;

import java.util.function.Predicate;

public class LambdaQuesThree {

	public static int countIf(String[] arr, Predicate<String> cond) {
		
		int count = 0;
		for(String str:arr) {
			if(cond.test(str)) {
				count++;
			}
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"Nilesh","Prajwal","Shubham","Prateek","Nikhil","Mridul",
				"Pramit","Sneha"
		};
		
		
		int count = countIf(arr,new Predicate<String>(){
			public boolean test(String s) {
				return s.length()>6;
			}
		});
		
		System.out.println("Count using Anonymous Class : "+count);
		
		System.out.println("Count using Lambda expression : "+countIf(arr,s-> s.length()>6));

}
}
