package com.sunbeam.StringConversions;

public class AllStringOperations {
	public static void main(String ...args) {
		String s = "this is String";
		String []arr = s.split(" ");
		for(String str :arr) {
			System.out.print(str.charAt(0));
		}
		
		
		for(String str:arr) {
			System.out.print(Character.toUpperCase(str.charAt(0))+str.substring(1, str.length())+" ");
		}
		
		
		
		
	}

}
