package com.sunbeam.queSix;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Book,String> book = new HashMap<Book,String>();
        Scanner scn = new Scanner(System.in);
        
        Book b = new Book();
        b.accept();
        
        book.put(b, b.getIsbn());
        Book b2 = new Book();
        b2.accept();
        book.put(b2, b2.getIsbn());
        
        String st = scn.next();
        
        System.out.println(book);
        
	}

}
