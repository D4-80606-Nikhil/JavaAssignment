package com.sunbeam.Store;

public class Toy extends Products{
   String ageGroup;
   String type;
   
   public Toy() {
	// TODO Auto-generated constructor stub
}

public Toy(String ageGroup, String type,String title, double price) {
	super(title,price);
	this.ageGroup = ageGroup;
	this.type = type;
}

public final String getAgeGroup() {
	return ageGroup;
}

public final void setAgeGroup(String ageGroup) {
	this.ageGroup = ageGroup;
}

public final String getType() {
	return type;
}

public final void setType(String type) {
	this.type = type;
}


   
}
