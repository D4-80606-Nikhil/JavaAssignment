package com.sunbeam.quetwo;

import java.util.Comparator;

public class SortingAscComparator implements Comparator<Book>{

	@Override
	public int compare(Book arg0, Book arg1) {
		// TODO Auto-generated method stub
		return arg0.getIsbn().compareTo(arg1.getIsbn());
	}

}
