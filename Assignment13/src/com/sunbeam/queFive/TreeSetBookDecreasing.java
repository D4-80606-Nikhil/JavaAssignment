package com.sunbeam.queFive;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetBookDecreasing {

	public static void main(String ...args) {
//		Set<Book> set = new TreeSet<Book>(new Comparator<Book>() {
//			@Override
//			public int compare(Book arg0, Book arg1) {
//				// TODO Auto-generated method stub
//				return Double.compare(arg0.getPrice(), arg1.getPrice());
//			}
//		});
		
		
		TreeSet<Book> set = new TreeSet<Book>((x,y)-> -Double.compare(x.getPrice(), y.getPrice()));
		
		Collections.addAll(set, new Book("1234%6",123,"Munsi Baba",34),
				new Book("12324%6",423,"Munsi Baba",34),
				new Book("12234%6",223,"Munsi Baba",34),
				new Book("12334%6",523,"Munsi Baba",34),
				new Book("12134%6",153,"Munsi Baba",34),
				new Book("12354%6",113,"Munsi Baba",34));
	
//		set.forEach(e->System.out.println(e));
		
		Iterator<Book> itr = set.iterator();
		itr = set.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
}
