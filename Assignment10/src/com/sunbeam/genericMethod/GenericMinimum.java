package com.sunbeam.genericMethod;

public class GenericMinimum <W extends Number>{
   
//	public  W minimumNumber(W[] arr) {
//		W min  = arr[0];
//		
//		for(W ele:arr) {
//			if(min.doubleValue() > ele.doubleValue()) {
//				min = ele;
//			}
//		}
//        		
//		return min;
//	}
	
	
	public static <T extends Number> void minimumNumber(T[] arr) {
		T min = arr[0];
		
		for(T ele : arr) {
			if(min.doubleValue() > ele.doubleValue()) {
				min = ele;
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,4,5,6};
		minimumNumber(arr);
		
		Double arr1[] = {5.5,3.3,5.4,1.2,0.9};
		minimumNumber(arr1);

	}

}
