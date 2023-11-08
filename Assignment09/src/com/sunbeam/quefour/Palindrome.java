package com.sunbeam.quefour;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String acb = "NitaN";
		int flag = 0;
		for(int i = 0;i<=acb.length()/2;i++) {
			
			if(acb.charAt(i) == acb.charAt(acb.length()-1-i)) {
				System.out.println(acb.charAt(i)+"  "+acb.charAt(acb.length()-1-i));
				flag = 1;
			}else {
				flag = 0;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is not ");
		}

	}

}
