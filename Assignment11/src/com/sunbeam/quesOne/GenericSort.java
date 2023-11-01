package com.sunbeam.quesOne;

import java.util.Comparator;

public class GenericSort {
	
	static <T> void selectionSort(T[] arr,Comparator<T> c){
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
			if(c.compare(arr[i], arr[j]) > 0) {
			T temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
			}
		}
	}
	
   public static void main(String ...args) {
	   Double []arr = {1.2,3.2,4.1,1.1,7.8,9.2,2.4,5.3};
	   System.out.println("Before Sort: ");
	   for(Double ele:arr) {
		   System.out.print(" "+ele+" ");
	   }
	   System.out.println("");
	   
	   class doubleSort implements Comparator<Double>{

		@Override
		public int compare(Double arg0, Double arg1) {
			// TODO Auto-generated method stub
			int diff = Double.compare(arg0, arg1);
			return diff;
		}
		   
	   }
	   
	   doubleSort d1 = new doubleSort();
	   selectionSort(arr,d1);
	   System.out.println("After Sort: ");
	   for(Double ele:arr) {
		   System.out.print(" "+ele+" ");
	   }
	   
	   
	   
   }
}
