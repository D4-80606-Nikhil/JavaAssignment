package com.sunbeam.queSix;

interface Check<T>{
	boolean compare(T x,T y);
}

public class LambdaQueSix {
	
	public static <T> int countIf(T[] arr,T key, Check<T> c) {
		int count=0;
		
		for(T ele:arr) {
		if(c.compare(ele,key)){
			count++;
		}
		}
		
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Double [] arr = {44.0, 77.2, 99.3, 22.4, 55.5, 66.2,22.4,44.0};
        
        int count = countIf(arr,44.0,(x, y)-> x.equals(y));
        
        System.out.println("Duplicate Element : "+count);
		
	}

}
