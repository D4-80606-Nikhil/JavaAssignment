package com.sunbeam.Cricket;
import java.util.Objects;
import java.util.Scanner;

public abstract class Player {
   int id;
   String name;
   int age;
   int matchesPlayed; 
   
   public Player() {
}

public Player(int id, String name, int age, int matchesPlayed) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.matchesPlayed = matchesPlayed;
}

public void accept(){
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter Id :");
	id = scn.nextInt();
	
	System.out.print("\nEnter Name : ");
	name = scn.nextLine();
	
	System.out.print("\nEnter Age : ");
	age = scn.nextInt();
	
	System.out.print("\nEnter Matches Played : ");
	matchesPlayed = scn.nextInt();
	
}

@Override
	public boolean equals(Object obj) {
	 Player p = (Player)obj;
		return this.id == p.id;
	}
  
}
