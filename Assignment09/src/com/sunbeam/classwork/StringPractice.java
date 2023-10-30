package com.sunbeam.classwork;

public class StringPractice {
   public static void main(String ...args) {
////	   StringBuffer s1 = new StringBuffer("Sunbeam");
////	   StringBuffer s2 = new StringBuffer("Sunbeam");
////	   System.out.println(s1==s2); //false
////	   System.out.println(s1.equals(s2)); //false
////	   
//	   
//	   String s1 = new String("Sunbeam");
////	   String s2 = "Sunbeam";
//	   StringBuffer s2 = new StringBuffer("Sunbeam");
//	   System.out.println(s1.equals(s2)); //false
//	   System.out.println(s2.toString()); //Sunbeam
//	   System.out.println(s1.equals(s2.toString())); //true
	   
//	   StringBuffer s1 = new StringBuffer("Sunbeam");
//	   StringBuffer s2 = s1.reverse();
//	   System.out.println(s1==s2); // true
//	   System.out.println(s1);  //toString is overridden in StringBuffer
//	   System.out.println(s1.equals(s2)); //true
	   
//	   StringBuilder s1 = new StringBuilder("Sunbeam");
//	   StringBuilder s2 = new StringBuilder("Sunbeam");
//	   System.out.println(s1 == s2); //false
//	   System.out.println(s1.equals(s2)); //false
	   
	   StringBuffer s = new StringBuffer();
	   System.out.println("Capacity : "+s.capacity()+", Length : "+s.length()); // Capacity : 16, Length : 0
	   s.append("1234567890");
	   System.out.println("Capacity : "+s.capacity()+", Length : "+s.length()); // Capacity : 16, Length : 10
	   s.append("ABCDEFGHIJKLMNOPQRSTUV");
	   System.out.println("Capacity : "+s.capacity()+", Length : "+ s.length()); // Capacity : 34, Length : 32
	   
	   
	   
   }
}
