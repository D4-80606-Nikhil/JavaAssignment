package com.sunbeam.quefour;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.quetwo.Book;

public class TreeSetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Book> book = new TreeSet<Book>();
		
		Collections.addAll(book,
				new Book("123$3",450,"Dev",46),
				new Book("1A2B#Z",250,"Ajit Doval",5),
        		new Book("1A2B#Z",250,"Ajit Doval",6),
        		new Book("1234D#D",560,"Prem Chand",6),
        		new Book("123$3",450,"Dev",45));
		
		
		
		book.forEach(e->System.out.println(e));

	}

}
