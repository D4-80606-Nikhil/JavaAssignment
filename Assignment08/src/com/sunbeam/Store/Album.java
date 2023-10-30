package com.sunbeam.Store;

public class Album extends Products{
    String singer;
    String musician;
    
    public Album() {
		// TODO Auto-generated constructor stub
	}

	public Album(String singer, String musician,String title, double price) {
		super(title,price);
		this.singer = singer;
		this.musician = musician;
	}
    
    
}
