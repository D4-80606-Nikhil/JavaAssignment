package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        
        Collections.addAll(list, "Heelo","I am ","Nikhil "," Your Name "," is ");
        
//        list.forEach(System.out::println);
        
//        for(String ele: list) {
//        	System.out.println(ele);
//        }
//        
//        list.add(0, "i am First");
//        
//        list.remove(0);
//        list.add(0,"hello i am replaced");
//        
//        int index = list.indexOf("heelo");
//        
//        if(index == -1) {
//        	System.out.println("notfound");
//        	}
//        else {
//        	list.remove(index);
//        list.add(index, "PPPPPP");
//        }
//        
//        
//        
//        System.out.println(list);
        
//         System.out.print( list.get(3));
         
         
       List<Integer> listOfInteger = new ArrayList<Integer>();
       
       List<Integer> listone = new ArrayList<>();
       
       Collections.addAll(listone, 23,1,2,3,4,5,50);
       
       listOfInteger.addAll(listone);
       
//       System.out.println(listOfInteger);
       
//       int index = listOfInteger.indexOf(3);
//       
//       int ca = listOfInteger.get(3);
//       
//              listOfInteger.remove((Integer)3);
//       
//         System.out.println(listOfInteger);
         
       
       if(list.contains("Heelo")){
    	   list.indexOf("Heelo");
       }
         
       listOfInteger.sort((x,y)-> x - y);
       
       System.out.println(listOfInteger);
         
//        System.out.println(a);
        
//        Iterator<String> itr = list.iterator();
//        
//        while(itr.hasNext()) {
//        	
//        }
	}

}
