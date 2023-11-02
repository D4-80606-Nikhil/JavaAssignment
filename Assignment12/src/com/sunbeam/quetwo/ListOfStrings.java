package com.sunbeam.quetwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfStrings {
   public static void main(String ...args) {
	   List<String> list = new ArrayList<>();
	   list.add("hello");
	   list.add("I ");
	   list.add("am");
	   list.add("Nikhil ");
	   list.add("P");
	   list.add("amp");
	   
	   class MaxLengthComparator implements Comparator<String>{

		@Override
		public int compare(String arg0, String arg1) {
			// TODO Auto-generated method stub
			return arg0.length() - arg1.length();
		}
		   
	   }
	   
	   System.out.print(Collections.max(list,new MaxLengthComparator()));
   }
}
