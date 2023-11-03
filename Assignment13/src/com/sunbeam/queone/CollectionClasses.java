package com.sunbeam.queone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = new ArrayList<>(); //Duplicates are allowed
//		Collection<String> c = new HashSet<>(); //Duplicates not allowed
//		Collection<String> c = new LinkedHashSet<>(); //duplicated not allowed and maintains order
//		Collection<String> c = new TreeSet<>(); //Duplicates not allowed and null not allowed in treeset
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
