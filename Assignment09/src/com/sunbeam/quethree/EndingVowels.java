package com.sunbeam.quethree;

public class EndingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String ab = "Nikhila asasa";
	        
	        if(ab.lastIndexOf("a")==ab.length()-1||ab.lastIndexOf("e")==ab.length()-1||
	        		ab.lastIndexOf("i")==ab.length()-1||ab.lastIndexOf("o")==ab.length()-1||ab.lastIndexOf("u")==ab.length()-1) {
	        	System.out.println("It is vowel Ending String");
	        }else {
	        	System.out.println("It is not");
	        }
	}

}
