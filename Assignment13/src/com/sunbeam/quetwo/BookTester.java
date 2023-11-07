package com.sunbeam.quetwo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Book book = new Book();
//		book.compareTo(new Object());
		
        Set<Book> book = new HashSet<>();
        Collections.addAll(book, new Book("1A2B#Z",250,"Ajit Doval",5),
        		new Book("1A2B#Z",250,"Ajit Doval",5),
        		new Book("1A2B#Z",250,"Ajit Doval",5),
        		new Book("1A2B#Z",250,"Ajit Doval",6),
        		new Book("1A2B#Z",250,"Ajit Doval",6));
        
        Iterator<Book> itr = book.iterator();
        while(itr.hasNext()) {
        	itr.next();
        }
        for(Book ele:book) {
        	System.out.println(ele);
        }
//        System.out.println(book);
        
	}

}
