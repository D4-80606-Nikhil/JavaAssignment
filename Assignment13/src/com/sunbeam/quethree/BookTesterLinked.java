package com.sunbeam.quethree;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.sunbeam.quetwo.*;

public class BookTesterLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Book> book = new LinkedHashSet<>();
        Collections.addAll(book, new Book("1A2B#Z",250,"Ajit Doval",5),
        		new Book("1A2B#Z",250,"Ajit Doval",5),
        		new Book("1A2B#Z",250,"Ajit Doval",5),
        		new Book("1A2B#Z",250,"Ajit Doval",5),
        		new Book("1A2B#Z",250,"Ajit Doval",6),
        		new Book("1234D#D",560,"Prem Chand",6));
//        
//        Iterator<Book> itr = book.iterator();
//        while(itr.hasNext()) {
//        	System.out.println(itr.next());
//        }
        
        book.forEach(c->System.out.println(c));
        
//        for(Book ele:book) {
//        	System.out.println(ele);
//        }
//        System.out.println(book);
	}

}
